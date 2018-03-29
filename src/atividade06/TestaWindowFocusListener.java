/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;
import java.awt.event.WindowFocusListener;
 import javax.swing.JFrame;

public class TestaWindowFocusListener {
   

 public static void main(String[] args) {
 OuvinteFocus ouvinte = new OuvinteFocus();
 JFrame janela = new JFrame();
 janela.addWindowFocusListener((WindowFocusListener) ouvinte);
 janela.setSize(300, 200);
 janela.setDefaultCloseOperation(
 JFrame.EXIT_ON_CLOSE
 );
 janela.setVisible(true);
 }
}

