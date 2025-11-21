
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class RegistrarVentas extends javax.swing.JInternalFrame {

    
    public RegistrarVentas() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldProducto = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldExistencia = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Total a pagar:");

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Existencia del producto:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombre del producto:");

        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cantidad de producto:");

        jButtonGuardar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonGuardar.setText("Agregar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Precio unitario:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nombre del cliente:");

        jButtonEditar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEditar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTextFieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteActionPerformed(evt);
            }
        });
        jTextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyTyped(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldExistenciaActionPerformed(evt);
            }
        });

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Categoría del producto:");

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Producto", "Código", "Categoría", "Cantidad", "Existencia", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Código del producto:");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProducto)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExistencia)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCantidad)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCategoria)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrecio)))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if ((jTextFieldProducto.getText().contentEquals(""))||
            (jTextFieldCliente.getText().contentEquals(""))||
            (jTextFieldCategoria.getText().contentEquals(""))||
            (jTextFieldExistencia.getText().contentEquals(""))||
            (jTextFieldCantidad.getText().contentEquals(""))||
            (jTextFieldPrecio.getText().contentEquals(""))||
            (jTextFieldTotal.getText().contentEquals("")))   {
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios", "¡Revise todos los campos!",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }
    private void jTextFieldProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteActionPerformed

    private void jTextFieldClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyTyped
        char car = evt.getKeyChar(); //Validación
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
            && car != 'á'
            && car != 'é'
            && car != 'í'
            && car != 'ó'
            && car != 'ú'
            && car != 'ü'
            && car != 'Á'
            && car != 'É'
            && car != 'Í'
            && car != 'Ó'
            && car != 'Ú'
            && car != 'Ü'
            && car != 'ñ'
            && car != 'Ñ'
            && car != (char) KeyEvent.VK_SPACE) {
            evt.consume();
    }//GEN-LAST:event_jTextFieldClienteKeyTyped
    }
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldExistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldExistenciaActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldExistencia;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
