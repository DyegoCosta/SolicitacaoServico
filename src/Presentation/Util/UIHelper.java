package Presentation.Util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class UIHelper {

    public static void criarGroupBox(JPanel panel, String titulo) {
        panel.setBorder(BorderFactory.createTitledBorder(titulo));
    }

    public static void limpaCampos(Container container) {
        for (Component component : container.getComponents()) {

            if (component instanceof JTextField)
                limpaTextField((JTextField) component);
            else if (component instanceof JComboBox)
                limpaComboBox((JComboBox) component);
            else if (component instanceof JCheckBox)
                limpaCheckBox((JCheckBox) component);
            else if (component instanceof JPanel)
                limpaCampos((JPanel) component);
        }
    }

    private static void limpaTextField(JTextField textField) {
        textField.setText("");
    }

    private static void limpaComboBox(JComboBox comboBox) {
        comboBox.setSelectedItem(null);
    }

    private static void limpaCheckBox(JCheckBox checkBox) {
        checkBox.setSelected(false);
    }

    public static void habilitaCampos(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTextComponent)
                habilitaTextField((JTextComponent) component);
            else if (component instanceof JComboBox)
                habilitaComponent(component);
            else if (component instanceof JCheckBox)
                habilitaComponent(component);
            else if (component instanceof JRadioButton)
                habilitaComponent(component);
            else if (component instanceof JPanel)
                habilitaCampos((JPanel) component);            
            else if (component instanceof JScrollPane)
                habilitaComponent((JScrollPane) component);
        }
    }

    private static void habilitaTextField(JTextComponent textField) {
        textField.setEditable(true);
    }

    private static void habilitaComponent(Component component) {
        component.setEnabled(true);
    }
}
