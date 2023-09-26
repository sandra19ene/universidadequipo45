package universidadejemplo.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadejemplo.entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)"
                + "VALUE(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"El alumno ya existe");

        }

    }

    

    
    public void modificarAlumno(Alumno alumno) {
    String obtenerIdAlumnoSQL = "SELECT idAlumno FROM alumno WHERE dni=?";
    String actualizarDatosSQL = "UPDATE alumno SET apellido=?, nombre=?, fechaNacimiento=?, estado=? WHERE idAlumno=?";
    
    try {
        // Obtener el ID del alumno a partir del DNI
        PreparedStatement obtenerIdPs = con.prepareStatement(obtenerIdAlumnoSQL);
        obtenerIdPs.setInt(1, alumno.getDni());
        ResultSet resultSet = obtenerIdPs.executeQuery();
        
        if (resultSet.next()) {
            int idAlumno = resultSet.getInt("idAlumno");
            
            // Actualizar los datos del alumno
            PreparedStatement actualizarDatosPs = con.prepareStatement(actualizarDatosSQL);
            actualizarDatosPs.setString(1, alumno.getApellido());
            actualizarDatosPs.setString(2, alumno.getNombre());
            actualizarDatosPs.setDate(3, Date.valueOf(alumno.getFechaNacimiento()));
            actualizarDatosPs.setBoolean(4, alumno.isEstado());
            actualizarDatosPs.setInt(5, idAlumno);
            
            int exito = actualizarDatosPs.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un alumno con ese DNI");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos: " + ex.getMessage());
    }
}
    
    
    
    public void eliminarAlumno(int dni) {

        String sql = "UPDATE alumno SET estado=0 WHERE dni= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado exitosamente");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());

        }

    }

    public Alumno buscarAlumnoPorId(int id) {

        String sql = "SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE idAlumno=? AND estado=1";
        Alumno alumno = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
        }
        return alumno;
    }

    public Alumno BuscarAlumnoProDni(int dni) {

        String sql = "SELECT idAlumno,apellido,nombre,fechaNacimiento,estado FROM alumno WHERE dni=?  ";
        Alumno alumno = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni((dni));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");


            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
        }
        return alumno;

    }

    public List<Alumno> listarAlumnos() {

        String sql = "SELECT idAlumno,dni,apellido,nombre,fechaNacimiento FROM alumno WHERE estado=1";
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

                alumnos.add(alumno);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
        }
        return alumnos;
    }

    //----------------------------------------------------------------------------------------
    //probando
//    
//    public Alumno BuscarAlumnoProDni(int dni){
//    
//      String sql = "SELECT idAlumno,apellido,nombre,fechaNacimiento FROM alumno WHERE dni=?,estado=1";
//        Alumno alumno = null;
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, dni);
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                alumno = new Alumno();
//                alumno.setIdAlumno(rs.getInt("idAlumno"));
//                alumno.setDni((dni));
//                alumno.setApellido(rs.getString("apellido"));
//                alumno.setNombre(rs.getString("nombre"));
//                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
//                alumno.setEstado(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "El alumno no existe");
//
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
//        }
//        return alumno;
//    
//    
//    }
//    
}
