package atividade08;

import javax.swing.JFrame;

public class TestaMouseWheelListener {
    public static void main(String[] args){
        OuvinteMouseWheelListener ouvinte = new OuvinteMouseWheelListener();
        JFrame janela = new JFrame();
        janela.addMouseWheelListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
