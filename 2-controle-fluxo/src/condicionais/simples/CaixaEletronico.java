public class CaixaEletronico {
    private double saldo = 25;

    public void sacar(double valorSaque) {
        /*
         * Quando ocorre uma validação de execução de fluxo somente quando a condição
         * for positiva, consideramos como uma estrutura Simples
         */

        if (valorSaque <= saldo) {
            saldo -= valorSaque;
        }

        System.out.println("Novo saldo: R$" + saldo);
    }
}
