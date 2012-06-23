package Presentation.Frames;

import Domain.Application.Authentication;
import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import Domain.Models.Apontamento;
import Domain.Models.OrdemServico;
import Domain.Models.Usuario;
import Domain.Repository.IApontamentoRepository;
import javax.swing.JOptionPane;
import org.joda.time.LocalDateTime;

public class ApontamentoDialog extends BaseJDialog {
    
    private IUnitOfWork _unitOfWork;
    private IApontamentoRepository _apontamentoRepository;
    private Apontamento _apontamento;
    private OrdemServico _ordemServico;
    
    public ApontamentoDialog(java.awt.Frame parent, boolean modal,
                                IApontamentoRepository apontamentoRepository,                                
                                OrdemServico ordemServico) {
        super(parent, modal);
        
        _apontamentoRepository = apontamentoRepository;        
        _ordemServico = ordemServico;
        
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDataAtividade = new javax.swing.JLabel();
        lblAtividadeRealizada = new javax.swing.JLabel();
        txtDataAtividade = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAtividadeRealizada = new javax.swing.JTextArea();
        lblDataTermino = new javax.swing.JLabel();
        txtDataTermino = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDataAtividade.setText("Data da atividade");

        lblAtividadeRealizada.setText("Atividade realizada");

        txtAtividadeRealizada.setColumns(20);
        txtAtividadeRealizada.setRows(5);
        jScrollPane1.setViewportView(txtAtividadeRealizada);

        lblDataTermino.setText("Data de término");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAtividadeRealizada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataAtividade)
                            .addComponent(lblDataTermino))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataAtividade)
                    .addComponent(txtDataAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataTermino)
                    .addComponent(txtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar)))
                    .addComponent(lblAtividadeRealizada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(formularioEstaValido())
        {
            try {
                salvar();           
                
                dispose();
            } catch (ValidacaoException ex) {
                _unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtividadeRealizada;
    private javax.swing.JLabel lblDataAtividade;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JTextArea txtAtividadeRealizada;
    private com.toedter.calendar.JDateChooser txtDataAtividade;
    private com.toedter.calendar.JDateChooser txtDataTermino;
    // End of variables declaration//GEN-END:variables

    private boolean formularioEstaValido() {
        return !StringHelper.estaNulaOuVazia(txtDataAtividade.getDate().toString())
                && !StringHelper.estaNulaOuVazia(txtAtividadeRealizada.getText());
    }

    private void preencheApontamento() {
        _apontamento = new Apontamento();
        
        _apontamento.setDataInicio(LocalDateTime.fromDateFields(txtDataAtividade.getDate()));
        
        _apontamento.setDetalhes(txtAtividadeRealizada.getText());
        
        if(!StringHelper.estaNulaOuVazia(txtDataTermino.getDate().toString()))
            _apontamento.setDataTermino(LocalDateTime.fromDateFields(txtDataAtividade.getDate()));
        
        _apontamento.setOrdemServicoId(_ordemServico.getOrdemServicoId());
        
        Usuario usuario = Authentication.getInstance().obterUsuarioAutenticado();
        _apontamento.setUsuarioId(usuario.getUsuarioId());
    }

    private void salvar() throws ValidacaoException {
        preencheApontamento();
        
        _unitOfWork = obterUnitOfWork();
        _unitOfWork.beginTransaction();

        _apontamentoRepository.salvar(_apontamento);

        _unitOfWork.commit();

        JOptionPane.showMessageDialog(this, "Apontamento realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    private IUnitOfWork obterUnitOfWork() {
        return new UnitOfWork(_apontamentoRepository.getDatabaseFactory());
    }
}
