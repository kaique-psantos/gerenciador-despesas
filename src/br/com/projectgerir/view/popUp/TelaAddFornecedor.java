/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projectgerir.view.popUp;

import static br.com.projectgerir.controller.ComboBox.readFornecedor;
import br.com.projectgerir.model.DAO.FornecedorDAO;
import br.com.projectgerir.model.bean.Fornecedor;
import static br.com.projectgerir.view.TelaAddDespesa.cbFornecedor;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class TelaAddFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuarioSDI
     */
    public TelaAddFornecedor() {
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

        jPanel1 = new javax.swing.JPanel();
        btnAddFornecedor = new javax.swing.JButton();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GERIR - ADICIONAR FORNECEDOR");
        setBackground(new java.awt.Color(19, 7, 46));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddFornecedor.setContentAreaFilled(false);
        btnAddFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddFornecedor.setFocusable(false);
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 40));

        txtNomeFornecedor.setBackground(new java.awt.Color(19, 7, 46));
        txtNomeFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeFornecedor.setBorder(null);
        txtNomeFornecedor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeFornecedorKeyPressed(evt);
            }
        });
        jPanel1.add(txtNomeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 113, 230, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaAddFornecedor.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 470, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 269));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarFornecedor(){
        Fornecedor f = new Fornecedor();
        FornecedorDAO fDao = new FornecedorDAO();
        
        f.setNomeFornecedor(txtNomeFornecedor.getText());
        
        try{
            fDao.create(f);
            txtNomeFornecedor.setText("");
            cbFornecedor = readFornecedor(cbFornecedor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro so salvar o Fornecedor: "+ex);
        }
    }
    
    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        adicionarFornecedor();
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void txtNomeFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFornecedorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            adicionarFornecedor();
        }
    }//GEN-LAST:event_txtNomeFornecedorKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNomeFornecedor;
    // End of variables declaration//GEN-END:variables
}
