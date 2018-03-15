/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Yves Bodê
 */
public class TestaCardLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        CardLayout laiaute = new CardLayout();
        JPanel conteiner = new JPanel();
        conteiner.setLayout(laiaute);
        
        conteiner.add(painel1);
        conteiner.add(painel2);
        conteiner.add(painel3);
        conteiner.add(painel4);
        conteiner.add(painel5);
        
        JFrame janela = new JFrame();
        janela.add(conteiner);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
//        laiaute.next(conteiner);
        
        
    }
    
}
