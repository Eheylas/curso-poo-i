/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import javax.swing.JFrame;

/**
 *
 * @author 1714290026
 */
public class TestaMouseMotionListener {
    
    public static void main(String[] args) {
        OuvinteMouseMotionListener ouvinte = new OuvinteMouseMotionListener();
        JFrame janela = new JFrame();
        janela.addMouseMotionListener(ouvinte);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
                
    }
}
