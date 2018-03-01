package atividad02;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/*
 * @author 1714290048
 */
public class JanelaPrincipal extends JFrame {

    JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        janelaSobre = new JanelaSobre(this, true);
    }

    public void exibir() {
       setSize(640, 480);
       setTitle("Aplicação GUI");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setVisible(true);
       janelaSobre.exibir();
    }
}
