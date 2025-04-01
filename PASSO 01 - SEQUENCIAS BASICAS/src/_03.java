//Exercicio 03
// Função: Lê o nome e o salário de um funcionário, mostrando no final uma mensagem.
// Autor : Diego Rosas
// Data : 31/03/2025
// Seção de Declarações

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        System.out.printf("Digite o nome do funcionario(a): ");
        String nomeDoFuncionario = new Scanner(System.in).next();

        System.out.printf("Digite o salario do funcionario(a): ");
        String salarioDoFuncionario = new Scanner(System.in).next();

        System.out.printf("Digite o mês correspodente ao salario: ");
        String mesDoSalario = new Scanner(System.in).next();

        System.out.printf("O funcionario(a) %s, teve um salário de R$ %s,00 em %s.",  nomeDoFuncionario, salarioDoFuncionario, mesDoSalario);
    }
}
