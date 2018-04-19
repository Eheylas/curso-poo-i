/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade09;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 1714290001
 */
public class TestaMenu {
    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
        JFrame janela = new JFrame();
         JMenu menu = new JMenu();
         menu.setText("Menu");
         barraMenu.add(menu);
         JMenuItem ItemMenu1 = new JMenuItem();
         ItemMenu1.setText("ItemMenu 1");
         menu.add(ItemMenu1);
         menu.addSeparator();
         JMenuItem ItemMenu2 = new JMenuItem();
         ItemMenu2.setText("ItemMenu 2");
         menu.add(ItemMenu2);
         ItemMenu2.setEnabled(false);
         
         
         
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
