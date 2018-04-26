package atividade06;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Janela extends JFrame{

    public Janela() throws HeadlessException {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    
}
