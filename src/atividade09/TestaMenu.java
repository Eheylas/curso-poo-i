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
 * @author 1714290024
 */
public class TestaMenu {
    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
        
        
        JMenu menu = new JMenu();
        menu.setText("Menu");
        barraMenu.add(menu);
        menu.addSeparator();
        
        JMenuItem itemMenu1 = new JMenuItem();
        itemMenu1.setText("ItemMenu 1");
        menu.add(itemMenu1);
        
        JMenuItem itemMenu2 = new JMenuItem("ItemMenu 2");
        itemMenu2.setEnabled(false);
        menu.add(itemMenu2);
        
        JFrame janela = new JFrame();
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
