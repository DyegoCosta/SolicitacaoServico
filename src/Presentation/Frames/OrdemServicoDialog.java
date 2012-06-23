package Presentation.Frames;

import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import Domain.Models.*;
import Domain.Repository.IApontamentoRepository;
import Domain.Repository.IClienteRepository;
import Domain.Repository.IOrdemServicoRepository;
import Domain.Repository.IUsuarioRepository;
import Presentation.Util.ITableModel;
import Presentation.Util.KeyValue;
import Presentation.Util.TableModelApontamento;
import Presentation.Util.UIHelper;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.joda.time.LocalDateTime;

public final class OrdemServicoDialog extends BaseJDialog {

    private IUnitOfWork _unitOfWork;
    private IOrdemServicoRepository _ordemServicoRepository;
    private IUsuarioRepository _usuarioRepository;
    private IClienteRepository _clienteRepository;
    private IApontamentoRepository _apontamentoRepository;
    private OrdemServico _ordemServico;
    private ITableModel _modelApontamentos;
    private List<Apontamento> _apontamentos;

    public OrdemServicoDialog(java.awt.Frame parent,
            IOrdemServicoRepository ordemServicoRepository,
            IUsuarioRepository usuarioRepository,
            IClienteRepository clienteRepository,
            IApontamentoRepository apontamentoRepository) {
        this(parent, ordemServicoRepository, usuarioRepository, clienteRepository, apontamentoRepository, null);
    }

    public OrdemServicoDialog(java.awt.Frame parent,
            IOrdemServicoRepository ordemServicoRepository,
            IUsuarioRepository usuarioRepository,
            IClienteRepository clienteRepository,
            IApontamentoRepository apontamentoRepository,
            OrdemServico ordemServico) {
        super(parent, true);
        initComponents();

        UIHelper.criarGroupBox(panelAtendimento, "Atendimento");
        UIHelper.criarGroupBox(panelInformacoesRequerimento, "Requerimento");
        UIHelper.criarGroupBox(panelApontamentos, "Apontamentos");

        _clienteRepository = clienteRepository;
        _usuarioRepository = usuarioRepository;
        _ordemServicoRepository = ordemServicoRepository;
        _apontamentoRepository = apontamentoRepository;

        _ordemServico = ordemServico;

        preencheComboBoxes();

        preencheApontamentos();

        habilitaBotoes();

        if (estaModoEdicao()) {
            preencheFormulario();
        } else {
            this.habilitaCampos();
        }

        this.setLocationRelativeTo(null);
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
        lblTecnico = new javax.swing.JLabel();
        cbxAtendente = new javax.swing.JComboBox();
        txtDataAbertura = new com.toedter.calendar.JDateChooser();
        lblCliente = new javax.swing.JLabel();
        cbxTecnico = new javax.swing.JComboBox();
        cbxClientes = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        panelApontamentos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListaApontamentos = new javax.swing.JTable();
        btnAdicionarApontamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(656, 680));

        panelInformacoesRequerimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrioridade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrioridade.setText("Prioridade");

        lblObjetivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setText("Número");

        lblAtendente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAtendente.setText("Atendente");

        txtNumero.setEnabled(false);

        lblDataAbertura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDataAbertura.setText("Data abertura");

        lblTecnico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTecnico.setText("Técnico");

        cbxAtendente.setEnabled(false);

        txtDataAbertura.setEnabled(false);

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCliente.setText("Cliente");

        cbxTecnico.setEnabled(false);

        cbxClientes.setEnabled(false);

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
                        .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtendente)
                            .addComponent(lblCliente))
                        .addGap(18, 18, 18)
                        .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAtendente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTecnico)
                    .addGroup(panelAtendimentoLayout.createSequentialGroup()
                        .addComponent(lblDataAbertura)
                        .addGap(18, 18, 18)
                        .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(cbxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        panelApontamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblListaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Data de início", "Data de término", "Detalhes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaApontamentos.setAutoscrolls(false);
        jScrollPane3.setViewportView(tblListaApontamentos);

        btnAdicionarApontamento.setText("Adicionar");
        btnAdicionarApontamento.setEnabled(false);
        btnAdicionarApontamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarApontamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelApontamentosLayout = new javax.swing.GroupLayout(panelApontamentos);
        panelApontamentos.setLayout(panelApontamentosLayout);
        panelApontamentosLayout.setHorizontalGroup(
            panelApontamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApontamentosLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelApontamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarApontamento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelApontamentosLayout.setVerticalGroup(
            panelApontamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelApontamentosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAdicionarApontamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelApontamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInformacoesRequerimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(panelAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInformacoesRequerimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelApontamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (dadosValidos()) {
            try {
                salvar();
                btnSalvar.setEnabled(false);
            } catch (ValidacaoException ex) {
                _unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (estaModoEdicao() && exclusaoConfirmada()) {
            try {
                excluir();
            } catch (ValidacaoException ex) {
                _unitOfWork.rollback();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitaCampos();
        txtNumero.setEditable(false);
        btnSalvar.setEnabled(true);
        txtObjetivo.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAdicionarApontamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarApontamentoActionPerformed
        ApontamentoDialog dialog = new ApontamentoDialog(null, true, _apontamentoRepository, _ordemServico);
        dialog.setVisible(true);

        pesquisar();
    }//GEN-LAST:event_btnAdicionarApontamentoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarApontamento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxAtendente;
    private javax.swing.JComboBox cbxClientes;
    private javax.swing.JComboBox cbxPrioridade;
    private javax.swing.JComboBox cbxTecnico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObjetivo;
    private javax.swing.JLabel lblPrioridade;
    private javax.swing.JLabel lblTecnico;
    private javax.swing.JPanel panelApontamentos;
    private javax.swing.JPanel panelAtendimento;
    private javax.swing.JPanel panelInformacoesRequerimento;
    private javax.swing.JTable tblListaApontamentos;
    private com.toedter.calendar.JDateChooser txtDataAbertura;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObjetivo;
    // End of variables declaration//GEN-END:variables

    private IUnitOfWork obterUnitOfWork() {
        return new UnitOfWork(_ordemServicoRepository.getDatabaseFactory());
    }

    private void habilitaBotoes() {
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(estaModoEdicao());
        btnExcluir.setEnabled(estaModoEdicao());

        if (!estaModoEdicao()) {
            btnSalvar.setEnabled(true);
        }
    }

    private String gerarCodigoPadraoOrdemServico() {
        Calendar dataAtual = Calendar.getInstance(TimeZone.getTimeZone("GMT-3:00"));
        int ano = dataAtual.get(Calendar.YEAR);
        int mes = dataAtual.get(Calendar.MONTH);
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        int hora = dataAtual.get(Calendar.HOUR);
        int minuto = dataAtual.get(Calendar.MINUTE);

        return String.format("OS%s%s%s%s%s", ano, mes, dia, hora, minuto);
    }

    private void preencherComboBoxPrioridades(JComboBox cbxPrioridade) {
        cbxPrioridade.addItem(new KeyValue("Alta", "0"));
        cbxPrioridade.addItem(new KeyValue("Média", "1"));
        cbxPrioridade.addItem(new KeyValue("Baixa", "2"));
    }

    private void preencheComboBoxes() {
        List<Usuario> usuarios = _usuarioRepository.obterTodos();
        List<Cliente> clientes = _clienteRepository.obterTodos();

        preencherComboBoxUsuarios(cbxTecnico, usuarios);
        preencherComboBoxUsuarios(cbxAtendente, usuarios);
        preencherComboBoxClientes(clientes);

        preencherComboBoxPrioridades(cbxPrioridade);
    }

    private void preencherComboBoxUsuarios(JComboBox comboBox, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            comboBox.addItem(new KeyValue(u.getNome(), String.valueOf(u.getUsuarioId())));
        }
    }

    private void preencherComboBoxClientes(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            cbxClientes.addItem(new KeyValue(c.getRazaoSocial(), String.valueOf(c.getClienteId())));
        }
    }

    private boolean estaModoEdicao() {
        return _ordemServico != null;
    }

    private void preencheFormulario() {
        txtNumero.setText(_ordemServico.getOrdemServicoCodigo());
        txtObjetivo.setText(_ordemServico.getObjetivo());
        txtDataAbertura.setDate(_ordemServico.getDataAbertura().toDate());
    }

    @Override
    protected void habilitaCampos() {
        txtNumero.setText(gerarCodigoPadraoOrdemServico());
        txtDataAbertura.setDate(Calendar.getInstance(TimeZone.getTimeZone("GMT-3:00")).getTime());

        txtNumero.setEnabled(true);
        txtDataAbertura.setEnabled(true);
        txtObjetivo.setEnabled(true);

        super.habilitaCampos();
    }

    private boolean dadosValidos() {
        return !StringHelper.estaNulaOuVazia(txtNumero.getText())
                && !StringHelper.estaNulaOuVazia(txtObjetivo.getText())
                && !StringHelper.estaNulaOuVazia(txtDataAbertura.toString());
    }

    private void salvar() throws ValidacaoException {
        preencheOrdemServico();

        _unitOfWork = obterUnitOfWork();
        _unitOfWork.beginTransaction();

        _ordemServicoRepository.salvar(_ordemServico);

        _unitOfWork.commit();

        JOptionPane.showMessageDialog(this, "OS salva com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void preencheOrdemServico() {
        if (!estaModoEdicao()) {
            _ordemServico = new OrdemServico();
        }

        _ordemServico.setOrdemServicoCodigo(txtNumero.getText());

        KeyValue atendente = (KeyValue) cbxAtendente.getModel().getSelectedItem();
        _ordemServico.setAtendenteId(Integer.valueOf(atendente.getValue()));

        KeyValue tecnico = (KeyValue) cbxTecnico.getModel().getSelectedItem();
        _ordemServico.setTecnicoId(Integer.valueOf(tecnico.getValue()));

        KeyValue cliente = (KeyValue) cbxClientes.getModel().getSelectedItem();
        _ordemServico.setClienteId(Integer.valueOf(cliente.getValue()));

        KeyValue prioridade = (KeyValue) cbxPrioridade.getModel().getSelectedItem();
        _ordemServico.setPrioridade(Integer.valueOf(prioridade.getValue()));

        _ordemServico.setObjetivo(txtObjetivo.getText());

        _ordemServico.setDataAbertura(LocalDateTime.fromDateFields(txtDataAbertura.getDate()));        
    }

    private boolean exclusaoConfirmada() {
        return JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0;
    }

    private void excluir() throws ValidacaoException {
        _unitOfWork = obterUnitOfWork();
        _unitOfWork.beginTransaction();
        _ordemServicoRepository.deletar(_ordemServico);
        _unitOfWork.commit();

        JOptionPane.showMessageDialog(this, "OS excluída com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        if (!estaModoEdicao()) {
            dispose();
        }
    }

    private void preencheApontamentosPelaOrdemServico() {
        if (estaModoEdicao()) {
            _apontamentos = _ordemServico.getApontamentos();
        }
    }

    private void preencheApontamentosBuscandoNoBanco() {
        _apontamentos = _apontamentoRepository.obterPorOrdemServico(_ordemServico.getOrdemServicoId());
    }

    private void preencheApontamentoTableModel() {
        _modelApontamentos = new TableModelApontamento(_apontamentos);
    }

    private void pesquisar() {
        preencheApontamentosBuscandoNoBanco();
        preencheApontamentoTableModel();

        tblListaApontamentos.setModel(_modelApontamentos);
    }

    private void preencheApontamentos() {
        if(estaModoEdicao()){
            preencheApontamentosPelaOrdemServico();
            preencheApontamentoTableModel();
            tblListaApontamentos.setModel(_modelApontamentos);
            
            btnAdicionarApontamento.setEnabled(true);
        }
    }
}
