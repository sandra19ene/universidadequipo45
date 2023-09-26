
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
import universidadejemplo.entidades.Materia;

public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre,año,estado)"
                + "VALUE(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia" + ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminado exitosamente");
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex.getMessage());
        }
    }
    
    
  
public void modificarEstadoMateria(int idMateria, String nombre, boolean nuevoEstado) {
    String sql = "UPDATE materia SET estado=?, nombre=? WHERE idMateria=?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setBoolean(1, nuevoEstado);
        ps.setString(2, nombre);
        ps.setInt(3, idMateria);

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Estado de la materia modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el estado de la materia");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());
    }
}
  
    
    public Materia buscarMateriaId(int idMateria) {

        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria=?";
        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
        }
        return materia;


    }   

   public Materia buscarMateria( String nombre) {
    String sql = "SELECT *FROM materia WHERE nombre=? ";
    Materia materia = null;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(nombre);
            materia.setAño(rs.getInt("año"));
            materia.setEstado(rs.getBoolean("estado"));
        } else {
            JOptionPane.showMessageDialog(null, "La materia no existe");
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
    }
    return materia;
}

    
    
     public List<Materia> listarNomMateria() {

        String sql = "SELECT nombre FROM materia WHERE estado=1";
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Materia materia=new Materia();
                
                materia.setNombre(rs.getString("nombre"));
//               
                
                materias.add(materia);

           

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos" + ex.getMessage());
        }
        return materias;
    }
}