/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290055
 */
public class TestaJanelaFlowLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        FlowLayout leiaute = new FlowLayout(FlowLayout.LEFT);
        
        JFrame janela = new JFrame();
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLayout(leiaute);
        
    }
    
}
