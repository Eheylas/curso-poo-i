/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08;

import javax.swing.JFrame;

/**
 *
 * @author FAS
 */
public class TestaOuvinteMouseListener {

    public static void main(String[] args) {
        OuvinteMouseListener ouvinte = new OuvinteMouseListener();
        JFrame janela = new JFrame();
        janela.addMouseListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
        janela.setVisible(true);

    }
}

