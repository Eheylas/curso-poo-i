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
public class TestaWindowListener {
    public static void main(String[] args) {
        OuvinteWindowListener ouvinte = new OuvinteWindowListener();
        JFrame janela = new JFrame();
        janela.addWindowListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.DO_NOTHING_ON_CLOSE
               
        );
        janela.setVisible(true);
    }
}
