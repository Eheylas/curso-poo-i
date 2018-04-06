/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class TestaNumeroKeyListener {
    public static void main(String[] args) {
        NumeroKeyListener ouvinte = new NumeroKeyListener();
        JTextField campo = new JTextField(30);
        campo.addKeyListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.add(campo);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
