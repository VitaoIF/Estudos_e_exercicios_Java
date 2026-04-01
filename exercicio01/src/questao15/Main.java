package questao15;

import questao15.entities.Department;
import questao15.entities.HourContract;
import questao15.entities.Worker;
import questao15.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o nome do departamento: ");
        String nomeDepartamento = input.nextLine();

        System.out.println("Entre com o dado do empregado: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = input.nextLine();

        System.out.print("Level: ");
        String nivelTrabalhador = input.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = input.nextDouble();

        Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivelTrabalhador), salarioBase, new Department(nomeDepartamento));

        System.out.print("Quantos contratos para " + nomeTrabalhador + " ?");
        int n = input.nextInt();
        input.next();
        for (int i = 0; i < n; i++) {
            System.out.print("Entre com os dados do contrato da " + (i+1) + " :");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(input.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = input.nextDouble();

            System.out.print("Duração: ");
            int horas = input.nextInt();

            HourContract contract = new HourContract(contractDate, valorPorHora, horas);
            worker.addContract(contract);
        }

        System.out.print("");
        System.out.print("Entre com o mês e o ano para calcular o salário: ");
        String mesEAno = input.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + worker.getNome());
        System.out.println("Departamento: " + worker.getDepartment().getNome());
        System.out.println("Salário para " +mesEAno + ": " + String.format("%.2f", worker.income(ano, mes)));

        input.close();

    }

}
