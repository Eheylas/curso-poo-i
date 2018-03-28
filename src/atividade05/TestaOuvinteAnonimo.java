
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestaOuvinteAnonimo {
    public static void main(String[] args) {
        JButton botao = new JButton();
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "actionPerformed disparado...");
                
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
