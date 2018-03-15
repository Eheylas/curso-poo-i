/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290001
 */
public class TestaJanelaGridLayout {
    public static void main(String[] args) {
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
        
        JFrame janela = new JFrame();
        GridLayout leiaute = new GridLayout(3,2);
        
        janela.setLayout(leiaute);
        janela.add(painel1);
        janela.add(painel2);  
        janela.add(painel3);
        janela.add(painel4);
        janela.add(painel5);
        janela.setSize(640, 480);
        janela.setTitle("Janela GridLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
