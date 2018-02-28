
package atividade01;

public class TestaCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.setAno(1998);
        car1.setMarca("Fiat");
        car1.setValor(50.000);
        
        if(car1.serPopular() == true){
            System.out.println("O carro é porpular!");
        }
        else{
            System.out.println("O carro não é popular!");
        }
        car1.calcularDepreciacao(2020);
        System.out.println(car1.getValor());
    }
}
