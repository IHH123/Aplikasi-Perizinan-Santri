
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanan
 */
public class Dialog_Pulang extends javax.swing.JFrame {

    static int TANGGAL,BULAN,TAHUN,batastanggal,batasbulan,batastahun;
    static ResultSet rs;
    static String SyntaxSQL,sql="insert into history_dataizinsantri values (?,?,?,?,?,?,?)";;
    static String informasi="<html>Masukkan tanggal kepulangan<br>dengan benar</html>";
    
        static String kosong="";
        static String NIS,NAMA,TGLIZIN,ALASANIZIN,BATASTGLIZIN,AKUNLOGIN,TGLPULANG;
        static Connection con;
        static PreparedStatement PS;
    
    public Dialog_Pulang(String NamaUser,String nis,String nama,String tglizin,String alasanizin,String batastglizin) {
        initComponents();        
        setBackground(new Color(0,0,0,0));
        KolomTanggal.setBackground(new Color(0,0,0,0));
        KolomBulan.setBackground(new Color(0,0,0,0));
        KolomTahun.setBackground(new Color(0,0,0,0));
        LabelInformasi.setVisible(false);
            
            AKUNLOGIN=NamaUser;
            NIS=nis;
            NAMA=nama;
            TGLIZIN=tglizin;
            ALASANIZIN=alasanizin;
            BATASTGLIZIN=batastglizin;        
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
        LabelKalimat = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        ButtonOke = new javax.swing.JButton();
        LabelPemisah1 = new javax.swing.JLabel();
        LabelPemisah2 = new javax.swing.JLabel();
        KolomBulan = new javax.swing.JTextField();
        KolomTahun = new javax.swing.JTextField();
        KolomTanggal = new javax.swing.JTextField();
        SeparatotUnderline = new javax.swing.JSeparator();
        LabelInformasi = new javax.swing.JLabel();
        BackgroundDialog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        LabelKalimat.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        LabelKalimat.setForeground(new java.awt.Color(0, 0, 0));
        LabelKalimat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelKalimat.setText("<html> Masukkan tanggal kepulangan : <br>(Contoh : 25 - 09 - 2020)</html>");
        jPanel1.add(LabelKalimat);
        LabelKalimat.setBounds(0, 10, 250, 40);

        ButtonBack.setBackground(new java.awt.Color(0, 0, 0));
        ButtonBack.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(204, 204, 204));
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack);
        ButtonBack.setBounds(20, 120, 80, 30);

        ButtonOke.setBackground(new java.awt.Color(0, 0, 0));
        ButtonOke.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        ButtonOke.setForeground(new java.awt.Color(204, 204, 204));
        ButtonOke.setText("Oke");
        ButtonOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOkeActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonOke);
        ButtonOke.setBounds(150, 120, 80, 30);

        LabelPemisah1.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        LabelPemisah1.setForeground(new java.awt.Color(0, 0, 0));
        LabelPemisah1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPemisah1.setText("-");
        jPanel1.add(LabelPemisah1);
        LabelPemisah1.setBounds(140, 60, 30, 20);

        LabelPemisah2.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        LabelPemisah2.setForeground(new java.awt.Color(0, 0, 0));
        LabelPemisah2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPemisah2.setText("-");
        jPanel1.add(LabelPemisah2);
        LabelPemisah2.setBounds(60, 60, 30, 20);

        KolomBulan.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        KolomBulan.setForeground(new java.awt.Color(0, 0, 0));
        KolomBulan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KolomBulan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        KolomBulan.setOpaque(false);
        KolomBulan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KolomBulanKeyTyped(evt);
            }
        });
        jPanel1.add(KolomBulan);
        KolomBulan.setBounds(80, 60, 70, 20);

        KolomTahun.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        KolomTahun.setForeground(new java.awt.Color(0, 0, 0));
        KolomTahun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KolomTahun.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        KolomTahun.setOpaque(false);
        KolomTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KolomTahunKeyTyped(evt);
            }
        });
        jPanel1.add(KolomTahun);
        KolomTahun.setBounds(160, 60, 70, 20);

        KolomTanggal.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        KolomTanggal.setForeground(new java.awt.Color(0, 0, 0));
        KolomTanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KolomTanggal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        KolomTanggal.setOpaque(false);
        KolomTanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KolomTanggalKeyTyped(evt);
            }
        });
        jPanel1.add(KolomTanggal);
        KolomTanggal.setBounds(20, 60, 50, 20);

        SeparatotUnderline.setBackground(new java.awt.Color(0, 0, 0));
        SeparatotUnderline.setForeground(new java.awt.Color(0, 0, 0));
        SeparatotUnderline.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SeparatotUnderline.setMinimumSize(new java.awt.Dimension(400, 3));
        SeparatotUnderline.setOpaque(true);
        jPanel1.add(SeparatotUnderline);
        SeparatotUnderline.setBounds(20, 80, 210, 3);

        LabelInformasi.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        LabelInformasi.setForeground(new java.awt.Color(204, 0, 0));
        LabelInformasi.setText("<html>Masukkan tanggal kepulangan<br>dengan benar</html>");
        jPanel1.add(LabelInformasi);
        LabelInformasi.setBounds(20, 80, 220, 40);

        BackgroundDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackgroundDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rectangle.png"))); // NOI18N
        jPanel1.add(BackgroundDialog);
        BackgroundDialog.setBounds(-10, -10, 260, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(247, 172));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOkeActionPerformed
        
        if(KolomTanggal.getText().equals(kosong)) {
            
            LabelInformasi.setText("Kolom tanggal belum di-isi");
            LabelInformasi.setVisible(true);
            
        } else if(KolomBulan.getText().equals(kosong)) {
        
            LabelInformasi.setText("Kolom bulan belum di-isi");
            LabelInformasi.setVisible(true);
            
        } else if(KolomTahun.getText().equals(kosong)) {
            
            LabelInformasi.setText("Kolom tahun belum di-isi");
            LabelInformasi.setVisible(true);
            
        } else {
            
            try {
                
                TANGGAL=Integer.parseInt(KolomTanggal.getText());
                BULAN=Integer.parseInt(KolomBulan.getText());
                TAHUN=Integer.parseInt(KolomTahun.getText());
                    
                    TGLPULANG=(String.valueOf(TANGGAL))+"/"+(String.valueOf(BULAN))+"/"+(String.valueOf(TAHUN));
                    
                    batastanggal=Integer.parseInt(BATASTGLIZIN.substring(0,2));
                    batasbulan=Integer.parseInt(BATASTGLIZIN.substring(3,5));
                    batastahun=Integer.parseInt(BATASTGLIZIN.substring(6));
                                   
                    if(TANGGAL>=batastanggal&&TANGGAL<32) {
                        if(BULAN>=batasbulan&&BULAN<13) {
                            if(TAHUN>=batastahun&&TAHUN<2050) {
                                
                                con=new Izin_Santri().getConnection();
                                    
                                    try {
                                        
                                        SyntaxSQL="delete from tabel_dataizinsantri where nis='"+NIS+"'";
                                        PS=Izin_Santri.getConnection().prepareStatement(SyntaxSQL);
                                        PS.executeUpdate();
                                        
                                        PS=Izin_Santri.getConnection().prepareStatement(sql);
                                        PS.setString(1,AKUNLOGIN);
                                        PS.setString(2,NIS);   
                                        PS.setString(3,NAMA);
                                        PS.setString(4,TGLIZIN);
                                        PS.setString(5,ALASANIZIN);
                                        PS.setString(6,BATASTGLIZIN);
                                        PS.setString(7,TGLPULANG);
                                        PS.executeUpdate();
                                        
                                    } catch(SQLException e) {}
                                    
                                setVisible(false);
                                
                            } else {
                                
                                LabelInformasi.setText(informasi);
                                LabelInformasi.setVisible(true);
                            }
                            
                        } else {
                            
                            LabelInformasi.setText(informasi);
                            LabelInformasi.setVisible(true);
                        }                 
                        
                    } else {
                        
                        LabelInformasi.setText(informasi);
                        LabelInformasi.setVisible(true);
                    }
                
            } catch(NumberFormatException e) {
                
                LabelInformasi.setText(informasi);
                LabelInformasi.setVisible(true);        
            }            
        }
    }//GEN-LAST:event_ButtonOkeActionPerformed

    private void KolomTanggalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KolomTanggalKeyTyped
        
        if(KolomTanggal.getText().length()>1) {evt.consume();}
    }//GEN-LAST:event_KolomTanggalKeyTyped

    private void KolomBulanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KolomBulanKeyTyped
        
        if(KolomBulan.getText().length()>1) {evt.consume();}
    }//GEN-LAST:event_KolomBulanKeyTyped

    private void KolomTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KolomTahunKeyTyped
        
        if(KolomTahun.getText().length()>3) {evt.consume();}
    }//GEN-LAST:event_KolomTahunKeyTyped

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_ButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(Dialog_Pulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dialog_Pulang("","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundDialog;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonOke;
    private javax.swing.JTextField KolomBulan;
    private javax.swing.JTextField KolomTahun;
    private javax.swing.JTextField KolomTanggal;
    public static javax.swing.JLabel LabelInformasi;
    private javax.swing.JLabel LabelKalimat;
    private javax.swing.JLabel LabelPemisah1;
    private javax.swing.JLabel LabelPemisah2;
    private javax.swing.JSeparator SeparatotUnderline;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
