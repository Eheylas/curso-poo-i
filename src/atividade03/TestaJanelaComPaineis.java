/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Yves Bodê
 */
public class TestaJanelaComPaineis {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        JFrame janela = new JFrame();
        
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        
        painel4.add(painel1);
        painel4.add(painel2);
        painel4.add(painel3);
        
        janela.add(painel4);
        janela.setSize(640, 480);
        janela.setTitle("Janela com painéis");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
}
