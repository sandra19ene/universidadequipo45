package universidadejemplo.vistas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadejemplo.accesoADatos.AlumnoData;
import universidadejemplo.entidades.Alumno;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    public GestionAlumnos() {
        initComponents();
        
        jbGuardarAlumno.setEnabled(false);
        jtDocumento.setEditable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jbGuardarAlumno = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscarAlumnoDni = new javax.swing.JButton();
        jbNuevoAlumno = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setForeground(new java.awt.Color(153, 204, 255));
        setTitle("Gestion de Alumnos");
        setAlignmentX(2.0F);
        setAlignmentY(2.0F);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Documento");

        jtDocumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jtApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jRadioButtonEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonEstadoMouseClicked(evt);
            }
        });
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jbGuardarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGuardarAlumno.setText("Guardar");
        jbGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarAlumnoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscarAlumnoDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbBuscarAlumnoDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jbBuscarAlumnoDni.setText("Buscar");
        jbBuscarAlumnoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarAlumnoDniActionPerformed(evt);
            }
        });

        jbNuevoAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbNuevoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbBuscarAlumnoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(124, 124, 124))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonEstado)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jbGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEliminar)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscarAlumnoDni))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonEstado)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNuevoAlumno)
                            .addComponent(jbEliminar)
                            .addComponent(jbGuardarAlumno)
                            .addComponent(jbSalir))))
                .addGap(18, 18, 18)
                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        // TODO add your handling code here:
        int docu = Integer.parseInt(jtDocumento.getText());

        AlumnoData alu = new AlumnoData();
        alu.eliminarAlumno(docu);
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");

        jDateFechaNacimiento.setDate(null);
        jtDocumento.setEditable(true);
        jbNuevoAlumno.setEnabled(true);
        jRadioButtonEstado.setSelected(false);
        jbGuardarAlumno.setEnabled(false);

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jRadioButtonEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoMouseClicked
        // TODO add your handling code here:
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jDateFechaNacimiento.setEnabled(true);
       // jbGuardarAlumno.setEnabled(true);

    }//GEN-LAST:event_jRadioButtonEstadoMouseClicked

    private void jbBuscarAlumnoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarAlumnoDniActionPerformed

        boolean r = false;

        if (!jtDocumento.getText().matches("[0-9]*")) {

            JOptionPane.showMessageDialog(null, "Debe ingresar el documento");
            jtDocumento.setText("");
        }
        int documento = Integer.parseInt(jtDocumento.getText());

        AlumnoData alu = new AlumnoData();
        Alumno encontrado = alu.BuscarAlumnoProDni(documento);

        if (encontrado.isEstado() == r) {

            jtDocumento.setEditable(false);

            jtApellido.setText(encontrado.getApellido());
            jtNombre.setText(encontrado.getNombre());
            Date sqldate = Date.valueOf(encontrado.getFechaNacimiento());
            jDateFechaNacimiento.setDate(sqldate);

            jtApellido.setEnabled(false);
            jtNombre.setEnabled(false);
            jDateFechaNacimiento.setEnabled(false);
            jbGuardarAlumno.setEnabled(true);
            jbNuevoAlumno.setEnabled(false);
            jbEliminar.setEnabled(false);
            jRadioButtonEstado.setSelected(false);

        } else {
            jtDocumento.setEditable(false);

            jtApellido.setText(encontrado.getApellido());
            jtNombre.setText(encontrado.getNombre());
            Date sqldate = Date.valueOf(encontrado.getFechaNacimiento());
            jDateFechaNacimiento.setDate(sqldate);
            jbGuardarAlumno.setEnabled(true);
            jbNuevoAlumno.setEnabled(false);
            jRadioButtonEstado.setSelected(true);

        }


    }//GEN-LAST:event_jbBuscarAlumnoDniActionPerformed

    private void jbGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarAlumnoActionPerformed

        int documento = Integer.parseInt(jtDocumento.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        boolean activo = jRadioButtonEstado.isSelected();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String fe = date.format(jDateFechaNacimiento.getDate());
        LocalDate fecha = LocalDate.parse(fe);

        Alumno compa = new Alumno(documento, apellido, nombre, fecha, activo);

        AlumnoData alu = new AlumnoData();
        alu.modificarAlumno(compa);

        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jDateFechaNacimiento.setDate(null);
        jbNuevoAlumno.setEnabled(true);
        jRadioButtonEstado.setSelected(false);
        jtDocumento.setEditable(true);
         jbGuardarAlumno.setEnabled(false);

    }//GEN-LAST:event_jbGuardarAlumnoActionPerformed

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed

        // TODO add your handling code here:
        if (jtDocumento.getText().isEmpty() || !jtDocumento.getText().matches("[0-9]*")) {

            JOptionPane.showMessageDialog(null, "Debe ingresar el documento correctamente");
            jtDocumento.setText("");
        } else {

            if (jtApellido.getText().isEmpty() || !jtApellido.getText().matches("[a-zA-Z]*")) {

                JOptionPane.showMessageDialog(null, "Debe ingresar el Apellido correctamente");
                jtApellido.setText("");
            } else {
                if (jtNombre.getText().isEmpty() || !jtNombre.getText().matches("[a-zA-Z]*")) {

                    JOptionPane.showMessageDialog(null, "Debe ingresar el Nombre correctamente");
                    jtNombre.setText("");
                } else {

                    int documento = Integer.parseInt(jtDocumento.getText());
                    String apellido = jtApellido.getText();
                    String nombre = jtNombre.getText();
                    boolean activo = jRadioButtonEstado.isSelected();

                    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                    String fe = date.format(jDateFechaNacimiento.getDate());
                    LocalDate fecha = LocalDate.parse(fe);

                    Alumno compa = new Alumno(documento, apellido, nombre, fecha, activo);
                    AlumnoData alu = new AlumnoData();
                    alu.guardarAlumno(compa);

                    jtDocumento.setText("");
                    jtApellido.setText("");
                    jtNombre.setText("");
                    jDateFechaNacimiento.setDate(null);
                    jRadioButtonEstado.setSelected(false);
                }
            }
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        // TODO add your handling code here:
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtDocumento.setEditable(true);
        jDateFechaNacimiento.setDate(null);
        jbNuevoAlumno.setEnabled(true);
        jRadioButtonEstado.setSelected(false);
        jbGuardarAlumno.setEnabled(false);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JButton jbBuscarAlumnoDni;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardarAlumno;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

}
