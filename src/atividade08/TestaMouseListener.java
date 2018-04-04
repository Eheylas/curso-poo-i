/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import javax.swing.JFrame;

public class TestaMouseListener {
    public static void main(String[] args) {
       OuvinteMouseListener ouvinte = new OuvinteMouseListener();
        JFrame janela = new JFrame();
        
        janela.addMouseListener(ouvinte);
        janela.setSize(600,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
