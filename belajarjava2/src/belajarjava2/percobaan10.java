/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjava2;

/**
 *
 * @author Erik Pratama
 */
public class percobaan10 extends javax.swing.JFrame {

    /**
     * Creates new form percobaan10
     */
    public percobaan10() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eData1 = new javax.swing.JTextField();
        eData2 = new javax.swing.JTextField();
        eHasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eData3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        menProses = new javax.swing.JMenu();
        menPersegiP = new javax.swing.JMenu();
        meItLuas = new javax.swing.JMenuItem();
        meItKeliling = new javax.swing.JMenuItem();
        menSegitiga = new javax.swing.JMenu();
        meItLuas2 = new javax.swing.JMenuItem();
        meItKeliling2 = new javax.swing.JMenuItem();
        menLingkaran = new javax.swing.JMenu();
        meItLuas3 = new javax.swing.JMenuItem();
        meItKeliling3 = new javax.swing.JMenuItem();
        menBantuan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA 1");

        jLabel2.setText("DATA 2");

        jLabel3.setText("HASIL");

        jLabel4.setText("DATA 3");

        menFile.setText("File");
        jMenuBar1.add(menFile);

        menProses.setText("Proses");

        menPersegiP.setText("Persegi Panjang");

        meItLuas.setText("Luas");
        meItLuas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItLuasStateChanged(evt);
            }
        });
        menPersegiP.add(meItLuas);

        meItKeliling.setText("Keliling");
        meItKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKelilingActionPerformed(evt);
            }
        });
        menPersegiP.add(meItKeliling);

        menProses.add(menPersegiP);

        menSegitiga.setText("Segitiga");

        meItLuas2.setText("Luas");
        meItLuas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuas2ActionPerformed(evt);
            }
        });
        menSegitiga.add(meItLuas2);

        meItKeliling2.setText("Keliling");
        meItKeliling2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKeliling2ActionPerformed(evt);
            }
        });
        menSegitiga.add(meItKeliling2);

        menProses.add(menSegitiga);

        menLingkaran.setText("Lingkaran");
        menLingkaran.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menLingkaranStateChanged(evt);
            }
        });

        meItLuas3.setText("Luas");
        meItLuas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuas3ActionPerformed(evt);
            }
        });
        menLingkaran.add(meItLuas3);

        meItKeliling3.setText("Keliling");
        meItKeliling3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKeliling3ActionPerformed(evt);
            }
        });
        menLingkaran.add(meItKeliling3);

        menProses.add(menLingkaran);

        jMenuBar1.add(menProses);

        menBantuan.setText("Bantuan");
        jMenuBar1.add(menBantuan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eData3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menLingkaranStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menLingkaranStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_menLingkaranStateChanged

    private void meItLuasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItLuasStateChanged
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Hasil;
        Hasil = Data1*Data2;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuasStateChanged

    private void meItKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKelilingActionPerformed
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Hasil;
        Hasil = 2*(Data1+Data2);
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItKelilingActionPerformed

    private void meItLuas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuas2ActionPerformed
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        double Hasil;
        Hasil = 0.5*Data1*Data2;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuas2ActionPerformed

    private void meItKeliling2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKeliling2ActionPerformed
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Data3 = Integer.parseInt(eData3.getText());
        int Hasil;
        Hasil = Data1+Data2+Data3;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItKeliling2ActionPerformed

    private void meItLuas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuas3ActionPerformed
        // TODO add your handling code here:
        double Data1 = Integer.parseInt(eData1.getText());
        double Hasil;
        Hasil = Math.PI*Data1*Data1;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuas3ActionPerformed

    private void meItKeliling3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKeliling3ActionPerformed
        // TODO add your handling code here:
        double Data1 = Integer.parseInt(eData1.getText());
        double Hasil;
        Hasil = 2*Math.PI*Data1;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItKeliling3ActionPerformed

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
            java.util.logging.Logger.getLogger(percobaan10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(percobaan10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(percobaan10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(percobaan10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new percobaan10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eData1;
    private javax.swing.JTextField eData2;
    private javax.swing.JTextField eData3;
    private javax.swing.JTextField eHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem meItKeliling;
    private javax.swing.JMenuItem meItKeliling2;
    private javax.swing.JMenuItem meItKeliling3;
    private javax.swing.JMenuItem meItLuas;
    private javax.swing.JMenuItem meItLuas2;
    private javax.swing.JMenuItem meItLuas3;
    private javax.swing.JMenu menBantuan;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menLingkaran;
    private javax.swing.JMenu menPersegiP;
    private javax.swing.JMenu menProses;
    private javax.swing.JMenu menSegitiga;
    // End of variables declaration//GEN-END:variables
}
