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
    
    private int quantidadeCursos;

    public FormularioBotao() {
        
        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");
        
        checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        checkCursoSegInf = new JCheckBox("Segurança da Informação");
        checkCursoJogos = new JCheckBox("Jogos Digitais");
        checkCursoRedes = new JCheckBox("Redes de Computadores");
        
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JCheckBox caixa = (JCheckBox)ae.getSource();
                if(caixa.isSelected()==true){
                    quantidadeCursos++;
                    if(quantidadeCursos>2){
                        caixa.setSelected(false);
                        JOptionPane.showMessageDialog(null, "Atenção! Só é permitido a escolha de até 2 cursos.");
                    }
                }
                else{
                    quantidadeCursos--;
                }
            }
        };
        
        checkCursoAds.addActionListener(ouvinte);
        checkCursoSegInf.addActionListener(ouvinte);
        checkCursoJogos.addActionListener(ouvinte);
        checkCursoRedes.addActionListener(ouvinte);
        
        radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        radioBolsaParcial75 = new JRadioButton("Parcial 75%");
        radioBolsaParcial50 = new JRadioButton("Parcial 50%");
        radioBolsaParcial25 = new JRadioButton("Parcial 25%");
        radioSemBolsa = new JRadioButton("Sem Bolsa");
        
        JLabel labelCursos = new JLabel("Selecione até duas opções de curso:");
        JLabel labelBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBolsaIntegral100);
        grupo.add(radioBolsaParcial75);
        grupo.add(radioBolsaParcial50);
        grupo.add(radioBolsaParcial25);
        grupo.add(radioSemBolsa);
        
        radioSemBolsa.setSelected(true);
        
        GridLayout layout = new GridLayout(11,1);
        
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(layout);
        painelCentral.add(labelCursos);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(labelBolsa);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);

        add(painelBotoes, BorderLayout.SOUTH);
        add(painelCentral, BorderLayout.CENTER);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
}