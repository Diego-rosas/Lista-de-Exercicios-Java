// Exercicio 05
// Função : Calcula a media de duas notas e mostra o resultado.
// Autor : Diego Rosas
// Data : 05/04/2025
// Seção de Declarações

import java.util.Scanner;

import static java.lang.Float.parseFloat;


public class _05 {
    public static void main(String[] args) {
        System.out.print("Digite a nota 1: ");
        String primeiraNota = new Scanner(System.in).next();

        System.out.print("Digite a nota 2: ");
        String segundaNota = new Scanner(System.in).next();

        float media = parseFloat(primeiraNota) + parseFloat(segundaNota);

        System.out.printf("A média entre %s e %s é igual a %s: ", primeiraNota, segundaNota, media);

    }
}
