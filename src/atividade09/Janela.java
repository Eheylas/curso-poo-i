package atividade09;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame{

    public Janela() throws HeadlessException {
        JMenuItem menuArquivoSair = new JMenuItem("Sair");
        menuArquivoSair.setMnemonic('r');
        menuArquivoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JMenuItem menuAjudaSobre = new JMenuItem("Sobre");
        menuAjudaSobre.setMnemonic('s');
        menuAjudaSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Aplicação 1.0");
            }
            
        });
 
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        menuArquivo.add(menuArquivoSair);
        
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('j');
        menuAjuda.add(menuAjudaSobre);

        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menuArquivo);
        barraMenu.add(menuAjuda);
        
        setJMenuBar(barraMenu);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}