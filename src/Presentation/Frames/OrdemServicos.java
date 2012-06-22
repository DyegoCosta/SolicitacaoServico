package Presentation.Frames;

import Domain.Data.IDatabaseFactory;
import Domain.Models.OrdemServico;
import Domain.Repository.IOrdemServicoRepository;
import Infrastructure.Repository.OrdemServicoRepository;
import Presentation.Util.TableModelOrdemServico;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.TableModel;

public class OrdemServicos extends javax.swing.JInternalFrame {
    private IOrdemServicoRepository _ordemServicoRepository;
    private TableModel _modelOrdensServico;
    
    public OrdemServicos(IDatabaseFactory databaseFactory) {
        initComponents();
        
        _modelOrdensServico = obterOrdemServicoTableModel(databaseFactory);
        tblListaOrdensServico.setModel(_modelOrdensServico);
        
        jPanel1.setBorder(BorderFactory.createTitledBorder("Pesquisar"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaOrdensServico = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ordens de Serviços");
        setPreferredSize(new java.awt.Dimension(795, 590));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Procurar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 760, 65);

        tblListaOrdensServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Cliente", "Contato", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaOrdensServico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 760, 300);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        getContentPane().add(btnNovo);
        btnNovo.setBounds(500, 430, 77, 25);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("");
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(590, 430, 85, 25);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(680, 430, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
}//GEN-LAST:event_txtPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaOrdensServico;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private TableModel obterOrdemServicoTableModel(IDatabaseFactory databaseFactory) {
        _ordemServicoRepository = new OrdemServicoRepository(databaseFactory);
        List<OrdemServico> ordensServico = _ordemServicoRepository.obterTodos();                
                
        return new TableModelOrdemServico(ordensServico);
    }
}
