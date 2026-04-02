package questao06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            
            System.out.print("Nome: ");
            String nome = input.next();
            
            System.out.print("Idade: ");
            int idade = input.nextInt();
            
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0.0;
        for (Pessoa value : pessoa) {
            soma += value.getAltura();
        }

        double mediaAlturas = soma/ pessoa.length;
        System.out.println();
        System.out.printf("Média de alturas: %.2f%n", mediaAlturas);

        int contador = 0;
        for (Pessoa value : pessoa) {
            if (value.getIdade() < 16) {
                contador += 1;
            }
        }
        double porcentagem = contador * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (Pessoa value : pessoa) {
            if (value.getIdade() < 16) {
                System.out.println(value.getNome());
            }
        }


        input.close();
    }
}
