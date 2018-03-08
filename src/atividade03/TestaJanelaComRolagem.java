/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Yves Bodê
 */
public class TestaJanelaComRolagem {
    public static void main(String[] args) {
        JPanel painelComum = new JPanel();
        JScrollPane painelRolagem = new JScrollPane();
        JFrame janela = new JFrame();
        
        painelComum.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        painelComum.setPreferredSize(new Dimension(800, 600));
        
        painelRolagem.setViewportView(painelComum);
        
        janela.add(painelRolagem);
        janela.setSize(640, 480);
        janela.setTitle("Janela com painéis");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
}
