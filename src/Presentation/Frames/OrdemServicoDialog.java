package Presentation.Frames;

import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Models.OrdemServico;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import Infrastructure.Repository.UsuarioRepository;
import Presentation.Util.KeyValue;
import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class OrdemServicoDialog extends javax.swing.JDialog {
    private IUsuarioRepository _usuarioRepository;
    private boolean _modoEdicao;
    
    public OrdemServicoDialog(java.awt.Frame parent, boolean modal, IDatabaseFactory databaseFactory) {
        super(parent, modal);
        _usuarioRepository = new UsuarioRepository(databaseFactory, null);
        
        initComponents();
        
        PreencherComponentes();
        
        HabilitarCamposParaCriacao();        
        
        this.setLocationRelativeTo(null);
    }
    
    public OrdemServicoDialog(java.awt.Frame parent, boolean modal, OrdemServico ordemServico, boolean editavel) {
        super(parent, modal);
        initComponents();
        
        _modoEdicao = editavel;
        
        PreencherComponentes(ordemServico);
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblPrioridade = new javax.swing.JLabel();
        lblObjetivo = new javax.swing.JLabel();
        cbxPrioridade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObjetivo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrioridade.setText("Prioridade");

        lblObjetivo.setText("Objetivo");

        cbxPrioridade.setEnabled(false);

        txtObjetivo.setColumns(20);
        txtObjetivo.setRows(5);
        txtObjetivo.setEnabled(false);
        jScrollPane1.setViewportView(txtObjetivo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjetivo)
                    .addComponent(lblPrioridade))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrioridade)
                    .addComponent(cbxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjetivo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNumero.setText("Número");

        lblAtendente.setText("Atendente");

        txtNumero.setEnabled(false);

        lblDataAbertura.setText("Data abertura");

        lblAnalista.setText("Analista");

        cbxAtendente.setEnabled(false);

        cbxAnalista.setEnabled(false);

        txtDataAbertura.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addGap(32, 32, 32)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAtendente)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAtendente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDataAbertura)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAnalista)
                        .addGap(50, 50, 50)
                        .addComponent(cbxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumero)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDataAbertura))
                    .addComponent(txtDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtendente)
                    .addComponent(lblAnalista)
                    .addComponent(cbxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Icons/Editar.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEdit))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                OrdemServicoDialog dialog = new OrdemServicoDialog(new javax.swing.JFrame(), true, new DatabaseFactory(""));
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxAnalista;
    private javax.swing.JComboBox cbxAtendente;
    private javax.swing.JComboBox cbxPrioridade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnalista;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObjetivo;
    private javax.swing.JLabel lblPrioridade;
    private com.toedter.calendar.JDateChooser txtDataAbertura;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObjetivo;
    // End of variables declaration//GEN-END:variables

    private void PreencherComponentes() {   
        PreencheComboBoxes();
        
        txtNumero.setText(GerarCodigoPadraoOrdemServico());        
        txtDataAbertura.setDate(new Date());               
    }

    private void PreencherComponentes(OrdemServico ordemServico) {
        PreencheComboBoxes();
        
        txtNumero.setText(ordemServico.getOrdemServicoCodigo());
        txtDataAbertura.setDate(ordemServico.getDataAbertura().toDate());
        txtObjetivo.setText(ordemServico.getObjetivo());
    }
    
    private String GerarCodigoPadraoOrdemServico() {        
        Calendar dataAtual = Calendar.getInstance(TimeZone.getTimeZone("GMT-3:00"));
        int ano = dataAtual.get(Calendar.YEAR);
        int mes = dataAtual.get(Calendar.MONTH);
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        int hora = dataAtual.get(Calendar.HOUR);
        int minuto = dataAtual.get(Calendar.MINUTE);
        int milessegundo = dataAtual.get(Calendar.MILLISECOND);
        
        return String.format("OS%s%s%s%s%s%s", ano, mes, dia, hora, minuto, milessegundo);
    }

    private void PreencherComboBoxUsuarios(JComboBox comboBox, List<Usuario> usuarios) {
        for(Usuario u : usuarios)
            comboBox.addItem(new KeyValue(u.getNome(), String.valueOf(u.getUsuarioId())));
    }

    private void PreencherComboBoxPrioridades(JComboBox cbxPrioridade) {
        cbxPrioridade.addItem("Alta");
        cbxPrioridade.addItem("Média");
        cbxPrioridade.addItem("Baixa");
    }

    private void HabilitarCampos() {
        txtDataAbertura.setEnabled(true);
        txtNumero.setEnabled(true);
        txtObjetivo.setEnabled(true);
        cbxAnalista.setEnabled(true);
        cbxAtendente.setEnabled(true);
        cbxPrioridade.setEnabled(true);        
        
        // O botão editar será desabilitado pois se os campos editáveis
        // estiverem habilitados será para edição ou criação de uma OS        
        btnEdit.setEnabled(true);         
    }

    private void HabilitarCamposParaCriacao() {
        HabilitarCampos();
        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    private void PreencheComboBoxes() {
        List<Usuario> usuarios = _usuarioRepository.obterTodos();
        PreencherComboBoxUsuarios(cbxAnalista, usuarios);                
        PreencherComboBoxUsuarios(cbxAtendente, usuarios);
        
        PreencherComboBoxPrioridades(cbxPrioridade);
    }
}
