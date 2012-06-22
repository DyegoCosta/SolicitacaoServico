package Presentation.Util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class UIHelper {

    public static void criarGroupBox(JPanel panel, String titulo) {
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
    }
    
    public static void habilitaCampos(Container container){
        for(Component component : container.getComponents()){
            
        }
    }
}
