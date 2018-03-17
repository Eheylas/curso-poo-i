
package atividade03;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TestaJanelaComRolagem {
    public static void main(String[] args) {
        JPanel painelComum = new JPanel();
        painelComum.setBorder(BorderFactory.createLineBorder(Color.blue));
        painelComum.setPreferredSize(new Dimension(800,600));//Atribuindo o tamanho ja no painel
        
        JScrollPane painelRoragem = new JScrollPane();
        painelRoragem.setViewportView(painelComum);//Visualiza o sroll
        
        JFrame janela = new JFrame();
        janela.add(painelRoragem);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("anela com painéis");
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
