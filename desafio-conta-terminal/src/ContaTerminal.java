import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o número da Agência.");
        String numeroAgencia = scanner.next();

        System.out.println("Agora digite o seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo da sua conta.");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}
