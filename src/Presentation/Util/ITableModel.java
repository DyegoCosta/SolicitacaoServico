package Presentation.Util;

import java.util.List;

public interface ITableModel<TEntity> extends javax.swing.table.TableModel {

    void addRow(TEntity entidade);
    void addRows(List<TEntity> entidades);
    void clear();
}
