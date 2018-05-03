/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade11;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 1714290001
 */
public class FormularioCampoEdicao extends JFrame{

    private JButton botaoAdicionar;
    private JTextField campoTexto ;
    private JTextArea areaTexto;
    
    public FormularioCampoEdicao(){
        botaoAdicionar = new JButton("Adicionar");
        campoTexto = new JTextField(20);
        areaTexto = new JTextArea(20, 5);
        JLabel rotulo1 = new JLabel("Digite um texto:");
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        painel2.setLayout.GridLayout(1, 5);
        
        
        
    }
    
}
