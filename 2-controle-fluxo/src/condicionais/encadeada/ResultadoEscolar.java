package condicionais.encadeada;

public class ResultadoEscolar {
    /*
     * Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e
     * senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.
     */
    
    public static void main(String[] args) {
        int nota = 2;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
