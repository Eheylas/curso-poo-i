
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestaOuvinteAcao {
    public static void main(String[] args) {
        OuvinteAcao ouvinteAcao = new OuvinteAcao();
        
        JButton botao = new JButton();
        botao.addActionListener(ouvinteAcao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Outra ação foi executada");
                
                JPanel painel = new JPanel();
                painel.add(botao);
                
                JFrame janela = new JFrame();
                janela.add(painel);
                janela.setSize(300, 200);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.setVisible(true);
                janela.setLocationRelativeTo(null);
            }
        });
    }
}
