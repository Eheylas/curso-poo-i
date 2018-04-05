package atividade08;

import javax.swing.JFrame;

/*
 * @author 1714290048
 */
public class TestaMouseMotionListener {
    public static void main(String[] args) {
        OuvinteMouseMotionListener ouvinte = new OuvinteMouseMotionListener();
        JFrame janela = new JFrame();
        janela.addMouseMotionListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

    
    

