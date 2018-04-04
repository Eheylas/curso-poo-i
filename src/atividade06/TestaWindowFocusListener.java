/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import javax.swing.JFrame;

/**
 *
 * @author 1714290026
 */
public class TestaWindowFocusListener {

    public static void main(String[] args) {
        OuvinteWindowFocusListener ouvinte = new OuvinteWindowFocusListener();
        JFrame janela = new JFrame();
        janela.addWindowFocusListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
