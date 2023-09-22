package universidadejemplo;

import java.sql.Date;
import java.time.LocalDate;
import universidadejemplo.accesoADatos.AlumnoData;
import universidadejemplo.accesoADatos.InscripcionData;
import universidadejemplo.accesoADatos.MateriaData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;
import universidadejemplo.vistas.Menu_Principal;

public class UniversidadEjemplo {

    public static void main(String[] args) {
        
        Menu_Principal menu =new Menu_Principal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        

       // Alumno juan = new Alumno(1,22036921, "Marotte", "Julian", LocalDate.of(2002, 9, 10), true);
        //  AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(juan);
      //  alu.modificarAlumno(juan);
//        alu.eliminarAlumno(1);
//
//        Alumno alumnoEncontrado = alu.BuscarAlumnoProDni(23456789);
//        System.out.println(alumnoEncontrado.getDni());
//        System.out.println(alumnoEncontrado.getApellido());
//        System.out.println(alumnoEncontrado.getNombre());
//        System.out.println(alumnoEncontrado.getFechaNacimiento());
////
//        Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(22036921);
//        System.out.println(alumnoEncontrado);
//        Alumno alumnoEncontrado = alu.buscarAlumnoPorId(5);
//        System.out.println(alumnoEncontrado);
//        System.out.println(alu.buscarAlumnoPorId(5));
       
//        for (Alumno alumno : alu.listarAlumnos()) {
//
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNacimiento());
//
//        }
//
//       InscripcionData ins = new InscripcionData();
//      String ma="biologia";
//       for(Alumno alumno : ins.obtenerAlumnnoXMateria(ma) ){
//          
//           System.out.println(alumno.getIdAlumno());
//           System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNacimiento());
//            System.out.println(alumno.isEstado());
//       
//       }

//boolean r = true;
    
   // int documento = Integer.parseInt(jtDocumento.getText());
    
   
//    Alumno encontrado = alu.BuscarAlumnoProDni(23456789 );
//    boolean bo=true;
//   
//    if (encontrado.isEstado()==bo) {
//      
//             System.out.println("true");
//            System.out.println(encontrado.getApellido());
//            System.out.println(encontrado.getNombre());
//
//        
//         
//    } else {
//       System.out.println("false");
//         System.out.println(encontrado.getApellido());
//            System.out.println(encontrado.getNombre());

//    }
      //  System.out.println("activo :"+encontrado.isEstado());
    
      
      
      
//       InscripcionData ins = new InscripcionData();
//      int ma=6;
//       for(Inscripcion i : ins.obtenerInscripciones(ma) ){
//          
//           System.out.println(i.getMateria());
//           System.out.println("nota:"+i.getNota());
//           System.out.println(i.getIdInscripcion());
//           
//           System.out.println(i.toString());
//       
//       }
      
      
      
      
      
      
    }                                                 


            
            
       

    
}
