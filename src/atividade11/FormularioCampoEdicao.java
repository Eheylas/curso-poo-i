
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


public class FormularioCampoEdicao extends JFrame {
   JButton botaoAdicionar = new JButton();
   JTextField campoTexto = new JTextField();
   JTextArea areaTexto = new JTextArea();
   
   public FormularioCampoEdicao(){
       botaoAdicionar = new JButton("Adicionar");
       campoTexto = new JTextField(20);
       areaTexto = new JTextArea(20,5);
       
       JLabel rotulo = new JLabel("Digite um Texto");
       JPanel painelBotoes = new JPanel();
       painelBotoes.add(botaoAdicionar);
       add(painelBotoes, BorderLayout.SOUTH);
       
       JPanel painelPrincipal = new JPanel();
       painelPrincipal.setLayout(new GridLayout(5,1));
       add(painelPrincipal, BorderLayout.CENTER);
       
       JScrollPane painelRolagem = new JScrollPane(areaTexto);
       areaTexto.setEditable(false);
       areaTexto.setLineWrap(true);
       areaTexto.setWrapStyleWord(true);
       
       painelPrincipal.add(rotulo);
       painelPrincipal.add(campoTexto);
       painelPrincipal.add(painelRolagem);
       
       this.setSize(300,200);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       ActionListener precionaBotao = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               
            areaTexto.append(campoTexto.getText());
            campoTexto.setText(" ");
               
           }
       };
       
       botaoAdicionar.addActionListener(precionaBotao);
   }
 
}
