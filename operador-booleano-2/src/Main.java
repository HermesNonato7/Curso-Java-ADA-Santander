import java.util.Scanner;

// código simples sem tratamento de exceções

public class Main {
    public static void main(String[] args) {

        Scanner leitor =  new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();

        System.out.print("Digite a nota 4: ");
        float nota4 = leitor.nextFloat();

        float nota = nota1 + nota2;

        float media = nota / 4;
        if ( media >= 7) {
            System.out.println("\nAluno Aprovado!");
        } else {
            System.out.println("\nAluno Reprovado.");
        }
    }
}