
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OuvinteWindowListener implements WindowListener{

    
    public void windowOpened(WindowEvent we) {
        System.out.println("Janela Aberta");
    }

    
    public void windowClosing(WindowEvent we) {
        System.out.println("Janela Fechando");
        System.exit(0);
    }

    
    public void windowClosed(WindowEvent we) {
        System.out.println("Janela Fechada");
    }

    
    public void windowIconified(WindowEvent we) {
        System.out.println("Janela Minimizada");
    }

    
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Janela Resaurada");
        
    }

    
    public void windowActivated(WindowEvent we) {
        System.out.println("Janela Ativa");
    }

    
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Janela Desativada");
    }
    
}
