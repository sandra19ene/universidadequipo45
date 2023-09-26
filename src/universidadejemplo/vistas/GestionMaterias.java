package universidadejemplo.vistas;

import javax.swing.JOptionPane;
import universidadejemplo.accesoADatos.MateriaData;
import universidadejemplo.entidades.Materia;

public class GestionMaterias extends javax.swing.JInternalFrame {

    public boolean activo = false;

    public GestionMaterias() {
        initComponents();
        
        
        jbGuardarMateria.setEnabled(false);
        
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtNombreMateria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtAnioMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonEstadoMateria = new javax.swing.JRadioButton();
        jbNuevoMateria = new javax.swing.JButton();
        jbEliminarMateria = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jbSalirMateria = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(java.awt.Color.black);
        setTitle("Gestion de Materias");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("MATERIAS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jtCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jbBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtNombreMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jtAnioMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jRadioButtonEstadoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoMateriaActionPerformed(evt);
            }
        });

        jbNuevoMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevoMateria.setText("Nuevo");
        jbNuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMateriaActionPerformed(evt);
            }
        });

        jbEliminarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminarMateria.setText("Eliminar");
        jbEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMateriaActionPerformed(evt);
            }
        });

        jbGuardarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGuardarMateria.setText("Guardar");
        jbGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMateriaActionPerformed(evt);
            }
        });

        jbSalirMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalirMateria.setText("Salir");
        jbSalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMateriaActionPerformed(evt);
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
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonEstadoMateria)
                                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbNuevoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbEliminarMateria)
                                .addGap(44, 44, 44)
                                .addComponent(jbGuardarMateria))
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jbSalirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonEstadoMateria)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoMateria)
                    .addComponent(jbEliminarMateria)
                    .addComponent(jbGuardarMateria)
                    .addComponent(jbSalirMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMateriaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirMateriaActionPerformed

    private void jbGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMateriaActionPerformed
        // TODO add your handling code here:

        int codigo = Integer.parseInt(jtCodigo.getText());
        String nombre= jtNombreMateria.getText();
        if (jRadioButtonEstadoMateria.isSelected()) {

            boolean activo = true;

            MateriaData mat = new MateriaData();
            mat.modificarEstadoMateria(codigo,nombre,activo);

            jtCodigo.setText("");
            jtNombreMateria.setText("");
            jtAnioMateria.setText("");
            jRadioButtonEstadoMateria.setSelected(false);
            jbNuevoMateria.setEnabled(true);
            jtCodigo.setEditable(true);
            jbGuardarMateria.setEnabled(false);

        }
    }//GEN-LAST:event_jbGuardarMateriaActionPerformed

    private void jbEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMateriaActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(jtCodigo.getText());

        MateriaData mat = new MateriaData();
        mat.eliminarMateria(codigo);
        jtCodigo.setText("");
        jtNombreMateria.setText("");
        jtAnioMateria.setText("");
        jbNuevoMateria.setEnabled(true);
        jRadioButtonEstadoMateria.setSelected(false);
        jbGuardarMateria.setEnabled(false);

    }//GEN-LAST:event_jbEliminarMateriaActionPerformed

    private void jbNuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMateriaActionPerformed

        if (!validarId(jtCodigo.getText(), jtNombreMateria.getText())) {
            JOptionPane.showMessageDialog(null, "ERROR Ingrese los datos correctamente");
            jtNombreMateria.setText("");
            jtCodigo.setText("");
        } else {

            String nombreMat = jtNombreMateria.getText();
            int AnioCurso = Integer.parseInt(jtAnioMateria.getText());
            
           
            if (jRadioButtonEstadoMateria.isSelected()) {

                boolean activo = true;

                Materia materia = new Materia(nombreMat, AnioCurso, activo);
                MateriaData mat = new MateriaData();
                mat.guardarMateria(materia);
                LimpiarCampos();

            }
        }

    }//GEN-LAST:event_jbNuevoMateriaActionPerformed

    private void jRadioButtonEstadoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoMateriaActionPerformed

        // TODO add your handling code here:
        jtNombreMateria.setEnabled(true);
        jtAnioMateria.setEnabled(true);

       // jbGuardarMateria.setEnabled(true);


    }//GEN-LAST:event_jRadioButtonEstadoMateriaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        boolean r = false;

        MateriaData mat = new MateriaData();

        if (!validarId(jtCodigo.getText().trim(), jtNombreMateria.getText())) {
            JOptionPane.showMessageDialog(null, "ERROR Ingrese los datos correctamente");
            jtNombreMateria.setText("");
            jtCodigo.setText("");
        } else {

            if (jtCodigo.getText().equals("")) {

                String nombre = jtNombreMateria.getText();
                Materia encontrada = mat.buscarMateria(nombre);

                if (encontrada.isEstado() == r) {
                    jtCodigo.setText(encontrada.getIdMateria() + "");
                    jtNombreMateria.setText(encontrada.getNombre());
                    jtAnioMateria.setText(encontrada.getAño() + "");
                    
                    jtNombreMateria.setEnabled(false);
                    jtAnioMateria.setEnabled(false);
                    jRadioButtonEstadoMateria.setSelected(false);
                    jbNuevoMateria.setEnabled(false);
                    jbGuardarMateria.setEnabled(true);
                } else {

                    jtCodigo.setText(encontrada.getIdMateria() + "");
                    jtNombreMateria.setText(encontrada.getNombre());
                    jtAnioMateria.setText(encontrada.getAño() + "");

                    jbGuardarMateria.setEnabled(true);
                  
                    jbNuevoMateria.setEnabled(false);
                }

            } else {

                int codigo = Integer.parseInt(jtCodigo.getText());
                Materia encontrada = mat.buscarMateriaId(codigo);

                if (encontrada.isEstado() == r) {
                    jtNombreMateria.setText(encontrada.getNombre());
                    jtAnioMateria.setText(encontrada.getAño() + "");

                    jbGuardarMateria.setEnabled(true);
                    jtNombreMateria.setEnabled(false);
                    jtAnioMateria.setEnabled(false);
                    jRadioButtonEstadoMateria.setSelected(false);
                    jbNuevoMateria.setEnabled(false);
                    jtCodigo.setEditable(false);
                } else {
                    jtNombreMateria.setText(encontrada.getNombre());
                    jtAnioMateria.setText(encontrada.getAño() + "");

                    jbGuardarMateria.setEnabled(true);
                    jRadioButtonEstadoMateria.setSelected(true);
                    jbNuevoMateria.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        LimpiarCampos();
        jRadioButtonEstadoMateria.setSelected(false);   
        jtCodigo.setEditable(true);
        jbGuardarMateria.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed
    public static boolean validarId(String id, String nom) {

        if (id.equals("")) {
            return nom.matches("[a-zA-Z\\s-]*");  //coloque (\\s-) para que me permita colocar un espacio
        }
        return id.matches("[0-9]*");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonEstadoMateria;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminarMateria;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevoMateria;
    private javax.swing.JButton jbSalirMateria;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {

        jtCodigo.setText("");
        jtNombreMateria.setText("");
        jtAnioMateria.setText("");
        jtNombreMateria.setEnabled(true);
        jRadioButtonEstadoMateria.setSelected(false);
        jbNuevoMateria.setEnabled(true);
        jbGuardarMateria.setEnabled(false);
    }
}
