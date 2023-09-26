
package universidadejemplo.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;


public class InscripcionData {
    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(int idAlumno, int idMateria){
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "VALUE(null,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
//            ps.executeUpdate();
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (exito==1) {  
                JOptionPane.showMessageDialog(null, "Inscripción exitosa.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripción'. " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<Inscripcion>();
        
        try {
            String sql = "SELECT idInscripcion, nota, alumno.apellido, materia.nombre FROM inscripcion JOIN alumno ON alumno.idAlumno=inscripcion.idAlumno JOIN materia ON materia.idMateria=inscripcion.idMateria";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Inscripcion inscripcion;
            
            while (rs.next()) {                
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                
                Alumno alumno= new Alumno();
                alumno.setApellido(rs.getString("apellido"));
                inscripcion.setAlumno(alumno);
                
                Materia materia = new Materia();
                materia.setNombre(rs.getString("nombre"));
                inscripcion.setMateria(materia);
                
                listaInscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return listaInscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        String sql = "SELECT inscripcion.idInscripcion, alumno.apellido FROM inscripcion JOIN alumno ON alumno.idAlumno=inscripcion.idAlumno WHERE inscripcion.idAlumno=?";
        Inscripcion inscripcion = null;
        
        ArrayList<Inscripcion> inscriptos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                inscripcion = new Inscripcion();
                Alumno alumno = new Alumno();
                
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                
                alumno.setApellido(rs.getString("apellido"));
                inscripcion.setAlumno(alumno);

                inscriptos.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return inscriptos;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno) { //lista las materias de determinado alumno mediante el idAlumno.

        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON inscripcion.idMateria=materia.idMateria WHERE inscripcion.idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                listaMaterias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return listaMaterias;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){ //lista las materias NO cursads de determinado alumno mediante el idAlumno.
        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        
        try {
            String sql = "SELECT * FROM materia WHERE estado =1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                
                listaMaterias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla 'inscripcion': "+ex.getMessage());
        }
        return listaMaterias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
//            ps.executeUpdate();
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripción eliminada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla 'inscripcion'" + ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota guardada!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción. " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnnoXMateria(int idMateria){ //Mediante idMateria obtener los alumnos que cursan esa materia
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        
        try {
            String sql = "SELECT alumno.apellido, materia.nombre FROM inscripcion JOIN materia ON materia.idmateria=inscripcion.idMateria JOIN alumno ON alumno.idAlumno=inscripcion.idAlumno WHERE materia.idMateria=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setApellido(rs.getString("apellido"));

                listaAlumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return listaAlumnos;
        
    }
    
    public List<Inscripcion> obtenerInscripcionesNotas(int idAlumno){
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<Inscripcion>();
        
        try {
            String sql = "SELECT inscripcion.idMateria, materia.nombre, nota  FROM inscripcion JOIN alumno ON alumno.idAlumno=inscripcion.idAlumno JOIN materia ON materia.idMateria=inscripcion.idMateria WHERE inscripcion.idAlumno=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            Inscripcion inscripcion;
            
            while (rs.next()) {                
                inscripcion = new Inscripcion();
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                
                materia.setNombre(rs.getString("nombre"));
                inscripcion.setMateria(materia);
                
                inscripcion.setNota(rs.getDouble("nota"));

                listaInscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return listaInscripciones;
    }
    
    
    
     public List<Alumno> obtenerAlumnnoXMateria(String nombre){
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        
        try {
            String sql = "SELECT alumno.idAlumno,alumno.dni,alumno.apellido,alumno.nombre,alumno.FechaNacimiento "
                    + "FROM inscripcion JOIN materia ON materia.idmateria=inscripcion.idMateria"
                    + " JOIN alumno ON alumno.idAlumno=inscripcion.idAlumno WHERE materia.nombre=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                //alumno.setEstado(true);
                listaAlumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inscripcion': " + ex.getMessage());
        }
        return listaAlumnos;
        
    }

}
