package Presentation.Util;

import Domain.Models.Cliente;
import java.util.List;

public class TableModelCliente extends TableModel<Cliente> {
    public TableModelCliente(List<Cliente> clientes) {
        super(new String[]{"Razão Social", "Responsavel", "Telefone", "Email"}, clientes);                
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return entidades.get(row).getRazaoSocial();
            case 1:
                return entidades.get(row).getNomeResponsavel();
            case 2:
                return entidades.get(row).getTelefone();
            case 3:
                return entidades.get(row).getEmail();
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