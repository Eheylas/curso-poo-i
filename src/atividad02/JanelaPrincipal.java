package atividad02;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/*
 * @author 1714290048
 */
public class JanelaPrincipal extends JFrame {

    JanelaSobre janelaSobre;

    public JanelaPrincipal() throws HeadlessException {
        janelaSobre = new JanelaSobre(this, true);
    }

    public void exibir() {
        JFrame janela = new JFrame();
        janela.setSize(640, 480);
        janela.setTitle("Aplicação GUI");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        exibir();
        janela.setVisible(true);
    }
}
