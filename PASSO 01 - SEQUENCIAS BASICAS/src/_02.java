import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        System.out.print("Qual é o seu nome? ");
        String nome = new Scanner(System.in).next();

        System.out.printf("Olá %s, é um prazer te conhecer!%n", nome);
    }
}
