package Presentation.Frames;

import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import Presentation.Util.UIHelper;
import javax.swing.JOptionPane;

public class ClienteEdit extends javax.swing.JDialog {
    
    private IUnitOfWork unitOfWork;
    private IClienteRepository _clienteRepository;
    private Cliente _cliente;
    
    public ClienteEdit(java.awt.Frame parent, IClienteRepository clienteRepository) {
        this(parent, clienteRepository, null);
    }
    
    public ClienteEdit(java.awt.Frame parent, IClienteRepository clienteRepository, Cliente cliente) {
        super(parent, true);
        initComponents();
        
        this._clienteRepository = clienteRepository;
        this._cliente = cliente;
        this.setLocationRelativeTo(null);
        UIHelper.criarGroupBox(jPanel1, "Dados");
        habilitaBotoes();
        if (estaModoEdicao())
            preencheFormulario();
        else
            habilitaCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblRazaosocial = new javax.swing.JLabel();
        txtRazaosocial = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        lblNomeresponsavel = new javax.swing.JLabel();
        txtNomeresponsavel = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCodigo.setText("Código");

        txtCodigo.setEditable(false);

        lblRazaosocial.setText("Razão Social");

        txtRazaosocial.setEditable(false);

        lblCnpj.setText("CNPJ");

        txtCnpj.setEditable(false);

        lblNomeresponsavel.setText("Nome responsável");

        txtNomeresponsavel.setEditable(false);

        lblTelefone.setText("Telefone");

        txtTelefone.setEditable(false);

        lblEndereco.setText("Endereço");

        txtEndereco.setEditable(false);

        lblEmail.setText("Email");

        txtEmail.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNomeresponsavel)
                                .addComponent(lblCnpj)
                                .addComponent(lblEmail)
                                .addComponent(lblEndereco))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeresponsavel)
                                .addComponent(txtEndereco)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblRazaosocial)
                                    .addGap(32, 32, 32))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCodigo)
                                    .addGap(59, 59, 59)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRazaosocial, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelefone)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaosocial)
                    .addComponent(txtRazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeresponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (estaModoEdicao() && exclusaoConfirmada()) {
            
            try {
                excluir();
            } catch (ValidacaoException ex) {
                unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitaCampos();
        txtCodigo.setEditable(false);
        txtRazaosocial.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (dadosValidos()) {
            try {
                salvar();
            } catch (ValidacaoException ex) {
                unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNomeresponsavel;
    private javax.swing.JLabel lblRazaosocial;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeresponsavel;
    private javax.swing.JTextField txtRazaosocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private IUnitOfWork obterUnitOfWork() {
        return new UnitOfWork(_clienteRepository.getDatabaseFactory());
    }
    
    private void salvar() throws ValidacaoException {
        preencheCliente();
        unitOfWork = obterUnitOfWork();
        unitOfWork.beginTransaction();
        _clienteRepository.salvar(_cliente);
        unitOfWork.commit();
        
        JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void excluir() throws ValidacaoException {
        unitOfWork = obterUnitOfWork();
        unitOfWork.beginTransaction();
        _clienteRepository.deletar(_cliente);
        unitOfWork.commit();
        
        JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private boolean exclusaoConfirmada() {
        return JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0;
    }
    
    private boolean estaModoEdicao() {
        return _cliente != null;
    }
    
    private void habilitaBotoes() {
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(estaModoEdicao());
        btnExcluir.setEnabled(estaModoEdicao());
        btnSalvar.setEnabled(true);
    }
    
    private void habilitaCampos() {
        UIHelper.habilitaCampos(getContentPane());
        txtCodigo.setEditable(false);
        txtRazaosocial.requestFocus();
    }
    
    private void preencheFormulario() {
        txtCodigo.setText(String.valueOf(_cliente.getClienteId()));
        txtCnpj.setText(_cliente.getCNPJ());
        txtEmail.setText(_cliente.getEmail());
        txtEndereco.setText(_cliente.getEndereco());
        txtNomeresponsavel.setText(_cliente.getNomeResponsavel());
        txtRazaosocial.setText(_cliente.getRazaoSocial());
        txtTelefone.setText(_cliente.getTelefone());
    }
    
    private void preencheCliente() {
        if (!estaModoEdicao())
            _cliente = new Cliente();
        
        _cliente.setCNPJ(txtCnpj.getText());
        _cliente.setEmail(txtEmail.getText());
        _cliente.setEndereco(txtEndereco.getText());
        _cliente.setNomeResponsavel(txtNomeresponsavel.getText());
        _cliente.setRazaoSocial(txtRazaosocial.getText());
        _cliente.setTelefone(txtTelefone.getText());
    }
    
    private boolean dadosValidos() {
        return !StringHelper.estaNulaOuVazia(txtCnpj.getText())
                && !StringHelper.estaNulaOuVazia(txtEndereco.getText())
                && !StringHelper.estaNulaOuVazia(txtNomeresponsavel.getText())
                && !StringHelper.estaNulaOuVazia(txtRazaosocial.getText())
                && !StringHelper.estaNulaOuVazia(txtTelefone.getText());
    }
}
