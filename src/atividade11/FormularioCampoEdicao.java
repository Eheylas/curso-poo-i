/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade11;

//import java.awt.HeadlessException;
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
 * @author 1714290024
 */
public class FormularioCampoEdicao extends JFrame {

    private JButton botaoAdicionar;
    private JTextField campoTexto;
    private JTextArea areaTexto;
    private JLabel rotulo;
    private JPanel PainelBotoes;
    private JPanel PainelPrincipal;
    private GridLayout leiaute;
    private JScrollPane painelRolagem;
    private String texto;

    public FormularioCampoEdicao() {
        botaoAdicionar = new JButton("Adicionar");
        campoTexto = new JTextField(20);
        

        areaTexto = new JTextArea(20, 5);
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(false);
//        areaTexto.setAppend(texto);
        

        rotulo = new JLabel("Digite um texto:");
        PainelBotoes = new JPanel();
        PainelPrincipal = new JPanel();
        leiaute = new GridLayout(5, 1);
        painelRolagem = new JScrollPane();
        
        texto = new String();

        PainelBotoes.add(botaoAdicionar);

        PainelPrincipal.add(rotulo);
//        PainelPrincipal.setLayout(leiaute);

        PainelPrincipal.add(campoTexto);
//        PainelPrincipal.setLayout(leiaute);

        PainelPrincipal.add(painelRolagem);
//        PainelPrincipal.setLayout(leiaute);

        add(PainelBotoes);
        add(PainelBotoes, BorderLayout.SOUTH);

        add(PainelPrincipal);
        add(PainelPrincipal, BorderLayout.CENTER);

        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private class ouvinteAnonimo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            botaoAdicionar.addActionListener(this);
//            campoTexto.getText(areaTexto);
            
        }
    }

}
