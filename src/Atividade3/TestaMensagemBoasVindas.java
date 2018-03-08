/*
2. Escreva um programa Java que implemente uma mensagem de boas vindas.
a) Crie uma classe chamada TestaMensagemBoasVindas com um bloco main.
b) Dentro do bloco, crie uma mensagem de confirmação "Deseja iniciar o programa?" (Dica: retorne o resultado da mensagem em uma variavel opcao do tipo inteiro).
c) Se a resposta for "Sim", crie uma mensagem de entrada "Informe seu nome" (Dica: compare opcao com o valor JOptionPane.YES_OPTION).
d) Se um nome foi informado, crie uma mensagem de aviso "Bem-vindo <nome>!".
e) Se não informou um nome, crie uma mensagem de erro "Nome não informado!" (Dica: nome.equals("")).
f) Se a resposta for "Não", crie uma mensagem de alerta "O programa foi encerrado.".
g) Execute a classe TestaMensagemBoasVindas e observe o resultado.
h) Adicione os arquivos no git remoto.
 */
package Atividade3;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class TestaMensagemBoasVindas {
   public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?","Confirmação",JOptionPane.YES_NO_OPTION);
        String nome = "";
        if (opcao == JOptionPane.YES_OPTION) {
            nome = JOptionPane.showInputDialog(null, "Insira seu nome");
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Erro, nome não informado", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome, "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O programa foi encerrado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }
}
