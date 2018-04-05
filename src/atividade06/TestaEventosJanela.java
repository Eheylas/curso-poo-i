package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestaEventosJanela {
    public static void main(String[] args) {
        Janela janela = new Janela();
        
        janela.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
                JOptionPane.showMessageDialog(null, "Dica do dia");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                int opcao = JOptionPane.showConfirmDialog(null, "Quer sair da aplicação ", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(opcao == JOptionPane.YES_NO_OPTION){
                    //System.exit(0);
                    ((JFrame)we.getSource()).dispose();
                }
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                
            }

            @Override
            public void windowActivated(WindowEvent we) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                
            }
        });
    }
}