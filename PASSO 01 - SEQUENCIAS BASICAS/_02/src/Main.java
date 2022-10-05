// Funcao : Ler o nome de uma pessoa e dah boas vindas.
// Autor : Diego Rosas
// Data : 04/10/2022

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Qual é o seu nome? ");
        String nome = new Scanner(System.in).next();

        System.out.printf("Olá %s, é um prazer te conhecer!%n", nome);
    }
}