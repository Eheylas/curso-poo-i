
package atividade04;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaFlowLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.red));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.green));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.blue));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JFrame janela = new JFrame();
        
        FlowLayout leiaute = new FlowLayout(FlowLayout.RIGHT);
        
        janela.setLayout(leiaute);
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        janela.setSize(640, 480);
        janela.setTitle("Janela FlowLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
