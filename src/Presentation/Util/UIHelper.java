package Presentation.Util;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class UIHelper {

    public static void criarGroupBox(JPanel panel, String titulo) {
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
    }
}
