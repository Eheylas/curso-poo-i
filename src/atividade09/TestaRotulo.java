package atividade09;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class TestaRotulo {
    public static void main(String[] args) {
        JLabel rotulo1 = new JLabel();
        rotulo1.setText("Este rótulo está ativo!");
        rotulo1.setToolTipText("Rótulo 1");
        
        JLabel rotulo2 = new JLabel("Este rótulo está inativo!");
        rotulo2.setEnabled(false);
        
        JFrame janela = new JFrame();
        janela.add(rotulo1, BorderLayout.NORTH);
        janela.add(rotulo2, BorderLayout.SOUTH);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}