package Presentation.Util;

import Domain.Models.Apontamento;
import java.util.List;

public class TableModelApontamento extends TableModel<Apontamento> {

    public TableModelApontamento(List<Apontamento> apontamentos) {
        super(new String[]{"Usuário", "Data de inicio", "Data de término", "Detalhes"}, apontamentos);
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return entidades.get(row).getUsuario().getNome();
            case 1:
                return entidades.get(row).getDataInicio().toLocalDate().toString();
            case 2:
                return entidades.get(row).getDataTermino().toLocalDate().toString();
            case 3:
                return entidades.get(row).getDetalhes();
            default:
                throw new RuntimeException("coluna inválida");
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
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
