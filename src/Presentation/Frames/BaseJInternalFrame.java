package Presentation.Frames;

import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import javax.swing.JOptionPane;

public abstract class BaseJInternalFrame<TEntidade> extends javax.swing.JInternalFrame{
    private IDatabaseFactory _databaseFactory;
    
    public BaseJInternalFrame(IDatabaseFactory databaseFactory){
        _databaseFactory = databaseFactory;
    }
    
    protected boolean exclusaoConfirmada() {
        return JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0;
    }
    
    protected IUnitOfWork obterUnitOfWork() {
        return new UnitOfWork(_databaseFactory);
    }
    
    protected IDatabaseFactory getDatabaseFactory(){
        return _databaseFactory;
    }
}
