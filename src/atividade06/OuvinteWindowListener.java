package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OuvinteWindowListener implements WindowListener{
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("JAnela aberta");
    }

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Janela fechada.");
    }

    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Janela minimizada.");
    }

    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Janela restaurada.");
    }

    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("NJanela ativa.");
    }

    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Janela inativa.");
    }
    
}
