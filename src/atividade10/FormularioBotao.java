
package atividade10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class FormularioBotao extends JFrame{
    JButton botaoSalvar = new JButton();
    JButton botaoFechar = new JButton();
    JCheckBox checkCursosAds = new JCheckBox();
    JCheckBox checkCursosSegInf = new JCheckBox();
    JCheckBox checkCursoJogos = new JCheckBox();
    JCheckBox checkCursoRedes = new JCheckBox();
    
    JRadioButton radioBolsaIntegral100 = new JRadioButton();
    JRadioButton radioBolsaParcial75 = new JRadioButton();
    JRadioButton radioBolsaParcial50 = new JRadioButton();
    JRadioButton radioBolsaParcial25 = new JRadioButton();
    JRadioButton radioSemBolsa = new JRadioButton();
    
    int quantidadeCursos = 0;
    public FormularioBotao(){
        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");
        
        checkCursosAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        checkCursosSegInf = new JCheckBox("Segurança da Informação");
        checkCursoJogos = new JCheckBox("Jogos Digitais");
        checkCursoRedes = new JCheckBox("Redes de Computadores");
        
        radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        radioBolsaParcial75 = new JRadioButton("Parcial 75%");
        radioBolsaParcial50 = new JRadioButton("Parcial 50%");
        radioBolsaParcial25 = new JRadioButton("Parcial 25%");
        radioSemBolsa = new JRadioButton("Sem Bolsa");
        
        JLabel labelCursos = new JLabel("Selecione até duas opções de curso:");
        JLabel rotulo2 = new JLabel("Deseja cursar com bolsa de estudo?");        
        
        GridLayout leiaute = new GridLayout(11,1);
        JPanel painelBotoes = new JPanel();
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(leiaute);
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        
        painelCentral.add(labelCursos);
        painelCentral.add(checkCursosAds);
        painelCentral.add(checkCursosSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);
        
        add(painelBotoes, BorderLayout.SOUTH);
        add(painelCentral, BorderLayout.CENTER);
        
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBolsaIntegral100);
        grupo.add(radioBolsaParcial75);
        grupo.add(radioBolsaParcial50);
        grupo.add(radioBolsaParcial25);
        grupo.add(radioSemBolsa);
        
        radioSemBolsa.setSelected(true);
        
       
        ActionListener ouvinteSeleciona = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JCheckBox checkBox = (JCheckBox)ae.getSource();
                
                
                if (checkBox.isSelected() == true){
                    
                    quantidadeCursos++;
                    if(quantidadeCursos > 2){
                        checkBox.setSelected(false);
                        JOptionPane.showMessageDialog(null, "Atenção! Só é permitido a escolhe de até 2 cursos.");
                        quantidadeCursos--;
                    }
                }
                else {
                    quantidadeCursos--;
                }
            }
          
        };
        
        ActionListener ouvinteFecha = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        };
                
        checkCursosAds.addActionListener(ouvinteSeleciona);
        checkCursosSegInf.addActionListener(ouvinteSeleciona);
        checkCursoRedes.addActionListener(ouvinteSeleciona);
        checkCursoJogos.addActionListener(ouvinteSeleciona);
        
        botaoFechar.addActionListener(ouvinteFecha);
    }
}
