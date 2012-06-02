package Domain.Models;

import java.util.List;

public class Cliente {

    private String CNPJ;
    private int clienteId;
    private String razaoSocial;
    private String nomeResponsavel;
    private String telefone;
    private String email;
    private String endereco;
    private List<OrdemServico> ordensServicos;

    public List<OrdemServico> getOrdensServicos() {
        return ordensServicos;
    }

    public void setOrdensServicos(List<OrdemServico> ordensServicos) {
        this.ordensServicos = ordensServicos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int id) {
        this.clienteId = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
