package Presentation.Frames;

import Domain.Application.StringHelper;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import Infrastructure.Repository.ClienteRepository;
import Presentation.Util.ITableModel;
import Presentation.Util.TableModelCliente;
import Presentation.Util.UIHelper;
import java.awt.event.KeyEvent;
import java.util.List;

public class Clientes extends javax.swing.JInternalFrame {

    private IClienteRepository _clienteRepository;
    private ITableModel _modelCliente;
    private List<Cliente> clientes;

    public Clientes(IDatabaseFactory databaseFactory) {
        initComponents();

        _modelCliente = obterClienteTableModel(databaseFactory);
        tblClientes.setModel(_modelCliente);

        UIHelper.criarGroupBox(panelPesquisa, "Pesquisar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPesquisa = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(795, 590));
        setPreferredSize(new java.awt.Dimension(795, 590));
        getContentPane().setLayout(null);

        panelPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
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
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(33, 33, 33))
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(panelPesquisa);
        panelPesquisa.setBounds(10, 37, 750, 65);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Empresa", "Contato", "Ordem de Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 125, 750, 245);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(95, 25));
        btnNovo.setMinimumSize(new java.awt.Dimension(95, 25));
        btnNovo.setPreferredSize(new java.awt.Dimension(95, 25));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(470, 390, 95, 25);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnAlterar.setText("Editar");
        btnAlterar.setToolTipText("");
        btnAlterar.setMaximumSize(new java.awt.Dimension(95, 25));
        btnAlterar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnAlterar.setPreferredSize(new java.awt.Dimension(95, 25));
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(570, 390, 95, 25);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(95, 25));
        btnExcluir.setMinimumSize(new java.awt.Dimension(95, 25));
        btnExcluir.setPreferredSize(new java.awt.Dimension(95, 25));
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(670, 390, 95, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    Novocliente janelanc = new Novocliente();
    janelanc.setVisible(true);
    // NovoClienteDialog clienteDialog = new NovoClienteDialog();
    // clienteDialog.setModal(true);
}//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private ITableModel obterClienteTableModel(IDatabaseFactory databaseFactory) {
        _clienteRepository = new ClienteRepository(databaseFactory);
        clientes = _clienteRepository.obterTodos();

        return new TableModelCliente(clientes);
    }

    private void pesquisar() {
        String pesquisa = txtPesquisar.getText();
        if (StringHelper.estaNulaOuVazia(pesquisa)) {
            clientes = _clienteRepository.obterTodos();
        } else {
            clientes = _clienteRepository.listarPorCriterio(pesquisa);
        }

        _modelCliente.clear();
        _modelCliente.addRows(clientes);
    }
}
