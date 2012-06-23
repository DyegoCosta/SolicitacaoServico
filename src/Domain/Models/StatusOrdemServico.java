package Domain.Models;


public enum StatusOrdemServico {
    Nova(1),
    Aberta(2),
    Concluida(3),
    Pendente(4);
    
    private final int index;   

    StatusOrdemServico(int index) {
        this.index = index;
    }

    public int index() { 
        return index; 
    }
}
