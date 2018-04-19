package atividade09;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame{
    private JMenuBar barraMenu = new JMenuBar();
    private JMenu menuArquivo = new JMenu();
    private JMenu menuAjuda = new JMenu();
    private JMenuItem menuArquivoSair = new JMenuItem();
    private JMenuItem menuAjudaSobre = new JMenuItem();

    public Janela(){
        JMenuBar barraMenu = new JMenuBar();
        
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('j');
        
        JMenuItem menuArquivoSair = new JMenuItem("Sair");
        menuArquivoSair.setMnemonic('r');
        menuArquivoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               System.exit(0); 
            }
        });
        
        JMenuItem menuAjudaSobre = new JMenuItem("Sobre...");
        menuAjudaSobre.setMnemonic('S');
        menuAjudaSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Aplicação 1.0");
            }
        });
        
        menuArquivo.add(menuArquivoSair);
        menuAjuda.add(menuAjudaSobre);
        barraMenu.add(menuArquivo);
        barraMenu.add(menuAjuda);
        
        setJMenuBar(barraMenu);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    
}