/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290001
 */
public class JanelaGerenciadoresDeLeiaute {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
       JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
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
        
        JFrame janela = new JFrame();
        GridLayout leiaute= new GridLayout(3, 1);
        FlowLayout flowtopo = new FlowLayout(FlowLayout.LEFT);
        FlowLayout flowcenter = new FlowLayout(FlowLayout.CENTER);
        FlowLayout flowbaixo = new FlowLayout(FlowLayout.RIGHT);
        janela.setLayout(leiaute);
        painel1.setLayout(flowtopo);
        painel2.setLayout(flowcenter);
        painel3.setLayout(flowbaixo);
        
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        
        painel1.add(painel4);
        painel1.add(painel5);
        painel1.add(painel6);
        painel1.add(painel7);
        
        painel2.add(painel8);
        painel2.add(painel9);
        painel2.add(painel10);
        painel2.add(painel11);
        
        painel3.add(painel12);
        painel3.add(painel13);
        painel3.add(painel14);
        painel3.add(painel15); 
        
        janela.setSize(680, 480);
        janela.setTitle("Janela Com Gerenciadores de Leiaute");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
       
        
        
    }
    
        
       
}
