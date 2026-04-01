package questao01;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.print("Informe o seu nome: ");
        pessoa.nome = input.nextLine();

        System.out.print("Informe sua Altura: ");
        pessoa.altura = input.nextInt();

        System.out.print("Informe seu Peso: ");
        pessoa.peso = input.nextInt();

        pessoa.info();

    }
}