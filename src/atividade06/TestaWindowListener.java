
package atividade06;

import javax.swing.JFrame;

public class TestaWindowListener {
    public static void main(String[] args) {
        OuvinteWindowListener ouvinte = new OuvinteWindowListener();
        JFrame janela = new JFrame();
        janela.addWindowListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
