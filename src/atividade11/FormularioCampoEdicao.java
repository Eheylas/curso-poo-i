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

public class FormularioCampoEdicao extends JFrame{
    private JButton botaoAdicionar;
    private JTextField campoTexto;
    private JTextArea areaTexto;
    private JLabel rotulo;

    public FormularioCampoEdicao() {
        botaoAdicionar = new JButton("Adicionar");
        campoTexto = new JTextField(20);
        areaTexto = new JTextArea(20, 5);
        rotulo = new JLabel("Digite um texto:");

        JPanel painelBotao = new JPanel();
        painelBotao.add(botaoAdicionar);
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(areaTexto);
        
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append(campoTexto.getText() + "\n");
                campoTexto.setText("");
            }
        };
        
        botaoAdicionar.addActionListener(ouvinte);

        GridLayout layout = new GridLayout(5,1);
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(layout);
        painelCentral.add(rotulo);
        painelCentral.add(campoTexto);
        painelCentral.add(painelRolagem);
        
        
        add(painelBotao, BorderLayout.SOUTH);
        add(painelCentral, BorderLayout.CENTER);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
