package Presentation.Util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.*;

public class UIHelper {
    
    public static void criarGroupBox(JPanel panel, String titulo) {
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
    }
    
    public static void habilitaCampos(Container container) {
        for (Component component : container.getComponents()) {
            
            if (component instanceof JTextField)
                habilitaTextField((JTextField) component);
            else if (component instanceof JComponent)
                habilitaComponent((JComponent) component);
            else if (component instanceof Container)
                habilitaCampos(container);
        }
    }
    
    private static void habilitaTextField(JTextField textField) {
        textField.setEditable(true);
    }
    
    private static void habilitaComponent(JComponent component) {
        component.setEnabled(true);
    }
}
