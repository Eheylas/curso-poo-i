package atividade04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout {

    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.red));
        painel1.setPreferredSize(new Dimension(50, 50));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.blue));
        painel2.setPreferredSize(new Dimension(50, 50));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.green));
        painel3.setPreferredSize(new Dimension(50, 50));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.orange));
        painel4.setPreferredSize(new Dimension(50, 50));
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.red));
        painel5.setPreferredSize(new Dimension(50, 50));
        JPanel painel6 = new JPanel();
        painel6.setBorder(BorderFactory.createLineBorder(Color.blue));
        painel6.setPreferredSize(new Dimension(50, 50));
        JPanel painel7 = new JPanel();
        painel7.setBorder(BorderFactory.createLineBorder(Color.green));
        painel7.setPreferredSize(new Dimension(50, 50));
        JPanel painel8 = new JPanel();
        painel8.setBorder(BorderFactory.createLineBorder(Color.orange));
        painel8.setPreferredSize(new Dimension(50, 50));
        JPanel painel9 = new JPanel();
        painel9.setBorder(BorderFactory.createLineBorder(Color.red));
        painel9.setPreferredSize(new Dimension(50, 50));
        JPanel painel10 = new JPanel();
        painel10.setBorder(BorderFactory.createLineBorder(Color.blue));
        painel10.setPreferredSize(new Dimension(50, 50));
        JPanel painel11 = new JPanel();
        painel11.setBorder(BorderFactory.createLineBorder(Color.green));
        painel11.setPreferredSize(new Dimension(50, 50));
        JPanel painel12 = new JPanel();
        painel12.setBorder(BorderFactory.createLineBorder(Color.orange));
        painel12.setPreferredSize(new Dimension(50, 50));

        JPanel conteiner1 = new JPanel();
        FlowLayout leiaute1 = new FlowLayout(FlowLayout.LEFT);
        conteiner1.setLayout(leiaute1);
        conteiner1.setBorder(BorderFactory.createLineBorder(Color.black));
        conteiner1.add(painel1);
        conteiner1.add(painel2);
        conteiner1.add(painel3);
        conteiner1.add(painel4);

        JPanel conteiner2 = new JPanel();
        FlowLayout leiaute2 = new FlowLayout(FlowLayout.CENTER);
        conteiner2.setLayout(leiaute2);
        conteiner2.setBorder(BorderFactory.createLineBorder(Color.black));
        conteiner2.add(painel5);
        conteiner2.add(painel6);
        conteiner2.add(painel7);
        conteiner2.add(painel8);

        JPanel conteiner3 = new JPanel();
        FlowLayout leiaute3 = new FlowLayout(FlowLayout.RIGHT);
        conteiner3.setLayout(leiaute3);
        conteiner3.setBorder(BorderFactory.createLineBorder(Color.black));
        conteiner3.add(painel9);
        conteiner3.add(painel10);
        conteiner3.add(painel11);
        conteiner3.add(painel12);

        GridLayout leiaute4 = new GridLayout(3, 1);        
        JFrame janela = new JFrame();
        janela.setLayout(leiaute4);
        janela.add(conteiner1);
        janela.add(conteiner2);
        janela.add(conteiner3);
        janela.setSize(525, 265);
        janela.setTitle("Janela com Gerenciadores de Leiaute");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
