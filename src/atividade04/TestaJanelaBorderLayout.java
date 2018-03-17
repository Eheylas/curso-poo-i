
package atividade04;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaBorderLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.red));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.green));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.blue));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.white));
        
        JFrame janela = new JFrame();
        janela.add(painel1, BorderLayout.NORTH);
        janela.add(painel2, BorderLayout.SOUTH);
        janela.add(painel3, BorderLayout.EAST);
        janela.add(painel4, BorderLayout.WEST);
        janela.add(painel5, BorderLayout.CENTER);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Janela BorderLayout");
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
