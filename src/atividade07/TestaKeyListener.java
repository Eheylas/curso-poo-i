/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import javax.swing.JFrame;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class TestaKeyListener {
    public static void main(String[] args) {
        OuvinteKeyListener ouvinte = new OuvinteKeyListener();
        JFrame janela = new JFrame();
        janela.addKeyListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
