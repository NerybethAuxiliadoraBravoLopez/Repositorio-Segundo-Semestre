

public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuItemProductos = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setMnemonic('f');
        Menu.setText("Administrar");

        MenuItemProductos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MenuItemProductos.setMnemonic('o');
        MenuItemProductos.setText("Productos");
        MenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProductosActionPerformed(evt);
            }
        });
        Menu.add(MenuItemProductos);

        menuBar.add(Menu);

        MenuVentas.setMnemonic('e');
        MenuVentas.setText("Ventas");

        MenuItemCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MenuItemCliente.setMnemonic('t');
        MenuItemCliente.setText("Registrar Cliente");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuVentas.add(MenuItemCliente);

        MenuItemVenta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MenuItemVenta.setMnemonic('y');
        MenuItemVenta.setText("Registrar Venta");
        MenuItemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVentaActionPerformed(evt);
            }
        });
        MenuVentas.add(MenuItemVenta);

        menuBar.add(MenuVentas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProductosActionPerformed
   Productos abrir=new Productos();
   desktopPane.add(abrir);
   abrir.setVisible(true);

    }//GEN-LAST:event_MenuItemProductosActionPerformed

    private void MenuItemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVentaActionPerformed
       RegistrarVentas abrir=new RegistrarVentas();
       desktopPane.add(abrir);
       abrir.setVisible(true);
       
    }//GEN-LAST:event_MenuItemVentaActionPerformed

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        RegistrarCliente abrir=new RegistrarCliente();
        desktopPane.add(abrir);
        abrir.setVisible(true);
    }//GEN-LAST:event_MenuItemClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemProductos;
    private javax.swing.JMenuItem MenuItemVenta;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
