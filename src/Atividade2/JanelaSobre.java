/*
4. Escreva um programa Java que implemente uma aplicação GUI.
a) Crie uma classe chamada JanelaSobre que herde de JDialog.
b) Defina um construtor que recebe como parâmetros owner do tipo JFrame e modal do tipo boolean. (Dica: clique com o botão direito, selecione Inserir Código->Construtores... e marcar o construtor com esses parâmetros.).
c) Defina o método exibir sem parâmetro e sem retorno.
d) Dentro do método, atribua o tamanho 320x240 e o título "Sobre..." para a janela, e exibir a janela centralizada.
e) Crie uma classe JanelaPrincipal que herde de JFrame.
f) Dentro da classe, defina o atributo janelaSobre da classe JanelaSobre.
g) Dentro da classe, crie um construtor padrão que inicialize o atributo janelaSobre com uma instância modal.
h) Dentro da classe, defina o método exibir sem parâmetro e sem retorno.
i) Dentro do método, atribua o tamanho 640x480, o título "Aplicação GUI", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela maximizada e chame o método exibir do atributo janelaSobre.
j) Crie uma classe TestaAplicacaoGUI com um bloco main.
k) Dentro do bloco, defina uma variável janelaPrincipal inicializando-a com uma instância de JanelaPrincipal.
l) Chame o método exibir da variável janelaPrincipal.
m) Execute a classe TestaAplicacaoGUI e observe o resultado.
n) Tente fechar a janela principal sem fechar a caixa de diálogo.
o) Feche a caixa de diálogo e verifique se o programa foi encerrado.
p) Adicione os arquivos no git remoto.
 */
package Atividade2;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class JanelaSobre extends JDialog{

    public JanelaSobre(Frame owner, boolean modal) {
        super(owner, modal);
    }
   
    void exibir(){
        setSize(320, 240);
        setTitle("Sobre...");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
             
   
        
        
    }

    public JanelaSobre() {
    }
    
}
