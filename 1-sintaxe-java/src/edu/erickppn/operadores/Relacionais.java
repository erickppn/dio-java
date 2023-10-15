package edu.erickppn.operadores;

public class Relacionais {
    public static void main(String args[]) {
        int numero1 = 1;
        int numero2 = 2;

        // == Quando desejamos verificar se uma variável é IGUAL A outra.
        boolean simNao = numero1 == numero2;
        System.out.println("Número1 é igual a Número2? " + simNao);

        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        simNao = numero1 != numero2;
        System.out.println("Número1 é diferente do Número2? " + simNao);

        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        simNao = numero1 > numero2;
        System.out.println("Número1 é maior que o Número2? " + simNao);

        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        simNao = numero1 >= numero2;
        System.out.println("Número1 é maior ou igual ao Número2? " + simNao);

        // < Quando desejamos verificar se uma variável é MENOR QUE outra.
        simNao = numero1 < numero2;
        System.out.println("Número1 é menor que o Número2? " + simNao);

        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        simNao = numero1 <= numero2;
        System.out.println("Número1 é menor ou igual ao Número2? " + simNao);
    }
}
