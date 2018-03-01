/*
3. Escreva um programa Java que implemente os modos de exibição de uma janela.
a) Crie uma classe chamada TestaModoExibicao com o bloco main.
b) Dentro do bloco, defina uma variável janelaPrincipal inicializando-a com uma instância de JFrame.
c) Defina o tamanho 640x480 fazendo uma chamada ao método setSize da variável janelaPrincipal.
d) Faça o botão fechar da variável janelaPrincipal interromper a execução do programa.
e) Torne a janelaPrincipal visível.
f) Defina uma variável caixaDialogo inicializando-a com uma instância de JDialog não modal e filha da janelaPrincipal (Dica: chame o construtor new JDialog(janelaPrincipal, false);).
g) Defina o tamanho 320x240 para a variável caixaDialogo.
h) Faça o botão fechar da variável caixaDialogo interromper a execução do programa.
i) Torne a caixa de diálogo visível.
j) Execute a classe TestaModoExibicao e observe o resultado.
k) Tente fechar a janelaPrincipal sem fechar a caixaDialogo.
l) Altere a variável caixaDialogo como uma instância de JDialog modal e filha da janelaPrincipal (Dica: chame o construtor new JDialog(janelaPrincipal, true);).
m) Execute a classe TestaModoExibicao e observe o resultado.
n) Tente fechar a janelaPrincipal sem fechar a caixaDialogo.
o) Feche a caixaDialogo e verifique se o programa foi encerrado.
p) Adicione os arquivos no git remoto.
 */
package Atividade2;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setTitle("Testa Modo Exibicao");
        janelaPrincipal.setSize(640, 480);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
        
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        caixaDialogo.setTitle("Janela Dialogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
        
    }
    
}
