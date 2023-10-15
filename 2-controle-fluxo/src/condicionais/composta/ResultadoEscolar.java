package condicionais.composta;

public class ResultadoEscolar {
    /*
     * Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução
     * condionado a uma regra de negócio, este cenário é demoninado Estrutura
     * Condicional Composta.
     */

    public static void main(String[] args) {
        int nota = 4;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
