package condicionais.ternaria;

public class ResultadoEscolar {
    /*
     * Como vimos em operadores, podemos abreviar nosso algorítmico condicional
     * refatorando com o conceito de operador ternário.
     */

    public static void main(String[] args) {
        int nota = 6;

        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = (nota >= 7) ? "Aprovado" : (nota > 5 && nota < 7) ? "Em recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
