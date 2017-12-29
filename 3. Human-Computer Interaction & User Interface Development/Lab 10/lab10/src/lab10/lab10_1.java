/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Dec 11, 2017, 11:11:52 AM
 */
package lab10;

import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class lab10_1 extends javax.swing.JFrame {
    int index = 0;

    ImageIcon HanSolo = new ImageIcon("./src/lab10/HanSolo.jpg");
    ImageIcon HanSoloMin = new ImageIcon("./src/lab10/HanSoloMin.jpg");
    
    ImageIcon HukeSky = new ImageIcon("./src/lab10/LukeSky.jpg");
    ImageIcon HukeSkyMin = new ImageIcon("./src/lab10/LukeSkyMin.jpg");
    
    ImageIcon Organa = new ImageIcon("./src/lab10/Organa.jpg");
    ImageIcon OrganaMin = new ImageIcon("./src/lab10/OrganaMin.jpg");
    
    ImageIcon R2D2 = new ImageIcon("./src/lab10/R2D2.jpg");
    ImageIcon R2D2Min = new ImageIcon("./src/lab10/R2D2Min.jpg");
    
    ImageIcon C3PO = new ImageIcon("./src/lab10/c3po.jpg");
    ImageIcon C3POMin = new ImageIcon("./src/lab10/c3poMin.jpg");
    
    ImageIcon Rey = new ImageIcon("./src/lab10/rey.jpg");
    ImageIcon ReyMin = new ImageIcon("./src/lab10/reyMin.jpg");
    
    ImageIcon[] bigPictures = {HanSolo, HukeSky, Organa, R2D2, C3PO, Rey};
    ImageIcon[] smallPictures = {HanSoloMin, HukeSkyMin, OrganaMin, R2D2Min, C3POMin, ReyMin};

    public lab10_1() {
        initComponents();
        
        jLabel1.setIcon(bigPictures[1]);
        
        jLabel3.setIcon(smallPictures[0]);
        jLabel4.setIcon(smallPictures[1]);
        jLabel5.setIcon(smallPictures[2]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSky.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/HanSoloMin.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSkyMin.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/OrganaMin.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/leftarrow.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/rightarrow.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    index--;
    
    if(index == 0)
    {
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[smallPictures.length - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[index + 1]);
    }
    else if(index == -1)
    {
        index = smallPictures.length - 1;
        
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[index - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[0]);
    }
    else
    {
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[index - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[index + 1]);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   index++;
    
    if(index == smallPictures.length - 1)
    {
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[index - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[0]);
    }
    else if(index == smallPictures.length)
    {
        index = 0;
        
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[smallPictures.length - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[index + 1]);
    }
    else
    {
        jLabel1.setIcon(bigPictures[index]);
        
        jLabel3.setIcon(smallPictures[index - 1]);
        jLabel4.setIcon(smallPictures[index]);
        jLabel5.setIcon(smallPictures[index + 1]);
    }
}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new lab10_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
