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
 * @author 1714290026
 */
public class TestaMenu {
    public static void main(String[] args) {        
        JMenuItem itemMenu1 = new JMenuItem();
        itemMenu1.setText("ItemMenu 1");
        JMenuItem itemMenu2 = new JMenuItem();
        itemMenu2.setText("ItemMenu 2");
        itemMenu2.setEnabled(false);
        
        JMenu menu = new JMenu();
        menu.setText("Menu");
        menu.add(itemMenu1);
        menu.addSeparator();
        menu.add(itemMenu2);
        
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        
        JFrame janela = new JFrame();
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
