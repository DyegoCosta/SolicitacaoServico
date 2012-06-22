package Presentation.Util;

import Domain.Models.Usuario;
import java.util.List;

public class TableModelUsuario extends TableModel<Usuario> {
    public TableModelUsuario(List<Usuario> usuarios) {        
        super(new String[]{"Id", "Nome", "Sobrenome", "Login"}, usuarios);                
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return entidades.get(row).getUsuarioId();
            case 1:
                return entidades.get(row).getNome();
            case 2:
                return entidades.get(row).getSobrenome();
            case 3:
                return entidades.get(row).getLogin();
            default:
                throw new RuntimeException("coluna inválida");
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex)  {
        switch (columnIndex) {
            case 0:
                return Integer.class;
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