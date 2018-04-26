/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author 1714290024
 */
public class FormularioBotao extends JFrame {

    private JButton botaoSalvar;
    private JButton botaoFechar;

    private JCheckBox checkCursoAds;
    private JCheckBox checkCursoSegInf;
    private JCheckBox checkCursoJogos;
    private JCheckBox checkCursoRedes;

    private JRadioButton radioBolsaIntegral100;
    private JRadioButton radioBolsaParcial75;
    private JRadioButton radioBolsaParcial50;
    private JRadioButton radioBolsaParcial25;
    private JRadioButton radioSemBolsa;

    private JLabel rotuloCurso;
    private JLabel rotuloBolsa;

    private JPanel painelBotoes;
    private JPanel painelCentral;

    public FormularioBotao() {
        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");

        checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        checkCursoSegInf = new JCheckBox("Segurança da Informação");
        checkCursoJogos = new JCheckBox("Jogos Digitais");
        checkCursoRedes = new JCheckBox("Redes de Computadores");

        radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        radioBolsaParcial75 = new JRadioButton("Parcial 75%");
        radioBolsaParcial50 = new JRadioButton("Parcial 50%");
        radioBolsaParcial25 = new JRadioButton("Parcial 25%");
        radioSemBolsa = new JRadioButton("Sem Bolsa");

        rotuloCurso = new JLabel("Selecione até duas opções de curso:");
        rotuloBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
        
        GridLayout leiaute = new GridLayout(11, 1);
        painelCentral = new JPanel();
        painelCentral.setLayout(leiaute);
        painelCentral.add(rotuloCurso);
        painelCentral.add(botaoFechar);
        painelCentral.add(botaoFechar);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);
        
        painelBotoes = new JPanel();
        painelBotoes.setLayout(leiaute);
        painelBotoes.add(rotuloBolsa);
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
  
        add(painelBotoes);
        add(painelBotoes, BorderLayout.SOUTH);
        
        add(painelCentral);
        add(painelCentral, BorderLayout.CENTER);
        
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
