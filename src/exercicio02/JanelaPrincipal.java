/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.awt.HeadlessException;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290032
 */
public class JanelaPrincipal extends JFrame {
    
    JanelaSobre janelaSobre;
    
    public JanelaPrincipal() throws HeadlessException {
    janelaSobre = new JanelaSobre(this, true);
    }

    public void exibir() {
        setSize(640, 480);
        setTitle("Aplicação GUI");
        setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        janelaSobre.exibir();
    }
}
