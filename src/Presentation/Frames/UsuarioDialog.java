package Presentation.Frames;

import Domain.Data.IUnitOfWork;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import Presentation.Util.UIHelper;

public class UsuarioDialog extends javax.swing.JDialog {
    
    private IUnitOfWork _unitOfWork;
    private IUsuarioRepository _usuarioRepository;
    private Usuario _usuario;
    
    public UsuarioDialog(java.awt.Frame parent, IUsuarioRepository usuarioRepository) {
        this(parent, usuarioRepository, null);
    }
    
    public UsuarioDialog(java.awt.Frame parent, IUsuarioRepository usuarioRepository, Usuario usuario) {
        super(parent, true);
        initComponents();
        
        _usuarioRepository = usuarioRepository;
        _usuario = usuario;
        
        this.setLocationRelativeTo(null);
        
        UIHelper.criarGroupBox(panelInfomacoesPessoais, "Informações pessoais");        
        UIHelper.criarGroupBox(panelInformacoesAcesso, "Informações de acesso");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfomacoesPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        panelInformacoesAcesso = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        lblConfirmarSenha = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelInfomacoesPessoais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNome.setText("Nome");

        txtNome.setEditable(false);

        lblSobrenome.setText("Sobrenome");

        txtSobrenome.setEditable(false);

        lblCpf.setText("CPF");

        txtCpf.setEditable(false);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelInfomacoesPessoaisLayout = new javax.swing.GroupLayout(panelInfomacoesPessoais);
        panelInfomacoesPessoais.setLayout(panelInfomacoesPessoaisLayout);
        panelInfomacoesPessoaisLayout.setHorizontalGroup(
            panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                .addGroup(panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelInfomacoesPessoaisLayout.setVerticalGroup(
            panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblNome))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblSobrenome))
                    .addGroup(panelInfomacoesPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelInfomacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelInformacoesAcesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLogin.setText("Login");

        txtLogin.setEditable(false);

        lblSenha.setText("Senha");

        txtSenha.setEditable(false);

        txtConfirmarSenha.setEditable(false);

        lblConfirmarSenha.setText("Confirmar senha");

        javax.swing.GroupLayout panelInformacoesAcessoLayout = new javax.swing.GroupLayout(panelInformacoesAcesso);
        panelInformacoesAcesso.setLayout(panelInformacoesAcessoLayout);
        panelInformacoesAcessoLayout.setHorizontalGroup(
            panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha)
                    .addComponent(lblConfirmarSenha))
                .addGap(30, 30, 30)
                .addGroup(panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtSenha)
                    .addComponent(txtConfirmarSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInformacoesAcessoLayout.setVerticalGroup(
            panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacoesAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmarSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Salvar.png"))); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.setEnabled(false);

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Cancelar.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelInformacoesAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelInfomacoesPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar1)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfomacoesPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInformacoesAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar1)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar1))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPanel panelInfomacoesPessoais;
    private javax.swing.JPanel panelInformacoesAcesso;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
