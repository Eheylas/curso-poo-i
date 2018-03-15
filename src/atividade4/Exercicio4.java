
package atividade4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Exercicio4 {
    public static void main(String[] args) {
            JPanel painel1 = new JPanel();
                painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel2 = new JPanel();
                painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel3 = new JPanel();
                painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel4 = new JPanel();
                painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel5 = new JPanel();
                painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel6 = new JPanel();
                painel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel7 = new JPanel();
                painel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel8 = new JPanel();
                painel8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel9 = new JPanel();
                painel9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel10 = new JPanel();
                painel10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel11 = new JPanel();
                painel11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JPanel painel12 = new JPanel();
                painel12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            
            
            
            GridLayout  grid = new GridLayout();
                grid.setColumns(1);
                grid.setRows(3);
                
            FlowLayout leiaute13 = new FlowLayout(FlowLayout.LEFT);
                
            JPanel painel13 = new JPanel();
                painel13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                 painel13.setLayout(leiaute13);
                    painel13.add(painel1);
                    painel13.add(painel2);
                    painel13.add(painel3);
                    painel13.add(painel4);
                    
            FlowLayout leiaute14 = new FlowLayout(FlowLayout.CENTER);        
            JPanel painel14 = new JPanel();
                painel14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                    painel14.setLayout(leiaute14);
                    painel14.add(painel5);
                    painel14.add(painel6);
                    painel14.add(painel7);
                    painel14.add(painel8);
            
            FlowLayout leiaute15 = new FlowLayout(FlowLayout.RIGHT);
            JPanel painel15 = new JPanel();
                painel15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                    painel15.setLayout(leiaute15);
                    painel15.add(painel9);
                    painel15.add(painel10);
                    painel15.add(painel11);
                    painel15.add(painel12);
            
            JPanel grade = new JPanel();
            grade.setLayout(grid);
            
            grade.add(painel13);
            grade.add(painel14);
            grade.add(painel15);
            
            JFrame janela = new JFrame();
            janela.add(grade);
            
            janela.setTitle("Exercicio4");
            janela.setSize(640, 480);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
    }
}
