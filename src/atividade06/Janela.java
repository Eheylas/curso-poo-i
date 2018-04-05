package atividade06;

import javax.swing.JFrame;

public class Janela extends JFrame{

    public Janela() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    
}