package atividade06;

import javax.swing.JFrame;

/*
 * @author 1714290048
 */
public class TestaWindowListener {

    public static void main(String[] args) {
        OuvinteWindowListener ouvinte = new OuvinteWindowListener();
        JFrame janela = new JFrame();
        janela.addWindowListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);

    }
}
