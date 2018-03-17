package atividade03;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaComPaineis {

    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.red));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.green));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.blue));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.black));
        
        painel4.add(painel1);
        painel4.add(painel2);
        painel4.add(painel3);
        
        JFrame janela = new JFrame();
        janela.add(painel4);
        janela.setSize(640, 480);
        janela.setTitle("Janela com painéis");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
