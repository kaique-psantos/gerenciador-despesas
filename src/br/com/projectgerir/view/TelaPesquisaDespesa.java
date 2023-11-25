package br.com.projectgerir.view;

import static br.com.projectgerir.controller.ComboBox.*;
import static br.com.projectgerir.controller.PreencherTableDespesa.*;
import static br.com.projectgerir.controller.PreencherValorTotal.*;

import br.com.projectgerir.model.DAO.DespesaDAO;
import static br.com.projectgerir.util.Utilitarios.converterData;
import br.com.projectgerir.model.bean.Categoria;
import br.com.projectgerir.model.bean.DespesaPesquisaModel;
import br.com.projectgerir.model.bean.Fornecedor;
import static br.com.projectgerir.util.Utilitarios.inserirIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kaiqu
 */
public class TelaPesquisaDespesa extends javax.swing.JFrame {

    /**
     * Creates new form imgTelaPesquisaDespesa
     */
    public TelaPesquisaDespesa() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        inserirIcon(this);
        
        cbPesqCategoria = readCategoria(cbPesqCategoria);
        cbPesqFornecedor = readFornecedor(cbPesqFornecedor);
        
        DefaultTableModel modelo = (DefaultTableModel) tableDespesas.getModel();
        tableDespesas.setRowSorter(new TableRowSorter(modelo));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cbPesqFornecedor = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbPesqCategoria = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        txtDataFinal = new javax.swing.JFormattedTextField();
        txtDataInicial = new javax.swing.JFormattedTextField();
        txtValorTotal = new javax.swing.JLabel();
        txtTotalRegistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDespesas = new javax.swing.JTable();
        imgTelaPesquisaDespesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERIR - PESQUISAR DESPESA");
        setBackground(new java.awt.Color(19, 7, 46));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 7, 46));

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbPesqFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(cbPesqFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 168, 468, 39));

        btnPesquisar.setBorder(null);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusable(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 130, 40));

        btnVoltar.setBorder(null);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusable(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 633, 50, 40));

        cbPesqCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(cbPesqCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 168, 172, 39));

        btnExcluir.setBorder(null);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusable(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 630, 100, 40));

        txtDataFinal.setBorder(null);
        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 169, 150, 38));

        txtDataInicial.setBorder(null);
        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicial.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtDataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 169, 150, 38));

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setText("   ");
        jPanel1.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 637, 105, 30));

        txtTotalRegistros.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTotalRegistros.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRegistros.setText("  ");
        jPanel1.add(txtTotalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 100, -1));

        tableDespesas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BANCO", "CATEGORIA", "FORNECEDOR", "DESCRIÇÃO", "DATA DO PAGAMENTO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDespesas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1170, 340));

        imgTelaPesquisaDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaPesquisarDespesaV2.png"))); // NOI18N
        jPanel1.add(imgTelaPesquisaDespesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String dataInicial = converterData(txtDataInicial);
        String dataFinal = converterData(txtDataFinal);
        Categoria categoria = (Categoria) cbPesqCategoria.getSelectedItem();
        Fornecedor fornecedor = (Fornecedor) cbPesqFornecedor.getSelectedItem();
            
        if(fornecedor.getId() == 0 && categoria.getId() == 0){
            readTableDespesaData(dataInicial, dataFinal);           
            txtValorTotal.setText("R$ " + valorPorData(dataInicial, dataFinal));
        }else if(fornecedor.getId() != 0 && categoria.getId() == 0){
            readTableDespesaFornecedor(fornecedor.getId(), dataInicial, dataFinal);
            txtValorTotal.setText("R$ " + valorPorFornecedor(fornecedor.getId(), dataInicial, dataFinal));
        }else if(fornecedor.getId() == 0 && categoria.getId() != 0){
            readTableDespesaCategoria(categoria.getId(), dataInicial, dataFinal);
            txtValorTotal.setText("R$ " + valorPorCategoria(categoria.getId(), dataInicial, dataFinal));
        }else if(fornecedor.getId() != 0 && categoria.getId() != 0){
            readTableDespesa2Filtros(categoria.getId(), fornecedor.getId(), dataInicial, dataFinal);
            txtValorTotal.setText("R$ " + valorPor2Filtros(fornecedor.getId(), categoria.getId(), dataInicial, dataFinal));
        }else{
            JOptionPane.showMessageDialog(null, "Preencha ao menos a data inicial e a data final");
        }
          
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tableDespesas.getSelectedRow() != -1){
            DespesaPesquisaModel despesa = new DespesaPesquisaModel();
            DespesaDAO dDao = new DespesaDAO();
            
            despesa.setId((int) tableDespesas.getValueAt(tableDespesas.getSelectedRow(), 0));
            
            try {
                dDao.delete(despesa);
                ((DefaultTableModel) tableDespesas.getModel()).removeRow(tableDespesas.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(TelaPesquisaDespesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    public static javax.swing.JComboBox<Object> cbPesqCategoria;
    public static javax.swing.JComboBox<Object> cbPesqFornecedor;
    private javax.swing.JLabel imgTelaPesquisaDespesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableDespesas;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    public static javax.swing.JLabel txtTotalRegistros;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables

   
}
