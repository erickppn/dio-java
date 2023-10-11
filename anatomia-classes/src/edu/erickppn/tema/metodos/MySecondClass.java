package edu.erickppn.tema.metodos;

public class MySecondClass {
    public static void main(String[] args) {
        String primeiroNome = "Erick";
        String segundoNome = "Neres";

        // Chamando o método
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    /*
     * Declaração de métodos
     * 
     * Estrutura:
     * TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
     */

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" " + segundoNome);
    };
}
