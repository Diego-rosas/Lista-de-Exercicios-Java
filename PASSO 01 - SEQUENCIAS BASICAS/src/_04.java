// Exercicio 04
// Função : Algoritmo que lê dois números inteiros e mostra o somatório entre eles.
// Autor : Diego Rosas
// Data : 01/04/2025
// Seção de Declarações

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class _04 {
    public static void main(String[] args) {
        System.out.printf("Digite um número: ");
        String primeiroNumero = new Scanner(System.in).next();

        System.out.printf("Digite outro número: ");
        String segundoNumero = new Scanner(System.in).next();

        int soma = parseInt(primeiroNumero) + parseInt(segundoNumero);

        System.out.printf("A soma entre %s e %s é igual a %s: ", primeiroNumero, segundoNumero, soma);

    }

}
