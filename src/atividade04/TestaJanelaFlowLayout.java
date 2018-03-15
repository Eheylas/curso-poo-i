package atividade04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290040
 */
public class TestaJanelaFlowLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         painel1.setPreferredSize(new Dimension(615,430));
         painel2.setPreferredSize(new Dimension(605,420));
         painel3.setPreferredSize(new Dimension(595,410));
         painel4.setPreferredSize(new Dimension(585,400));
        
        JFrame janela = new JFrame();
        FlowLayout leiaute =  new FlowLayout(FlowLayout.LEFT); 
        janela.setLayout(leiaute);
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        painel1.add(painel2);
        painel2.add(painel3);
        painel3.add(painel4);
        janela.setSize(640,480);
        janela.setTitle("Janela FlowLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
