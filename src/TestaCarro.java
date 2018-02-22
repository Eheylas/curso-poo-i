/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.ano = 1996;
        meuCarro.marca = "Fiat";
        meuCarro.valor = 12_500.00;
        System.out.println("Valor de meuCarro: " + meuCarro.valor);
        if (meuCarro.serPopular()) {
            System.out.println("meuCarro é popular");
        }
        System.out.println("Valor depreciado de meuCarro em 2020: " + meuCarro.calcularDepreciacao(2020));
    }
}
