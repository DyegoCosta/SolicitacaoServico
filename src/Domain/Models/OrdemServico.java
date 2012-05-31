package Domain.Models;

import java.util.Date;

public class OrdemServico {

    private Date dataAbertura;
    private Integer analistaId;
    private int atendenteId;
    private int clienteId;
    private Date dataFechamento;
    private String objetivo;
    private int ordemServicoId;
    private StatusOrdemServico status;
    private Integer tecnicoId;
    private int prioridade;
    private String ordemServicoCodigo; //OS1111232010(OSAnoMesDiaHoraMinuto)

    public String getOrdemServicoCodigo() {
        return ordemServicoCodigo;
    }

    public void setOrdemServicoCodigo(String ordemServicoCodigo) {
        this.ordemServicoCodigo = ordemServicoCodigo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getAnalistaId() {
        return analistaId;
    }

    public void setAnalistaId(int analistaId) {
        this.analistaId = analistaId;
    }

    public int getAtendenteId() {
        return atendenteId;
    }

    public void setAtendenteId(int atendenteId) {
        this.atendenteId = atendenteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getOrdemServicoId() {
        return ordemServicoId;
    }

    public void setOrdemServicoId(int ordemServicoId) {
        this.ordemServicoId = ordemServicoId;
    }

    public Integer getTecnicoId() {
        return tecnicoId;
    }

    public void setTecnicoId(Integer tecnicoId) {
        this.tecnicoId = tecnicoId;
    }

    public StatusOrdemServico getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemServico status) {
        this.status = status;
    }
}
