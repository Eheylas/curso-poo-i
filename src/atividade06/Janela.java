/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import javax.swing.JFrame;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class Janela extends JFrame {
    public Janela() {
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
}
