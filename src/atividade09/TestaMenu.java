package atividade09;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestaMenu {
    public static void main(String[] args){
        JMenuItem itemMenu1 = new JMenuItem();
        itemMenu1.setText("Item Menu 1");
        
        JMenuItem itemMenu2 = new JMenuItem("Item Menu 2");
        itemMenu2.setVisible(false);
        
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic('M');
        menu.add(itemMenu1);
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