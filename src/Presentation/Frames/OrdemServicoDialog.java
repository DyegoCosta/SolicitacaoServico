package Presentation.Frames;

import Domain.Data.IDatabaseFactory;
import Domain.Models.OrdemServico;
import Domain.Models.Usuario;
import Domain.Repository.IOrdemServicoRepository;
import Domain.Repository.IUsuarioRepository;
import Infrastructure.Repository.UsuarioRepository;
import Presentation.Util.KeyValue;
import Presentation.Util.UIHelper;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JComboBox;

public class OrdemServicoDialog extends BaseJDialog {

    private IOrdemServicoRepository _ordemServicoRepository;
    private IUsuarioRepository _usuarioRepository;
    private OrdemServico _ordemServico;
    
    public OrdemServicoDialog(java.awt.Frame parent, IOrdemServicoRepository ordemServicoRepository) {
        this(parent, ordemServicoRepository, null);        
    }

    public OrdemServicoDialog(java.awt.Frame parent, IOrdemServicoRepository ordemServicoRepository, OrdemServico ordemServico) {
        super(parent, true);
        initComponents();
        
        UIHelper.criarGroupBox(panelAtendimento, "Atendimento");
        UIHelper.criarGroupBox(panelInformacoesRequerimento, "Requerimento");
        
        _ordemServicoRepository = ordemServicoRepository;
        _ordemServico = ordemServico;
        
        this.setLocationRelativeTo(null);
        
        preencheComboBoxes();
        
        if (estaModoEdicao())
            preencheFormulario();
        else
            super.habilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInformacoesRequerimento = new javax.swing.JPanel();
        lblPrioridade = new javax.swing.JLabel();
        lblObjetivo = new javax.swing.JLabel();
        cbxPrioridade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObjetivo = new javax.swing.JTextArea();
        panelAtendimento = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblAtendente = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblDataAbertura = new javax.swing.JLabel();
        lblAnalista = new javax.swing.JLabel();
        cbxAtendente = new javax.swing.JComboBox();
        cbxAnalista = new javax.swing.JComboBox();
        txtDataAbertura = new com.toedter.calendar.JDateChooser();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelInformacoesRequerimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrioridade.setText("Prioridade");

        lblObjetivo.setText("Objetivo");

        cbxPrioridade.setEnabled(false);

        txtObjetivo.setColumns(20);
        txtObjetivo.setRows(5);
        txtObjetivo.setEnabled(false);
        jScrollPane1.setViewportView(txtObjetivo);

        javax.swing.GroupLayout panelInformacoesRequerimentoLayout = new javax.swing.GroupLayout(panelInformacoesRequerimento);
        panelInformacoesRequerimento.setLayout(panelInformacoesRequerimentoLayout);
        panelInformacoesRequerimentoLayout.setHorizontalGroup(
            panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesRequerimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjetivo)
                    .addComponent(lblPrioridade))
                .addGap(18, 18, 18)
                .addGroup(panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInformacoesRequerimentoLayout.setVerticalGroup(
            panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesRequerimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrioridade)
                    .addComponent(cbxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacoesRequerimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjetivo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelAtendimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNumero.setText("Número");

        lblAtendente.setText("Atendente");

        txtNumero.setEnabled(false);

        lblDataAbertura.setText("Data abertura");

        lblAnalista.setText("Analista");

        cbxAtendente.setEnabled(false);

        cbxAnalista.setEnabled(false);

        txtDataAbertura.setEnabled(false);

        javax.swing.GroupLayout panelAtendimentoLayout = new javax.swing.GroupLayout(panelAtendimento);
        panelAtendimento.setLayout(panelAtendimentoLayout);
        panelAtendimentoLayout.setHorizontalGroup(
            panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAtendimentoLayout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addGap(32, 32, 32)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtendimentoLayout.createSequentialGroup()
                        .addComponent(lblAtendente)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAtendente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAtendimentoLayout.createSequentialGroup()
                        .addComponent(lblDataAbertura)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAtendimentoLayout.createSequentialGroup()
                        .addComponent(lblAnalista)
                        .addGap(50, 50, 50)
                        .addComponent(cbxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAtendimentoLayout.setVerticalGroup(
            panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumero)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDataAbertura))
                    .addComponent(txtDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtendente)
                    .addComponent(lblAnalista)
                    .addComponent(cbxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setEnabled(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelInformacoesRequerimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEdit)
                    .addComponent(btnExcluir))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(panelAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelInformacoesRequerimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxAnalista;
    private javax.swing.JComboBox cbxAtendente;
    private javax.swing.JComboBox cbxPrioridade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnalista;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObjetivo;
    private javax.swing.JLabel lblPrioridade;
    private javax.swing.JPanel panelAtendimento;
    private javax.swing.JPanel panelInformacoesRequerimento;
    private com.toedter.calendar.JDateChooser txtDataAbertura;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObjetivo;
    // End of variables declaration//GEN-END:variables

    private String gerarCodigoPadraoOrdemServico() {
        Calendar dataAtual = Calendar.getInstance(TimeZone.getTimeZone("GMT-3:00"));
        int ano = dataAtual.get(Calendar.YEAR);
        int mes = dataAtual.get(Calendar.MONTH);
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        int hora = dataAtual.get(Calendar.HOUR);
        int minuto = dataAtual.get(Calendar.MINUTE);

        return String.format("OS%s%s%s%s%s", ano, mes, dia, hora, minuto);
    }

    private void preencherComboBoxUsuarios(JComboBox comboBox, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            comboBox.addItem(new KeyValue(u.getNome(), String.valueOf(u.getUsuarioId())));
        }
    }

    private void preencherComboBoxPrioridades(JComboBox cbxPrioridade) {
        cbxPrioridade.addItem("Alta");
        cbxPrioridade.addItem("Média");
        cbxPrioridade.addItem("Baixa");
    }

    private void preencheComboBoxes() {
        List<Usuario> usuarios = _usuarioRepository.obterTodos();
        preencherComboBoxUsuarios(cbxAnalista, usuarios);
        preencherComboBoxUsuarios(cbxAtendente, usuarios);

        preencherComboBoxPrioridades(cbxPrioridade);
    }

    private boolean estaModoEdicao() {
        return _ordemServico != null;
    }

    private void preencheFormulario() {
        txtNumero.setText(_ordemServico.getOrdemServicoCodigo());
        txtObjetivo.setText(_ordemServico.getObjetivo());
        txtDataAbertura.setDate(_ordemServico.getDataAbertura().toDate());
    }
}
