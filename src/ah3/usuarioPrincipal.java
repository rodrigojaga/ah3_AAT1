/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ah3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class usuarioPrincipal extends javax.swing.JFrame {

    LinkedList<vendedor> list = new LinkedList<vendedor>(); 
    vendedorCrear va = new vendedorCrear();
    public int fila;
    


    public usuarioPrincipal() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        //info();
        tablas();
        
        
        
    }
    String columnas [] ={"Codigo","Nombre","Caja","Ventas","Genero"};
    public DefaultTableModel t1 = new DefaultTableModel(null,columnas);
//    String a ="";
//    String b ="";
//    String c ="";
//    String d ="";
//    String e ="";
    public void guardar() {

        try {
            FileOutputStream fileOut = new FileOutputStream("lista.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
            System.out.println("La lista se ha serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        try {
            FileInputStream fileIn = new FileInputStream("lista.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //tomamos la lista ya creada
            list = (LinkedList<vendedor>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("La lista se ha deserializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
   
    
  //  public void info(){
        //list.add(new vendedor(12,"Juan","A123","Maderas","Masculino"));
        
//        String columnas [] ={"Codigo","Nombre","Caja","Ventas","Genero"};
//        DefaultTableModel t1 = new DefaultTableModel(null,columnas);
        //vendedorCrear va = new vendedorCrear();
        
        //vendedor vd = new vendedor(vd.setCodigo());
//        vd.getCodigo();
//        vd.getNombre();
//        vd.getCaja();
//        vd.getVentas();
//        vd.getGenero();
//        String cod = va.codVendedor.getText();
//        String nom = va.nomVendedor.getText();
//        String caj = va.cajaVendedor.getText();
//        String vent = va.ventasVendedor.getText();
//        String gen = va.helicpteroapache.getText();

        
//        a = va.codVendedor.getText();
//        b = va.nomVendedor.getText();
//        c = va.cajaVendedor.getText();
//        d = va.ventasVendedor.getText();
//        e = va.helicpteroapache.getText();
        
        
//        
//        list.add(new vendedor(a,b,c,d,e));
//        
//        Object dato[] = new Object[5];
//        for(vendedor informacion : list){
//          
//          dato[0] = informacion.codigo;
//          dato[1] = informacion.nombre;
//          dato[2] = informacion.caja;
//          dato[3] = informacion.ventas;
//          dato[4] = informacion.genero;
//            t1.addRow(dato);
//        }    
//        tablavendedores.setModel(t1);
       
        
   // }
  
    
    
    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablavendedores = new javax.swing.JTable();
        bsalirusuario_menup = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sucursales", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Productos", jPanel5);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        tablavendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablavendedores);

        bsalirusuario_menup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ah3/imagenes/Logout_37127.png"))); // NOI18N
        bsalirusuario_menup.setBorder(null);
        bsalirusuario_menup.setBorderPainted(false);
        bsalirusuario_menup.setContentAreaFilled(false);
        bsalirusuario_menup.setFocusPainted(false);
        bsalirusuario_menup.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ah3/imagenes/Logout_37127.png"))); // NOI18N
        bsalirusuario_menup.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ah3/imagenes/Logout_37127.png"))); // NOI18N
        bsalirusuario_menup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirusuario_menupActionPerformed(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Carga Masiva");

        jButton7.setText("Actualizar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Exportar como PDF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bsalirusuario_menup)
                        .addGap(9, 9, 9))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(bsalirusuario_menup)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Vendedores", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirusuario_menupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirusuario_menupActionPerformed
        JOptionPane.showMessageDialog(null, "Has salido al Log-In");
        loginp log = new loginp();
        log.setVisible(true);
        
        
        dispose();
        
    }//GEN-LAST:event_bsalirusuario_menupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vendedorCrear vc = new vendedorCrear();
        vc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int fila1 = tablavendedores.getSelectedRow();
        if(fila1>-1){
            int respuesta = JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE QUE QUIERE ELIMINAR LOS DATOS", 
                "CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respuesta==JOptionPane.YES_OPTION){
                vendedor.vendedores.remove(fila1);
                t1.removeRow(fila1);
                JOptionPane.showMessageDialog(null, "Fila No. "+fila1+" Ha sido eliminada");
            }else if(respuesta==JOptionPane.NO_OPTION){
            }else{
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
        }
        
        
        //tablavendedores.removeRowSelectionInterval(fila, fila);
//tablavendedores.removeRow(fila);
        //tablavendedores.removeRowSelectionInterval(fila);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        fila = tablavendedores.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "DEBE ELEGIR UNA FILA");
        }else{
            vendedorActualizar vc = new vendedorActualizar();
            vc.datos(tablavendedores.getSelectedRow());
            vc.setVisible(true);
            //ila = tablavendedores.getSelectedRow();
            System.out.println(fila);
            dispose();
        }
        
        //vendedorActualizar vc = new vendedorActualizar();
        //vc.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    
    
    public void tablas(){
//        String columnas [] ={"Codigo","Nombre","Caja","Ventas","Genero"};
        //DefaultTableModel t1 = new DefaultTableModel(null,columnas);
        for(vendedor informacion : vendedor.vendedores){
            Object[] dato = new Object[5];
            dato[0] = informacion.getCodigo();
            dato[1] = informacion.getNombre();
            dato[2] = informacion.getCaja();
            dato[3] = informacion.getVentas();
            dato[4] = informacion.getGenero();
            t1.addRow(dato);
        }
        tablavendedores.setModel(t1);
    }
//    public void modi(){
//       for(vendedor informacion : vendedor.vendedores1){
//            Object[] dato = new Object[6];
//            dato[0] = informacion.getCodigo();
//            dato[1] = informacion.getNombre();
//            dato[2] = informacion.getCaja();
//            dato[3] = informacion.getVentas();
//            dato[4] = informacion.getGenero();
//            
//            t1.addRow(dato);
//        }
//        tablavendedores.setModel(t1); 
//    }
    
   
    
   
     
    
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
            java.util.logging.Logger.getLogger(usuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsalirusuario_menup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable tablavendedores;
    // End of variables declaration//GEN-END:variables
}
