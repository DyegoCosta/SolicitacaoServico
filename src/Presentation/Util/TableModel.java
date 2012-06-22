package Presentation.Util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public abstract class TableModel<TEntity> extends AbstractTableModel {
    public TableModel(String[] colunas, List<TEntity> entidades)
    {
        this.colunas = colunas;
        this.entidades = entidades;
    }
    
    private List<TableModelListener> listeners = new ArrayList<TableModelListener>();
    protected List<TEntity> entidades;
    protected String[] colunas;
    
    @Override
    public abstract Object getValueAt(int rowIndex, int columnIndex);
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[ columnIndex];
    }

    @Override
    public int getRowCount() {
        return entidades.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }    
    
    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public abstract Class<?> getColumnClass(int columnIndex);

    public void addRow(TEntity entidade) {
        entidades.add(entidade);
        TableModelEvent event = new TableModelEvent(this, entidades.size() - 1, entidades.size() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        for (TableModelListener l : listeners) {
            l.tableChanged(event);
        }
    }       
    
    public void addRows(List<TEntity> entidades){
        for(TEntity e : entidades)
            this.entidades.add(e);
    }
    
    public void clear(){
        entidades.clear();
    }
}
