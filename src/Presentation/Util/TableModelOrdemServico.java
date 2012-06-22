package Presentation.Util;

import Domain.Models.OrdemServico;
import java.util.List;

public class TableModelOrdemServico  extends TableModel<OrdemServico> {
    public TableModelOrdemServico(List<OrdemServico> ordensServico) {
        super(new String[]{"Código", "Cliente", "Contato", "Telefone"}, ordensServico);                
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return entidades.get(row).getOrdemServicoCodigo();
            case 1:
                return entidades.get(row).getCliente().getRazaoSocial();
            case 2:
                return entidades.get(row).getCliente().getNomeResponsavel();
            case 3:
                return entidades.get(row).getCliente().getTelefone();
            default:
                throw new RuntimeException("coluna inválida");
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)  {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            default:
                throw new RuntimeException("coluna inválida");
                
        }        
    }   
}
