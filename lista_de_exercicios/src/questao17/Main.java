package questao17;

import questao17.entities.ImportedProduct;
import questao17.entities.Product;
import questao17.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome;
        double preco;

        System.out.print("Informe o número de produtos: ");
        int n = input.nextInt();
        input.nextLine();

        List<Product> produtos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Informações do "+ (i+1) +"o produto: ");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipo = input.next().charAt(0);
            input.nextLine();

            if (tipo == 'c'){
                System.out.print("Nome: ");
                nome = input.nextLine();

                System.out.print("Preco: ");
                preco = input.nextDouble();

                produtos.add(new Product(nome, preco));
            } else if (tipo == 'i') {
                System.out.print("Nome: ");
                nome = input.nextLine();

                System.out.print("Preco: ");
                preco = input.nextDouble();

                System.out.print("Taxa: ");
                double taxa = input.nextDouble();

                produtos.add(new ImportedProduct(nome, preco, taxa));
            } else if (tipo == 'u') {
                System.out.print("Nome: ");
                nome= input.nextLine();

                System.out.print("Preço: ");
                preco = input.nextDouble();

                input.nextLine();

                System.out.print("Digite a data de fabricação (dd/MM/yyyy): ");
                String dataTexto = input.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataTexto, formatter);

                produtos.add(new UsedProduct(nome, preco, data));
            }


        }

        System.out.println("Etiquetas de preço: ");
        for (Product p: produtos){
            System.out.println(p.etiquetaPreco());
        }

    }
}
