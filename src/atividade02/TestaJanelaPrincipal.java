
package atividade02;

import javax.swing.JFrame;

public class TestaJanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640, 480);
        janela.setVisible(true);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
