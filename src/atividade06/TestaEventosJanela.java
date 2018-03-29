package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class TestaEventosJanela {
    public static void main(String[] args){
        Janela janela = new Janela();
        janela.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent we) {
                JOptionPane.showMessageDialog(null, "Dica do Dia.");
            }

            public void windowClosing(WindowEvent we) {
                JOptionPane.showMessageDialog(null, "Quer sair da aplicação?");
            }

            public void windowClosed(WindowEvent we) {
            }

            public void windowIconified(WindowEvent we) {
            }

            public void windowDeiconified(WindowEvent we) {
            }

            public void windowActivated(WindowEvent we) {
            }

            public void windowDeactivated(WindowEvent we) {
            }
        });
    }
}
