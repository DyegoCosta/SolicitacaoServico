package Domain.Models;

import java.util.Date;

public class Apontamento {
    
    private String detalhes;
    private int apontamentoId;
    private Date dataInicio;
    private int ordemServicoId;
    private int usuarioId;
    private Date dataTermino;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
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
