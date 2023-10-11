package edu.erickppn.tema.indentacao;

public class BoletimEstudantil {
    public static void main(String[] args) {
    // Algoritmo sem indentação
    // int mediaFinal = 6;
    // if(mediaFinal<6)	
    // System.out.println("REPROVADO"); 
    // else if(mediaFinal==6)
    // System.out.println("PROVA MINERVA"); 
    // else
    // System.out.println("APROVADO");

    // Algoritmo com identação
    int mediaFinal = 6;
    
    if (mediaFinal < 6)
        System.out.println("REPROVADO");
    else if (mediaFinal == 6)
        System.out.println("PROVA MINERVA");
    else
        System.out.println("APROVADO");
    }
}