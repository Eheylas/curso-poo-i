package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290040
 */
public class TestaJanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Isso é uma janela Java!!!");
        janela.setSize(640,480);
        janela.setVisible(true); //faz a janela ser visível
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para o programa quando se fecha a janela
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH); //apresenta a tela maximizada por padrão
    }
    
}
