package questao09;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = input.nextInt();
        input.next();

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Empragado #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = input.nextInt();


            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Salario: ");
            double salario = input.nextDouble();

            funcionarios.add(new Funcionarios(id, nome, salario));

        }

        System.out.print("Informe o id do funcionario: ");
        int id = input.nextInt();

        Funcionarios funcionarios1 = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionarios1 == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            funcionarios1.increaseSalary(percentage);
        }

    }
}
