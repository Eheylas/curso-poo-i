/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Felipe
 */
public class FormularioBotao extends JFrame {
    private JButton botaoSalvar;
    private JButton botaoFechar;
    
    private JCheckBox checkCursoAds;
    private JCheckBox checkCursoSegInf;
    private JCheckBox checkCursoJogos;
    private JCheckBox checkCursoRedes;
    
    private JRadioButton radioBolsaIntegral100;
    private JRadioButton radioBolsaIntegral75;
    private JRadioButton radioBolsaIntegral50;
    private JRadioButton radioBolsaIntegral25;
    private JRadioButton radioSemBolsa;
    
    private int quantidadeCursos = 0;
    
    public FormularioBotao() {
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JCheckBox) {
                    System.out.println("e.getSource() é uma instância de JCheckBox");
                    JCheckBox checkBox = (JCheckBox)e.getSource();
                    if(checkBox.isSelected() == true) {
                        quantidadeCursos++;
                        if(quantidadeCursos > 2) {
                            checkBox.setSelected(false);
                            JOptionPane.showMessageDialog(null, "Atenção! Só é permitido a escolha de até 2 cursos.");
                            quantidadeCursos--;
                        }
                    } else {
                        quantidadeCursos--;
                    }
                } else {
                    System.out.println("e.getSource() não é uma instância de JCheckBox");
                }
            }
        };
        
        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");
        
        checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        checkCursoSegInf = new JCheckBox("Segurança da Informação");
        checkCursoJogos = new JCheckBox("Jogos Digitais");
        checkCursoRedes = new JCheckBox("Redes de Computadores");
        
        checkCursoAds.addActionListener(ouvinte);
        checkCursoSegInf.addActionListener(ouvinte);
        checkCursoJogos.addActionListener(ouvinte);
        checkCursoRedes.addActionListener(ouvinte);
        
        radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        radioBolsaIntegral75 = new JRadioButton("Parcial 75%");
        radioBolsaIntegral50 = new JRadioButton("Parcial 50%");
        radioBolsaIntegral25 = new JRadioButton("Parcial 25%");
        radioSemBolsa = new JRadioButton("Sem Bolsa");
        
        botaoFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        radioSemBolsa.setSelected(true);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBolsaIntegral100);
        grupo.add(radioBolsaIntegral75);
        grupo.add(radioBolsaIntegral50);
        grupo.add(radioBolsaIntegral25);
        grupo.add(radioSemBolsa);
        
        JLabel labelCurso = new JLabel("Selecione até duas opções de curso:");
        JLabel labelBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new GridLayout(11,1));
        painelCentral.add(labelCurso);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(labelBolsa);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaIntegral75);
        painelCentral.add(radioBolsaIntegral50);
        painelCentral.add(radioBolsaIntegral25);
        painelCentral.add(radioSemBolsa);
        
        this.add(painelBotoes, BorderLayout.SOUTH);
        this.add(painelCentral, BorderLayout.CENTER);
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
