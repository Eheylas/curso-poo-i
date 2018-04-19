/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade09;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 1714290001
 */
public class Janela extends JFrame{
    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        JMenu menuAjuda = new JMenu("Ajuda");
        menuArquivo.setMnemonic('F');
        JMenuItem menuArquivoSair = new JMenuItem("");
        menuArquivoSair.setMnemonic('Q');
        JMenuItem menuAjudaSobre = new JMenuItem("");
        menuAjudaSobre.setMnemonic('S');
        
        
        
    }

    public Janela(){
       
    }

   
    
}
