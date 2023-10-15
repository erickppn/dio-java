package edu.erickppn.operadores;

public class Unarios {
    public static void main(String args[]) {
        // (+) Operador unário de valor positivo – números são positivos sem esse
        // operador explicitamente;
        int numero = +5;
        System.out.println(numero);

        // (-) Operador unário de valor negativo – nega um número ou expressão
        // aritmética;
        numero = -numero;
        System.out.println(numero);

        // (++) Operador unário de incremento de valor – incrementa o valor em 1
        // unidade;
        numero++;
        System.out.println(numero);

        // (--) Operador unário de decremento de valor – decrementa o valor em 1
        // unidade;
        --numero;
        System.out.println(numero);

        // (!) Operador unário lógico de negação – nega o valor de uma expressão
        // booleana;
        var verdade = true;
        System.out.println(!verdade);
    }
}
