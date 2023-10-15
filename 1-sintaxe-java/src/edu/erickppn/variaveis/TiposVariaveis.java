package edu.erickppn.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // DADOS PRIMITIVOS //

        byte idade = 25;
        short ano = 2025;
        int cep = 21989345;
        long cpf = 95523496712L; // Se começar com zero, é melhor utilizar outro tipo de dao
        float PI = 3.14F;
        double salarioMinino = 2500.33;

        char letra = 87;
        letra = 'd';
        System.out.println(letra);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting

        // Variável VS Constante
        int numero = 1;
        final double VALOR_DE_PI = 3.14;

        numero = 2;
        // VALOR_DE_PI = 4;
    }
}
