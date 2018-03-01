/*
1. Escreva um programa Java que implemente uma janela principal.
a) Crie um pacote chamado atividade02 no projeto curso-poo-i do NetBeans.
b) Crie uma classe chamada TestaJanelaPrincipal com o bloco main.
c) Dentro do bloco, defina uma variável janela inicializando-a com uma instância de JFrame.
d) Importe a classe javax.swing.JFrame (Dica: Pressione CTRL SHIFT I para fazer a importação).
e) Define o título "Janela Principal" fazendo uma chamada ao método setTitle da variável janela.
f) Defina o tamanho 640x480 fazendo uma chamada ao método setSize da variável janela.
g) Execute a classe TestaJanelaPrincipal e observe o resultado.
h) Interrompa a execução da classe TestaJanela e acrescente a chamada ao método setVisible da variável janela passando como parâmetro o valor true.
i) Execute a classe TestaJanelaPrincipal e observe o resultado.
j) Feche a janela e verifique se o programa foi encerrado.
k) Interrompa a execução da classe TestaJanela e acrescente uma chamada ao método setDefaultCloseOperation da variável janela passando como parâmetro a constante JFrame.EXIT_ON_CLOSE.
l) Execute a classe TestaJanelaPrincipal e observe o resultado.
m) Feche a janela e verifique se o programa foi encerrado.
n) Acrescente uma chamada ao método setExtendedState da variável janela passando como parâmetro a constante JFrame.MAXIMIZED_BOTH.
o) Execute a classe TestaJanelaPrincipal e observe o resultado.
p) No menu Equipe escolhe a opção Adicionar para incluir no git local. Em seguida, efetive o commit acionando a opção Fazer Commit do menu Equipe.
q) Envie os arquivos versionados para o git remoto acionando a opção Expandir para Upstream do menu Equipe->Remoto.
 */
package Atividade2;

import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class TestaJanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640, 480);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
    
}
