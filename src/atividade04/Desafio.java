/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290026
 */
public class Desafio {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel1.setPreferredSize(new Dimension(50, 50));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel2.setPreferredSize(new Dimension(50, 50));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel3.setPreferredSize(new Dimension(50, 50));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel4.setPreferredSize(new Dimension(50, 50));
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel5.setPreferredSize(new Dimension(50, 50));
        JPanel painel6 = new JPanel();
        painel6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel6.setPreferredSize(new Dimension(50, 50));
        JPanel painel7 = new JPanel();
        painel7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel7.setPreferredSize(new Dimension(50, 50));
        JPanel painel8 = new JPanel();
        painel8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel8.setPreferredSize(new Dimension(50, 50));
        JPanel painel9 = new JPanel();
        painel9.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel9.setPreferredSize(new Dimension(50, 50));
        JPanel painel10 = new JPanel();
        painel10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel10.setPreferredSize(new Dimension(50, 50));
        JPanel painel11 = new JPanel();
        painel11.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel11.setPreferredSize(new Dimension(50, 50));
        JPanel painel12 = new JPanel();
        painel12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel12.setPreferredSize(new Dimension(50, 50));
        
        JPanel painelNorth = new JPanel();
        painelNorth.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        FlowLayout layoutNorth = new FlowLayout(FlowLayout.LEFT);
        painelNorth.setLayout(layoutNorth);
        painelNorth.add(painel1);
        painelNorth.add(painel2);
        painelNorth.add(painel3);
        painelNorth.add(painel4);
        
        JPanel painelCenter = new JPanel();
        painelCenter.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        FlowLayout layoutCenter = new FlowLayout(FlowLayout.CENTER);
        painelCenter.setLayout(layoutCenter);
        painelCenter.add(painel5);
        painelCenter.add(painel6);
        painelCenter.add(painel7);
        painelCenter.add(painel8);
        
        JPanel painelSouth = new JPanel();
        painelSouth.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        FlowLayout layoutSouth = new FlowLayout(FlowLayout.RIGHT);
        painelSouth.setLayout(layoutSouth);
        painelSouth.add(painel9);
        painelSouth.add(painel10);
        painelSouth.add(painel11);
        painelSouth.add(painel12);
        
//        JFrame janelaPrincipal = new JFrame();
//        
//        janelaPrincipal.add(painelNorth, BorderLayout.NORTH);
//        janelaPrincipal.add(painelCenter, BorderLayout.CENTER);
//        janelaPrincipal.add(painelSouth, BorderLayout.SOUTH);
        
        JFrame janelaPrincipal = new JFrame();
        GridLayout layoutPrincipal = new GridLayout(3, 1);
        
        janelaPrincipal.setLayout(layoutPrincipal);
        janelaPrincipal.add(painelNorth);
        janelaPrincipal.add(painelCenter);
        janelaPrincipal.add(painelSouth);

        janelaPrincipal.setSize(640, 480);
        janelaPrincipal.setMinimumSize(new Dimension(240, 225));
        janelaPrincipal.setTitle("Janela com Gerenciadores de Leiaute");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
}
