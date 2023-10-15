package excepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchAboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TRATAMENTO DE EXCEÇÕES
        /*
         * A instrução try permite que você defina um bloco de código para ser testado
         * quanto a erros enquanto está sendo executado.
         * 
         * A instrução catch permite definir um bloco de código a ser executado, caso
         * ocorra um erro no bloco try.
         * 
         * A instrução finally permite definir um bloco de código a ser executado
         * independente de ocorrer um erro ou não. As palavras-chave try e catch vêm em
         * pares:
         */

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
