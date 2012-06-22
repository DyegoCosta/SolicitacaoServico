package Domain.Models;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDateTime;

public class OrdemServico {
    private LocalDateTime dataAbertura;
    private Integer analistaId;
    private int atendenteId;
    private int clienteId;
    private LocalDateTime dataFechamento;
    private String objetivo;
    private int ordemServicoId;
    private StatusOrdemServico status;
    private Integer tecnicoId;
    private int prioridade;
    private String ordemServicoCodigo; //OS1111232010(OSAnoMesDiaHoraMinuto)
    private Cliente cliente;
    private Usuario atendente;
    private Usuario tecnico;
    private Usuario analista;
    private List<Apontamento> apontamentos = new ArrayList<Apontamento>();

    public List<Apontamento> getApontamentos() {
        return apontamentos;
    }

    public void setApontamentos(List<Apontamento> apontamentos) {
        this.apontamentos = apontamentos;
    }

    public Usuario getAnalista() {
        return analista;
    }

    public void setAnalista(Usuario analista) {
        this.analista = analista;
    }

    public Usuario getAtendente() {
        return atendente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getAnalistaId() {
        return analistaId;
    }

    public void setAnalistaId(Integer analistaId) {
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
