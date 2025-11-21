
import Clases.Cliente;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;


public class RegistrarCliente extends javax.swing.JInternalFrame {

    ArrayList<Cliente> ListaCliente=new ArrayList<>();
    int indice=-1;
    public RegistrarCliente() {
        initComponents();
    }
private void LimpiarCampos(){
this.jTextFieldNombre.setText("");
this.jTextFieldApellido.setText("");
this.jFormattedCedula.setText("");
this.jFormattedTelefono.setText("");}

private void LlenarTabla(){
    DefaultTableModel modelo = new DefaultTableModel();
    String[] columnas = {"Nombres", "Apellidos", "Cédula","Sexo","Teléfono"};
    modelo.setColumnIdentifiers(columnas);
    for (Cliente cliente: ListaCliente){
        String[] renglon = { cliente.getNombre(),
            cliente.getApellido(), cliente.getCedula(), cliente.getSexo(),
            cliente.getTelefono()};
        modelo.addRow(renglon);
    }
    jTableCliente.setModel(modelo);
}

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFormattedCedula = new javax.swing.JFormattedTextField();
        jFormattedTelefono = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jTextFieldApellido = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        try {
            jFormattedCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombres:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cédula:");

        jButtonActualizar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Apellidos:");

        jButtonEliminar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Teléfono:");

        jTableCliente.setBackground(new java.awt.Color(204, 204, 204));
        jTableCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Cédula", "Sexo", "Teléfono"
            }
        ));
        jScrollPane2.setViewportView(jTableCliente);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Sexo:");

        jButtonGuardar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEditar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jComboBoxSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(386, 386, 386)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if ((jTextFieldNombre.getText().contentEquals(""))||
                (jTextFieldApellido.getText().contentEquals(""))||
                (jFormattedCedula.getText().contentEquals(""))||
                (jComboBoxSexo.getSelectedItem().equals("")) ||
                (jFormattedTelefono.getText().contentEquals(""))) {
        JOptionPane.showMessageDialog(null,"Algunos campos están vacíos", "¡Revise todos los campos!",
                JOptionPane.WARNING_MESSAGE);
        }else{
            String NombreCliente=this.jTextFieldNombre.getText();
            String ApellidoCliente=this.jTextFieldApellido.getText();
            String CedulaCliente=this.jFormattedCedula.getText();
            String SexoCliente=(String) this.jComboBoxSexo.getSelectedItem();
            String TelefonoCliente=this.jFormattedTelefono.getText();
            
            
         try { Cliente cliente = new Cliente(NombreCliente, ApellidoCliente, CedulaCliente, SexoCliente, TelefonoCliente);
             this.ListaCliente.add(cliente);
             
             this.LimpiarCampos();
             LlenarTabla();
             JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
          }catch (Exception e){
              JOptionPane.showMessageDialog(null, "Datos no agregados", "ERROR",
                      JOptionPane.ERROR_MESSAGE);

            
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }}
    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
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
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
LimpiarCampos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
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
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int fila = this.jTableCliente.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");   
        } else {
            JDialog.setDefaultLookAndFeelDecorated(true);
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?",
                    "Eiminando...",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION){
                ListaCliente.remove(fila);
                LlenarTabla();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila= this.jTableCliente.getSelectedRow();
        if (fila == -1) {
        JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }else { 
            String nom= (String)this.jTableCliente.getValueAt(fila, 0);
        String ape = (String)this.jTableCliente.getValueAt(fila, 1);
        String ced = (String)this.jTableCliente.getValueAt(fila, 2);
        String sex = (String)this.jTableCliente.getValueAt(fila, 3);
        String tel = (String)this.jTableCliente.getValueAt(fila, 4);
        
         jTextFieldNombre.setText(nom);
        jTextFieldApellido.setText(ape);
        jFormattedCedula.setText(ced);
        jComboBoxSexo.setSelectedItem(sex);
         jFormattedTelefono.setText(tel);
         
         indice = fila; 
        } 
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if (jTextFieldNombre.getText().contentEquals("") ||
                (jTextFieldApellido.getText().contentEquals("") )||
                (jFormattedCedula.getText().contentEquals("")) ||
                (jComboBoxSexo.getSelectedItem().equals(""))||
                (jFormattedTelefono.getText().contentEquals("")) || indice==-1){
            JOptionPane.showMessageDialog(null, "Algunos campos están vacíos, selecciones de la tabla de datos",
                    "Actualizar...",
            JOptionPane.WARNING_MESSAGE);
LimpiarCampos();
}else{
            ListaCliente.get(indice).setNombre(jTextFieldNombre.getText());
            ListaCliente.get(indice).setApellido(jTextFieldApellido.getText());
            ListaCliente.get(indice).setCedula(jFormattedCedula.getText());
            ListaCliente.get(indice).setSexo((String) jComboBoxSexo.getSelectedItem());
            ListaCliente.get(indice).setTelefono(jFormattedTelefono.getText());
            
            LlenarTabla();
            LimpiarCampos();
            
            
        }
                
    }//GEN-LAST:event_jButtonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedCedula;
    private javax.swing.JFormattedTextField jFormattedTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
