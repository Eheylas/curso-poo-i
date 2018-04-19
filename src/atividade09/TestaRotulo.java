
package atividade09;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestaRotulo {
    public static void main(String[] args) {
        JLabel rotulo1 = new JLabel();
        rotulo1.setText("Este rótulo está ativo.");
        rotulo1.setToolTipText("Rótulo 1");
        
        JLabel rotulo2 = new JLabel("8 8 8 8 8 ** * * .");
        rotulo2.setEnabled(false);
        
        JFrame janela = new JFrame();
        janela.add(rotulo1, BorderLayout.NORTH);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300,300);
        
        janela.add(rotulo2, BorderLayout.SOUTH);
    }
}
