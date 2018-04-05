package atividade07;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaNumeroKeyListener {
    public static void main(String[] args) {
        NumeroKeyListener ouvinte = new NumeroKeyListener();
        JTextField campo = new JTextField();
        campo.addKeyListener(ouvinte);
        JFrame janela = new JFrame();
        janela.add(campo);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}