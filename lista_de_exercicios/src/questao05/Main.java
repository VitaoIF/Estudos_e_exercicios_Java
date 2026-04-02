package questao05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números vc vai digitar? ");
        int n = input.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Números Negativos:");
        for (int j : vetor) {
            if (j < 0) {
                System.out.println(j);
            }
        }
    }
}
