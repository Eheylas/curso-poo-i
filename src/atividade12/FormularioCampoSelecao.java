/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class FormularioCampoSelecao extends JFrame {
    private JComboBox comboUF;
    private JList listaMunicipio;
    private  String[] arrayUF ;
    private  String[][] arrayMunicipio;
    private JLabel rotuloUF;
    private JLabel rotuloMunicipio;
    private JPanel painelPrincipal;
            
    public FormularioCampoSelecao(){
    
        arrayUF = new String[]{"DF","GO"};
        arrayMunicipio = new String[][]{{"Brasília", "Taguatinga", "Sobradinho"},{"Formosa", "Planaltina", "Valparaiso"}};
        comboUF = new JComboBox();
        listaMunicipio= new JList(arrayMunicipio[0]);
        rotuloUF = new JLabel("Seleciona a UF:");
        rotuloMunicipio = new JLabel("Selecione o Município;");
        painelPrincipal = new JPanel();
        
        listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JComboBox combo = (JComboBox)e.getSource();
                listaMunicipio= new JList(arrayMunicipio[combo.getSelectedIndex()]);
                painelPrincipal.add(listaMunicipio);
            }
        };
        
        comboUF.addActionListener(ouvinte);
        
        painelPrincipal.add(rotuloUF);
        painelPrincipal.add(comboUF);
        painelPrincipal.add(rotuloMunicipio);
        painelPrincipal.add(listaMunicipio);
        
        this.add(painelPrincipal, BorderLayout.CENTER);
        this.setSize(640,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
