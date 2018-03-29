/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import javax.swing.JFrame;

/**
 *
 * @author FAS
 */
public class TestaWindowStateListener {
    public static void main(String[] args) {
        OuvinteWindowStateListener ouvinte = new OuvinteWindowStateListener();
        JFrame janela = new JFrame();
        janela.addWindowStateListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE
        );
       janela.setVisible(true);
       
    }
}
