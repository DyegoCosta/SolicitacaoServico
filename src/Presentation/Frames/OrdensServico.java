package Presentation.Frames;

import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Models.OrdemServico;
import Domain.Repository.IApontamentoRepository;
import Domain.Repository.IClienteRepository;
import Domain.Repository.IOrdemServicoRepository;
import Domain.Repository.IUsuarioRepository;
import Infrastructure.Repository.ApontamentoRepository;
import Infrastructure.Repository.ClienteRepository;
import Infrastructure.Repository.OrdemServicoRepository;
import Infrastructure.Repository.UsuarioRepository;
import Presentation.Util.ITableModel;
import Presentation.Util.TableModelOrdemServico;
import Presentation.Util.UIHelper;
import java.util.List;
import javax.swing.JOptionPane;

public class OrdensServico extends BaseJInternalFrame {

    private IOrdemServicoRepository _ordemServicoRepository;
    private IUsuarioRepository _usuarioRepository;
    private IClienteRepository _clienteRepository;
    private IApontamentoRepository _apontamentoRepository;
    
    private ITableModel _modelOrdensServico;
    private List<OrdemServico> _listaOrdensServicos;

    public OrdensServico(IDatabaseFactory databaseFactory) {
        super(databaseFactory);

        initComponents();

        _ordemServicoRepository = new OrdemServicoRepository(super.getDatabaseFactory());
        _usuarioRepository = new UsuarioRepository(super.getDatabaseFactory());
        _clienteRepository = new ClienteRepository(super.getDatabaseFactory());
        _apontamentoRepository = new ApontamentoRepository(super.getDatabaseFactory());
        
        pesquisar();        

        UIHelper.criarGroupBox(panelPesquisa, "Pesquisar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPesquisa = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaOrdensServico = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ordens de Serviços");
        setPreferredSize(new java.awt.Dimension(795, 590));

        panelPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(20, 20, 20))
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

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

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVisualizar)
                        .addComponent(btnNovo))
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
}//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        OrdemServicoDialog dialog = new OrdemServicoDialog(null, _ordemServicoRepository, _usuarioRepository, _clienteRepository, _apontamentoRepository);
        dialog.setVisible(true);
        pesquisar();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (existeOrdemServicoSelecionada()) {
            OrdemServico ordemServicoSelecionada = _listaOrdensServicos.get(tblListaOrdensServico.getSelectedRow());
            
            OrdemServicoDialog dialog = new OrdemServicoDialog(null, _ordemServicoRepository, _usuarioRepository, _clienteRepository, _apontamentoRepository, ordemServicoSelecionada);
            dialog.setVisible(true);
            
            pesquisar(); //na Dialog, pode-se excluir ou modificar registro, então faz pesquisa novamente.
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (existeOrdemServicoSelecionada() && super.exclusaoConfirmada()) {
            try {
                excluir();
            } catch (ValidacaoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JTable tblListaOrdensServico;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private ITableModel obterOrdemServicoTableModel() {
        return new TableModelOrdemServico(_listaOrdensServicos);
    }

    private boolean existeOrdemServicoSelecionada() {
        return tblListaOrdensServico.getSelectedRow() >= 0;
    }

    private void excluir() throws ValidacaoException {
        OrdemServico ordemServicoSelecionada = _listaOrdensServicos.get(tblListaOrdensServico.getSelectedRow());
        IUnitOfWork unitOfWork = super.obterUnitOfWork();

        _ordemServicoRepository.deletar(ordemServicoSelecionada);
        unitOfWork.commit();

        pesquisar();

        JOptionPane.showMessageDialog(this, "OS excluída com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void pesquisar() {
        String pesquisa = txtPesquisar.getText();
        if (StringHelper.estaNulaOuVazia(pesquisa)) {
            _listaOrdensServicos = _ordemServicoRepository.obterTodos();
        } else {
            _listaOrdensServicos = _ordemServicoRepository.listarPorCriterio(pesquisa);
        }

        _modelOrdensServico = obterOrdemServicoTableModel();
        tblListaOrdensServico.setModel(_modelOrdensServico);
    }
}
