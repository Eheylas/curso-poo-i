package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class OuvinteWindowFocusListener implements WindowFocusListener{
    public void windowGainedFocus(WindowEvent we) {
        throw new UnsupportedOperationException("Janela ganhou o foco.");
    }

    public void windowLostFocus(WindowEvent we) {
        throw new UnsupportedOperationException("Janela perdeu o foco.");
    }
    
}
