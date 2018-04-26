
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class FormularioBotao extends JFrame {

    public FormularioBotao() {
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoFechar = new JButton("Fechar");
        
        JPanel painel = new JPanel();
        painel.add(botaoSalvar);
        painel.add(botaoFechar);
        
        JFrame janela = new JFrame();

        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JLabel rotulo = new JLabel ( "Selecione até duas opções de curso:" );
        janela.add(rotulo, BorderLayout.NORTH);
        JCheckBox CursosADS = new JCheckBox("CursosADS");
        painel.add(CursosADS);

        JCheckBox CursosSegInf = new JCheckBox("Curso Seguranca da informacao");
        painel.add(CursosSegInf);

        JCheckBox CursoJogos = new JCheckBox("Curso de Jogos");
        painel.add(CursoJogos);

        JCheckBox CursoRedes = new JCheckBox("Curso de Redes");
        painel.add(CursoRedes);
JLabel rotulo1 = new JLabel ( "Deseja cursar com bolsa de estudo?" );
        janela.add(rotulo1, BorderLayout.NORTH);
        JRadioButton BolsaIntegral100 = new JRadioButton("BolsaIntegral 100%");
        painel.add(BolsaIntegral100);
        JRadioButton BolsaParcial75 = new JRadioButton("BolsaParcial 75%");
        painel.add(BolsaParcial75);
        JRadioButton BolsaParcial50 = new JRadioButton("BolsaParcial 50%");
        painel.add(BolsaParcial50);
        JRadioButton BolsaParcial25 = new JRadioButton("BolsaParcial 25%");
        painel.add(BolsaParcial25);
        JRadioButton sembolsa = new JRadioButton("Sem Bolsa");
        painel.add(sembolsa);

    }}


