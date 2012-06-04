package Domain.Models;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Apontamento {
    
    private String detalhes;
    private int apontamentoId;
    private LocalDateTime dataInicio;
    private int ordemServicoId;
    private int usuarioId;
    private LocalDateTime dataTermino;
    private Usuario usuario;
    private OrdemServico ordemServico;

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDateTime dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    public int getApontamentoId() {
        return apontamentoId;
    }
    
    public void setApontamentoId(int id) {
        this.apontamentoId = id;
    }
    
    public int getOrdemServicoId() {
        return ordemServicoId;
    }
    
    public void setOrdemServicoId(int ordemServicoId) {
        this.ordemServicoId = ordemServicoId;
    }
}
