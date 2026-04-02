package questao04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos produtos deseja informar? ");
        int n = input.nextInt();
        Produtos[] produtos = new Produtos[n];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Informe o nome do produto: ");
            String nome = input.next();

            System.out.print("Informe o preço do produto: ");
            double preco = input.nextDouble();

            produtos[i] = new Produtos(nome, preco);
        }

        System.out.println("Produtos cadastrados com sucesso");

        double soma = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double media = soma/ produtos.length;
        System.out.printf("Média de preços: %.2f%n", media);

        input.close();
    }
}
