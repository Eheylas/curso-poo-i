/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Felipe
 */
public class FormularioCampoSelecao extends JFrame {
    private JComboBox comboUF;
    private JList listaMunicipio;
    private String[] arrayUF;
    private String[][] arrayMunicipio;
    private JLabel rotuloUF;
    private JLabel rotuloMunicipio;
    private JPanel painelPrincipal;
    private ActionListener ouvinte;
    
    public FormularioCampoSelecao() {
        ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox combo = (JComboBox) e.getSource();
                DefaultListModel modelo = new DefaultListModel();
                for(String item:arrayMunicipio[combo.getSelectedIndex()]) {
                    modelo.addElement(item);
                }
                listaMunicipio.setModel(modelo);
            }
        };
        
        arrayUF = new String[] {"DF", "GO"};
        arrayMunicipio = new String[][] {{"Brasília", "Taguatinga", "Sobradinho"},{"Formosa", "Planaltina", "Valparaiso"}};
        comboUF = new JComboBox(arrayUF);
        comboUF.addActionListener(ouvinte);
        listaMunicipio = new JList(arrayMunicipio[0]);
        listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        rotuloUF = new JLabel("Seleciona a UF:");
        rotuloMunicipio = new JLabel("Selecione o Município");
        
        painelPrincipal = new JPanel();
        painelPrincipal.add(rotuloUF);
        painelPrincipal.add(comboUF);
        painelPrincipal.add(rotuloMunicipio);
        painelPrincipal.add(listaMunicipio);
        
        this.add(painelPrincipal, BorderLayout.CENTER);
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
