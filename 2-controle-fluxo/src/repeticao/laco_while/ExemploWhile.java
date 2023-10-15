package repeticao.laco_while;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    /*
     * O laço while (na tradução literal para a língua portuguesa “enquanto”)
     * determina que enquanto uma condição for válida, o bloco de código será
     * executado. O laço while testa a condição antes de executar o código, logo,
     * caso a condição seja inválida no primeiro teste o bloco nem será executado.
     */

    public static void main(String[] args) {
        /*
         * Estrutura do controle de fluxo while
         * 
         * while (expressão booleana de validação)
         * {
         *    comando que será executado até que a
         *    expressão de validação torne-se falsa
         * }
         */

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = valorAleatorio();

            if (mesada < 2) 
                break;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
