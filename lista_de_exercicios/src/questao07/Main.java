package questao07;
// A dona de um pensionato possui dez quartos para alugar para estudantes,
// sendo esses quaros identificados pelos números 0 a 9

import java.util.Scanner;

// Fazer um programa que inicie todos os dez quartos vazios, e depois leia uma quantidade N
//Representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).
// Em seguida, registe o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome
// e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). suponha que o que seja escolhido
// um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por
// ordem de quarto.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de estudantes: ");
        int n = input.nextInt();
        input.nextLine();

        int quantidadeQuartos = 10;

        Estudantes alunos = new Estudantes();
        Quarto[] quartos = new Quarto[quantidadeQuartos];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + (i+1));
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("quarto: ");
            int quarto = input.nextInt();
            input.nextLine();

            alunos.setNome(nome);
            alunos.setEmail(email);
            alunos.setQuarto(quarto);
            quartos[quarto] = new Quarto(alunos);
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < quantidadeQuartos; i++) {
            if (quartos[i] != null){

                System.out.println(quartos[i].quarto + ": "+ quartos[i].nome + ", " + quartos[i].email);
            }

        }

    }
}
