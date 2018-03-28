
package atividade05;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaOuvinteAcaoGeral {
    public static void main(String[] args) {
        OuvinteAcaoGeral ouvinte = new OuvinteAcaoGeral();
        
        JButton botao = new JButton("Ok");
        
        JTextField campo = new JTextField(30);
        
        botao.addActionListener(ouvinte);
        campo.addActionListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.setSize(800, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.add(botao);
        janela.add(campo);
    }
}
