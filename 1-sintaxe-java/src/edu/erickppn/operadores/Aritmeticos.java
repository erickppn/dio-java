package edu.erickppn.operadores;

public class Aritmeticos {
    public static void main(String args[]) {
        // Os operadores aritméticos são utilizados para realizar operações matemáticas
        // entre valores numéricos

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // O operador de adição (+), quando utilizado em variáveis do tipo texto,
        // realizará a “concatenação de textos”
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + 1 + 1 + 1;

        concatenacao = "1" + (1 + 1 + 1);
    }
}
