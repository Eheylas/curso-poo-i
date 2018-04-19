
package atividade09;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TestaMenu {
    public static void main(String[] args) {
        JMenuBar  barraMenu  = new JMenuBar();
        
        JMenu menu = new JMenu();
        menu.setText("Menu");
        
        JMenuItem itemMenu1 = new JMenuItem();
        itemMenu1.setText("ItemMenu 1");
        JMenuItem itemMenu2 = new JMenuItem();
        itemMenu2.setText("ItemMenu 2");
        itemMenu2.setEnabled(false);
        
        
        menu.add(itemMenu1);
        menu.addSeparator();
        menu.add(itemMenu2);
        
        barraMenu.add(menu);
        
        
        JFrame janela = new JFrame();
        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setVisible(true);
        
        
        
    }
}
