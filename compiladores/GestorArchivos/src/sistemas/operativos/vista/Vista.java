/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.operativos.vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class Vista extends javax.swing.JFrame {

    DefaultTableModel modelo;
    int tmp;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        String cabecera[] = {"id", "Tamaño", "Proceso"};
        String datoss[][] = {};
        modelo = new DefaultTableModel(datoss, cabecera);
        jTable1.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == 96) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 97) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 27) {
            this.dispose();
        }
        if (evt.getKeyCode() == 98) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 99) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 100) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 101) {
            proceso(evt.getKeyCode());
        }
        if (evt.getKeyCode() == 10) {
            borrar();
            modelo.isCellEditable(0, 1);
        }
      

    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTable1MouseClicked

    public void borrar(){
        System.out.println(tmp);
        System.out.println(modelo.getValueAt(0, 2));
        modelo.removeRow(tmp);
        //tmp++;
    }
    public void delay_Seg() {
        try {
            Thread.sleep(1000);
            
        } catch (Exception e) {
        }
    }

    private void proceso(int i) {
        int tmp = 0;
        if (i == 96) {
            int peso = (int) (Math.random() * 100) + 1;
            int id = (int) (Math.random() * 100000) + 100;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        }
        if (i == 97) {
            int peso = (int) (Math.random() * 201) + 100;
            int id = (int) (Math.random() * 200000) + 2000;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        }
        if (i == 98) {
            int peso = (int) (Math.random() * 301) + 200;
            int id = (int) (Math.random() * 300000) + 200;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        }
         if (i == 99) {
            int peso = (int) (Math.random() * 401) + 300;
            int id = (int) (Math.random() * 400000) + 400;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        }
          if (i == 100) {
            int peso = (int) (Math.random() * 501) + 400;
            int id = (int) (Math.random() * 500000) + 500;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        }
          if (i == 101) {
            int peso = (int) (Math.random() * 601) + 500;
            int id = (int) (Math.random() * 600000) + 600;
            int proceso = i;
            Object datos[] = {id, peso, proceso};
            modelo.addRow(datos);
        } 
          
        

    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
