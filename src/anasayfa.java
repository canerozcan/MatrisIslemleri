
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spook
 */
public class anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form dordedort
     */
    public anasayfa() {
        initComponents();
        Seticon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secim = new javax.swing.JComboBox<>();
        git = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        matrix = new javax.swing.JMenu();
        uceuc = new javax.swing.JMenuItem();
        dordedort = new javax.swing.JMenuItem();
        besebes = new javax.swing.JMenuItem();
        hakkimizda = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matris Hesaplama");

        secim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        secim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3x3 Hesapla", "4x4 Hesapla", "5x5 Hesapla" }));

        git.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        git.setText("Hesaplamak için Tıklayınız.");
        git.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matrix.png"))); // NOI18N

        matrix.setText("Matris Hesaplama");
        matrix.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        uceuc.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        uceuc.setText("3x3 Matris Hesaplama");
        uceuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uceucActionPerformed(evt);
            }
        });
        matrix.add(uceuc);

        dordedort.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dordedort.setText("4x4 Matris Hesaplama");
        dordedort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dordedortActionPerformed(evt);
            }
        });
        matrix.add(dordedort);

        besebes.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        besebes.setText("5x5 Matris Hesaplama");
        besebes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besebesActionPerformed(evt);
            }
        });
        matrix.add(besebes);

        jMenuBar1.add(matrix);

        hakkimizda.setText("Hakkında");
        hakkimizda.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hakkimizda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hakkimizdaMouseClicked(evt);
            }
        });
        jMenuBar1.add(hakkimizda);

        jMenu1.setText("Çıkış");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(git)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(git)
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitActionPerformed
     
       if(secim.getSelectedIndex()==0){
           new uceuc().setVisible(true);
           this.setVisible(false);
       }
       else if(secim.getSelectedIndex()==1){
           new dordedort().setVisible(true);
           this.setVisible(false);
       }
       else{
            new besebes().setVisible(true);
           this.setVisible(false);
       }
        
    }//GEN-LAST:event_gitActionPerformed

    private void uceucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uceucActionPerformed
       new uceuc().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_uceucActionPerformed

    private void dordedortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dordedortActionPerformed
        new dordedort().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_dordedortActionPerformed

    private void besebesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besebesActionPerformed
        new besebes().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_besebesActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        int cikisKarar = JOptionPane.showConfirmDialog (null, "Çıkış yapmak istiyor musunuz?","UYARIII",JOptionPane.YES_NO_OPTION);
        if(cikisKarar==JOptionPane.YES_OPTION){
        System.exit(0);
          }
      
    }//GEN-LAST:event_jMenu1MouseClicked

    private void hakkimizdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hakkimizdaMouseClicked
       
        new hakkimizda().setVisible(true);
        this.setVisible(false);
        
           
    }//GEN-LAST:event_hakkimizdaMouseClicked

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
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem besebes;
    private javax.swing.JMenuItem dordedort;
    private javax.swing.JButton git;
    private javax.swing.JMenu hakkimizda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu matrix;
    private javax.swing.JComboBox<String> secim;
    private javax.swing.JMenuItem uceuc;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("matrix.png")));
    }
}
