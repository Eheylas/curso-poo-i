
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JanelaSobre extends JDialog{

    public JanelaSobre(JFrame owner, boolean modal) {
        super(owner, modal);
    }
    
    public void exbir(){
        setSize(320,240);
        setTitle("Sobre...");
        setLocationRelativeTo(null);
    }
}
