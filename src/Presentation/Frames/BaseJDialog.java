package Presentation.Frames;

import Presentation.Util.UIHelper;

public class BaseJDialog extends javax.swing.JDialog {
    public BaseJDialog(java.awt.Frame parent, boolean modal){
        super(parent, modal);
    }
    
    protected void habilitaCampos() {
        UIHelper.habilitaCampos(getContentPane());
    }
}
