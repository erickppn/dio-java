package repeticao.laco_for;

public class ExemploFor {
    /*
     * O comando for (na tradução literal para a língua portuguesa “para”) permite
     * que uma variável contadora seja testada e incrementada a cada iteração, sendo
     * essas informações definidas na chamada do comando. O comando for recebe como
     * entrada uma variável contadora, a condição para continuar a execução e o
     * valor de incrementação.
     */

    public static void main(String[] args) {
        /*
         * Estrutura do controle de fluxo for
         * 
         * for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
         * {
         *    comando que será executado até que a
         *    expressão de validação torne-se falsa
         * }
         */

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            /*
             * int carneirinhos = 1; -> O programa entende que a variável carneirinhos
             * começa com o valor igual a 1 e isso acontece somente uma vez;
             *
             * carneirinhos < = 20; -> O programa verifica se a variável carneirinhos ainda
             * é menor que 20;
             * 
             * O programa começa a executar o algorítimo, no nosso caso imprimir a
             * quantidade de carneirinhos em contagem;
             * 
             * carneirinhos ++ -> O programa aumenta em mais 1 o valor da variável
             * carneirinhos;
             * 
             * O fluxo é finalizado quando a variável carneirinhos for igual a 20.
             */

            if (carneirinhos == 1)
                System.out.println(carneirinhos + " carneirinho");
            else
                System.out.println(carneirinhos + " carneirinhos");

        }

        System.out.println("Joaozinho dormiu");

        // Arrays começam com indice igual a 0 (zero), iniciamos a nossa variável x
        // também com valor zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        // Forma abreviada | for each
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
