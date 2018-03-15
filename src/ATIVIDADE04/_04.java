package ATIVIDADE04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author 1714290048
 */
public class _04 {

    public static void main(String[] args) {

        JPanel painel1 = new JPanel();
        painel1.setBorder(
                BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel2 = new JPanel();
        painel2.setBorder(
                BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel3 = new JPanel();
        painel3.setBorder(
                BorderFactory.createLineBorder(Color.RED));
        JPanel painel4 = new JPanel();
        painel4.setBorder(
                BorderFactory.createLineBorder(Color.MAGENTA));

        JPanel painel5 = new JPanel();

        JPanel painel6 = new JPanel();
        
        JPanel painel7 = new JPanel();
        painel7.setBorder(
                BorderFactory.createLineBorder(Color.RED));
        JPanel painel8 = new JPanel();
        painel8.setBorder(
                BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel9 = new JPanel();
        painel9.setBorder(
                BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel10 = new JPanel();
        painel10.setBorder(
                BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel11 = new JPanel();
        painel11.setBorder(
                BorderFactory.createLineBorder(Color.YELLOW));
        JPanel painel12 = new JPanel();
        painel12.setBorder(
                BorderFactory.createLineBorder(Color.RED));
        JPanel painel13 = new JPanel();
        painel13.setBorder(
                BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel14 = new JPanel();
        painel14.setBorder(
                BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel15 = new JPanel();
        painel15.setBorder(
                BorderFactory.createLineBorder(Color.BLACK));

        JFrame janela = new JFrame();
        GridLayout Gleiaute = new GridLayout(1,3);
        janela.setLayout(Gleiaute);
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        janela.add(painel5);
        janela.add(painel6);
        janela.add(painel7);
        janela.add(painel8);
        janela.add(painel9);
        janela.add(painel10);
        janela.add(painel11);
        janela.add(painel12);
        janela.add(painel13);
        janela.add(painel14);
        janela.add(painel15);
        janela.setTitle("Janela com Gerenciadores de Leiaute ");
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
