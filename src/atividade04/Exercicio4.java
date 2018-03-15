/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel6 = new JPanel();
        painel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel7 = new JPanel();
        painel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel8 = new JPanel();
        painel8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel9 = new JPanel();
        painel9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel10 = new JPanel();
        painel10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel11 = new JPanel();
        painel11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel12 = new JPanel();
        painel12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel13 = new JPanel();
        painel13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel14 = new JPanel();
        painel14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel15 = new JPanel();
        painel15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        painel2.setPreferredSize(new Dimension(50,50));
        painel3.setPreferredSize(new Dimension(50,50));
        painel4.setPreferredSize(new Dimension(50,50));
        painel5.setPreferredSize(new Dimension(50,50));
        painel7.setPreferredSize(new Dimension(50,50));
        painel8.setPreferredSize(new Dimension(50,50));
        painel9.setPreferredSize(new Dimension(50,50));
        painel10.setPreferredSize(new Dimension(50,50));
        painel12.setPreferredSize(new Dimension(50,50));
        painel13.setPreferredSize(new Dimension(50,50));
        painel14.setPreferredSize(new Dimension(50,50));
        painel15.setPreferredSize(new Dimension(50,50));
        
        
        painel1.add(painel2);
        painel1.add(painel3);
        painel1.add(painel4);
        painel1.add(painel5);
        
        painel6.add(painel7);
        painel6.add(painel8);
        painel6.add(painel9);
        painel6.add(painel10);
        
        painel11.add(painel12);
        painel11.add(painel13);
        painel11.add(painel14);
        painel11.add(painel15);
        
        FlowLayout leiout1= new FlowLayout(FlowLayout.LEFT);
        FlowLayout leiout2= new FlowLayout();
        FlowLayout leiout3= new FlowLayout(FlowLayout.RIGHT);
        
        painel1.setLayout(leiout1);
        painel6.setLayout(leiout2);
        painel11.setLayout(leiout3);
        JFrame janela = new JFrame();
        
        janela.add(painel1,BorderLayout.NORTH);
        painel1.setPreferredSize(new Dimension(300,200));
        janela.add(painel6,BorderLayout.CENTER);
        painel6.setPreferredSize(new Dimension(300,200));
        janela.add(painel11,BorderLayout.SOUTH);
        painel11.setPreferredSize(new Dimension(300,200));
        
        
        janela.setTitle("Janela com Gerenciadores de Leiaute");
        janela.setSize(900,600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
