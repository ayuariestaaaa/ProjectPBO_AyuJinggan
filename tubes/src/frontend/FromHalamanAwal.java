/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import java.awt.*;
/**
 *
 * @author user
 */
public class FromHalamanAwal extends javax.swing.JFrame {
    /**
     * Creates new form FromRegistrasi
     */
    public FromHalamanAwal() {
        initComponents();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        peminjaman = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        karyawan = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pengembalian = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sepeda = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pelanggan = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        transaksi = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        pelanggan1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("STLiti", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Bicycle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        peminjaman.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        peminjaman.setText("Data Peminjaman");
        peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(peminjaman)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peminjaman)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, 60));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        karyawan.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        karyawan.setText("Data Karyawan");
        karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(karyawan)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(karyawan)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 220, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        pengembalian.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        pengembalian.setText("Data Pengembalian");
        pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengembalianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pengembalian)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pengembalian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 220, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        sepeda.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        sepeda.setText("Data Sepeda");
        sepeda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sepedaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(sepeda)
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sepeda)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 220, 60));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        pelanggan.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        pelanggan.setText("Data Pelanggan");
        pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelangganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pelanggan)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pelanggan)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, 60));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        transaksi.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        transaksi.setText("Logout");
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(transaksi)
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transaksi)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 120, 50));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        pelanggan1.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        pelanggan1.setText("Data Kategori");
        pelanggan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelanggan1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pelanggan1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pelanggan1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 220, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/kategori.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 860, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanMouseClicked
        // TODO add your handling code here:
        FormKaryawan pinjam = new FormKaryawan();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_karyawanMouseClicked

    private void peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanMouseClicked
        // TODO add your handling code here:
        FormPeminjaman pinjam = new FormPeminjaman();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_peminjamanMouseClicked

    private void pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengembalianMouseClicked
        // TODO add your handling code here:
        FormPengembalian kembali = new FormPengembalian();
        kembali.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pengembalianMouseClicked

    private void pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelangganMouseClicked
        // TODO add your handling code here:
        FormPenggunaKu pinjam = new FormPenggunaKu();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pelangganMouseClicked

    private void sepedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sepedaMouseClicked
        // TODO add your handling code here:
        FormSepeda pinjam = new FormSepeda();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sepedaMouseClicked

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        // TODO add your handling code here:
        FormHalamanku pinjam = new FormHalamanku();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transaksiMouseClicked

    private void pelanggan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelanggan1MouseClicked
        // TODO add your handling code here:
        FormKategori pinjam = new FormKategori();
        pinjam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pelanggan1MouseClicked

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
            java.util.logging.Logger.getLogger(FromHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromHalamanAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel karyawan;
    private javax.swing.JLabel pelanggan;
    private javax.swing.JLabel pelanggan1;
    private javax.swing.JLabel peminjaman;
    private javax.swing.JLabel pengembalian;
    private javax.swing.JLabel sepeda;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
