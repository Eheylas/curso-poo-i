package atividade06;
/*
 * @author 1714290048
 */
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class OuvinteWindowListener implements WindowListener{
    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Janela aberta"); 
    }

    @Override
    public void windowClosing(WindowEvent we) {
        throw new UnsupportedOperationException("Fechando a janela");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Janela fechada"); 
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Janela minimizada"); 
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Janela restaurada"); 
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Janela ativa"); 
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Janela inativa");
    }
    
}
