package Domain.Application;

import javax.swing.JOptionPane;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread thread, Throwable thrwbl) {
        String mensagem = String.format("Um erro ocorreu: %s", thrwbl.getMessage());
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
