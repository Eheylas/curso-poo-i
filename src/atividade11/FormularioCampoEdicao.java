/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Felipe
 */
public class FormularioCampoEdicao extends JFrame {
    private JButton botaoAdicionar;
    private JTextField campoTexto;
    private JTextArea areaTexto;
    private JLabel rotulo;
    private JPanel painelBotoes;
    private JPanel painelPrincipal;
    private JScrollPane painelRolagem;
    private ActionListener ouvinte;
    
    public FormularioCampoEdicao() {
        ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append(campoTexto.getText()+"\n");
                campoTexto.setText("");
            }
        };
        
        botaoAdicionar = new JButton("Adicionar");
        botaoAdicionar.addActionListener(ouvinte);
        campoTexto = new JTextField(20);        
        areaTexto = new JTextArea(20,5);
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        
        rotulo = new JLabel("Digite um texto:");
        
        painelBotoes = new JPanel();
        painelPrincipal = new JPanel();
        
        painelRolagem = new JScrollPane(areaTexto);
        
        painelBotoes.add(botaoAdicionar);
        
        painelPrincipal.setLayout(new GridLayout(5,1));
        painelPrincipal.add(rotulo);
        painelPrincipal.add(campoTexto);
        painelPrincipal.add(painelRolagem);
        
        this.add(painelBotoes, BorderLayout.SOUTH);
        this.add(painelPrincipal, BorderLayout.CENTER);
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
