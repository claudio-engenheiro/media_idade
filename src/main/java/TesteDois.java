
import java.awt.Color;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cliente
 */
public class TesteDois extends javax.swing.JFrame {

    /**
     * Creates new form TesteDois
     */
    public TesteDois() {
        initComponents();
        ImageIcon icon = new ImageIcon("src\\main\\java\\imagem\\titulosa2.PNG");
        icon.setImage(icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), 1));
        this.jLabel2.setIcon(icon);
        ImageIcon icon1 = new ImageIcon("src\\main\\java\\imagem\\nuvem.jpg");
        icon1.setImage(icon1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), 1));
        this.jLabel1.setIcon(icon1);
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSpn = new javax.swing.JSpinner();
        lblBtn = new javax.swing.JButton();
        lblFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        getContentPane().add(lblSpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 242, -1, -1));

        lblBtn.setText("CHUTAR");
        lblBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lblBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 292, -1, -1));

        lblFrase.setText("Qual numero estou pensando?");
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 10));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 220, 100));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBtnActionPerformed
        int vChute = (int) lblSpn.getValue();
        Random vRandom =new Random();
        int vValor =  vRandom.nextInt(6);
        String vResp = (vChute == vValor )? "Acertou o numero":"Errou o numero, Eu pensei em " + vValor;
        lblFrase.setText(vResp);
// TODO add your handling code here:
    }//GEN-LAST:event_lblBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TesteDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lblBtn;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner lblSpn;
    // End of variables declaration//GEN-END:variables
}