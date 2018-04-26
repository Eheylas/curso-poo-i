package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class OuvinteWindowStateListener implements WindowStateListener{
    public void windowStateChanged(WindowEvent we) {
        throw new UnsupportedOperationException("A janela passou de " + we.getOldState() + " para " + we.getNewState() + ".");
    }
    
    
}
