package Presentation.Frames;

import Domain.Application.Authentication;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Perfil;
import Domain.Models.Usuario;

public class Principal extends javax.swing.JFrame {

    private IDatabaseFactory _databaseFactory;

    public Principal(IDatabaseFactory databaseFactory) {
        _databaseFactory = databaseFactory;

        initComponents();

        this.setLocationRelativeTo(null);
        mostrarMenuUsuarioSeAdministrador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        Servicos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solicitação de Serviço");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        Cadastro.setText("Cadastro");

        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        Cadastro.add(Clientes);

        Usuarios.setText("Usuários");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        Cadastro.add(Usuarios);

        Servicos.setText("Ordens de serviços");
        Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicosActionPerformed(evt);
            }
        });
        Cadastro.add(Servicos);

        jMenuBar1.add(Cadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicosActionPerformed
    OrdensServico janelas = new OrdensServico(_databaseFactory);
    this.add(janelas);

    janelas.setVisible(true);
}//GEN-LAST:event_ServicosActionPerformed

private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
    Usuarios janelau = new Usuarios(_databaseFactory);
    this.add(janelau);
    janelau.setVisible(true);

}//GEN-LAST:event_UsuariosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        ClienteList clienteInternalFrame = new ClienteList(_databaseFactory);
        this.add(clienteInternalFrame);
        clienteInternalFrame.setVisible(true);
}//GEN-LAST:event_ClientesActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem Servicos;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void mostrarMenuUsuarioSeAdministrador() {
        Usuario usuarioLogado = Authentication.getInstance().obterUsuarioAutenticado();
        Usuarios.setVisible(usuarioLogado.getPerfil() == Perfil.Administrador);
    }
}
