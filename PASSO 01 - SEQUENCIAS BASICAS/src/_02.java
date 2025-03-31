// Funcao : Ler o nome de uma pessoa e dar boas vindas.
// Autor : Diego Rosas
// Data : 31/03/2025

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        System.out.print("Qual é o seu nome? ");
        String nome = new Scanner(System.in).next();

        System.out.printf("Olá %s, é um prazer te conhecer!%n", nome);
    }
}
