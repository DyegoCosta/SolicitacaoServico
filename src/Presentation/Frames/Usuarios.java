package Presentation.Frames;

import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import Infrastructure.Repository.UsuarioRepository;
import Presentation.Util.ITableModel;
import Presentation.Util.TableModelUsuario;
import Presentation.Util.UIHelper;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuarios extends BaseJInternalFrame {

    private IUnitOfWork _unitOfWork;
    private IUsuarioRepository _usuarioRepository;
    private ITableModel _modelUsuario;
    private List<Usuario> _listaUsuarios;

    public Usuarios(IDatabaseFactory databaseFactory) {
        super(databaseFactory);
        initComponents();

        _modelUsuario = obterUsuarioTableModel(databaseFactory);
        tblUsuarios.setModel(_modelUsuario);

        UIHelper.criarGroupBox(jPanel1, "Pesquisar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(795, 590));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtPesquisar)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(20, 20, 20))
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

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sobrenome", "Login", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setToolTipText("");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizar)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        UsuarioDialog dialog = new UsuarioDialog(null, _usuarioRepository);
        dialog.setVisible(true);
        pesquisar();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (existeUsuarioSelecionado() && exclusaoConfirmada()) {
            try {
                excluir();
            } catch (ValidacaoException ex) {
                _unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (existeUsuarioSelecionado()) {
            Usuario usuarioSelecionado = _listaUsuarios.get(tblUsuarios.getSelectedRow());
            UsuarioDialog dialog = new UsuarioDialog(null, _usuarioRepository, usuarioSelecionado);
            dialog.setVisible(true);
            pesquisar();
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private ITableModel obterUsuarioTableModel(IDatabaseFactory databaseFactory) {
        _usuarioRepository = new UsuarioRepository(databaseFactory);
        _listaUsuarios = _usuarioRepository.obterTodos();

        return new TableModelUsuario(_listaUsuarios);
    }

    private void pesquisar() {
        String pesquisa = txtPesquisar.getText();
        if (StringHelper.estaNulaOuVazia(pesquisa)) {
            _listaUsuarios = _usuarioRepository.obterTodos();
        } else {
            _listaUsuarios = _usuarioRepository.listarPorCriterio(pesquisa);
        }

        _modelUsuario.clear();
        _modelUsuario.addRows(_listaUsuarios);
    }

    private boolean existeUsuarioSelecionado() {
        return tblUsuarios.getSelectedRow() >= 0;
    }

    private void excluir() throws ValidacaoException {
        Usuario usuarioSelecionado = _listaUsuarios.get(tblUsuarios.getSelectedRow());
        _unitOfWork = obterUnitOfWork();
        _unitOfWork.beginTransaction();
        _usuarioRepository.deletar(usuarioSelecionado);
        _unitOfWork.commit();
        pesquisar();

        JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
