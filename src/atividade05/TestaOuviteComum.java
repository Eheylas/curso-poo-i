/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290026
 */
public class TestaOuviteComum {
    public static void main(String[] args) {
        OuvinteComum ouvinte = new OuvinteComum();
        JButton botao = new JButton("Ok");
        botao.addActionListener(ouvinte);
        
        JPanel painel = new JPanel();
        painel.add(botao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
