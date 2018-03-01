package atividad02;
import javax.swing.JFrame;
/*
 * @author 1714290048
 */
public class TestaJanelaPrincipal {
        public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640,480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
     }
}

