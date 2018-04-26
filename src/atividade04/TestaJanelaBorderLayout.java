
package atividade04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaBorderLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
            
        
        JPanel painel2 = new JPanel();
           
            
        JPanel painel3 = new JPanel();
            
            
        JPanel painel4 = new JPanel();
            
            
        JPanel painel5 = new JPanel();
            painel5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        JFrame janela = new JFrame();
            janela.add(painel1, BorderLayout.NORTH);
            janela.add(painel2, BorderLayout.SOUTH);
            janela.add(painel3, BorderLayout.EAST);
            janela.add(painel4, BorderLayout.WEST);
            janela.add(painel5, BorderLayout.CENTER);
            
            janela.setSize(640, 480);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setTitle("Janela BorderLayout");
            janela.setVisible(true);
            
        
    }
}
