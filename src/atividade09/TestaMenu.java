
package atividade09;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TestaMenu {
    public static void main(String[] args) {
       JMenuBar barraMenu = new JMenuBar();
       
       JMenu menu = new JMenu();
       menu.setText("Menu");
       barraMenu.add(menu);
       
       JMenuItem itemMenu1 = new JMenuItem();
       itemMenu1.setText("ItemMenu 1");
       menu.add(itemMenu1);
       menu.addSeparator();
       
       JMenuItem itemMenu2 = new JMenuItem();
       itemMenu2.setText("ItemMenu 2");
       menu.add(itemMenu2);
       itemMenu2.setEnabled(false);
       
        JFrame janela = new JFrame();
        janela.setJMenuBar(barraMenu);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
