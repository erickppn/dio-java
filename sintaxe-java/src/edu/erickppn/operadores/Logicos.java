package edu.erickppn.operadores;

public class Logicos {
    public static void main(String args[]) {
        // Os operadores lógicos representam o recurso que nos permite criar expressões
        // lógicas maiores a partir da junção de duas ou mais expressões.

        // && Operador Lógico "E"
        // || Operador Lógico "OU"
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");
        }

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2  && (7 > 4)) {
            System.out.print("Um dos valores é verdadeiro");
        }
    }
}
