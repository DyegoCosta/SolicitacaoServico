package Presentation.Frames;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import Infrastructure.Repository.ClienteRepository;
import Presentation.Util.TableModelCliente;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.TableModel;

public class Clientes extends javax.swing.JInternalFrame {
    private IClienteRepository _clienteRepository;
    private TableModel _modelCliente;
    
    public Clientes(IDatabaseFactory databaseFactory) {                
        initComponents();
        
        _modelCliente = obterClienteTableModel(databaseFactory);
        tblClientes.setModel(_modelCliente);
        
        jPanel1.setBorder(BorderFactory.createTitledBorder("Pesquisar"));                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Procurar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 37, 750, 65);

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
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(510, 390, 77, 25);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("");
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(590, 390, 85, 25);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(680, 390, 83, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtPesquisarActionPerformed

private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    Novocliente janelanc = new Novocliente();
    janelanc.setVisible(true);
    // NovoClienteDialog clienteDialog = new NovoClienteDialog();
    // clienteDialog.setModal(true);
}//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private TableModel obterClienteTableModel(IDatabaseFactory databaseFactory) {
        _clienteRepository = new ClienteRepository(databaseFactory);
        List<Cliente> clientes = _clienteRepository.obterTodos();                
                
        return new TableModelCliente(clientes);
    }
}
