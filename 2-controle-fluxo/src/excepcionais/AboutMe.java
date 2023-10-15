package excepcionais;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    /*
     * Ao executar o código Java, diferentes erros podem acontecer: erros de
     * codificação feitos pelo programador, erros devido a entrada errada ou outros
     * imprevistos.
     * 
     * Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O
     * termo técnico para isso é: Java lançará uma exceção (jogará um erro).
     */

    /* EXCEÇÃO != ERRO */

    /*
     * De forma interpretativa em Java, um erro é algo irreparável, a aplicação
     * trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da
     * nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um
     * arquivo que não existe, abrir uma conexão de banco com usuário ou senha
     * inválida.
     */

    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Aparentemente é um programa simples, mas vamos listar algumas possíveis
        // exceções que podem acontencer:

        System.out.println("Digite seu nome");
        String nome = scanner.next(); // Não informar o nome

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next(); // Não informar o sobrenome

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt(); // O valor da idade ter um caractere NÃO numérico

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble(); // O valor da altura ter uma vírgula ao invês de ser um ponto

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
    }
}
