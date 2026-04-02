package questao18;

import questao18.entities.Employee;
import questao18.entities.OutsourcedEmployee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de empregados: ");
        int n = input.nextInt();
        input.nextLine();

        List<Employee> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionario #"+ (i+1)+ " :");
            System.out.print("Terceirizado (y/n)? ");
            char ehterceirizado = input.next().charAt(0);
            input.nextLine();

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Horas: ");
            int horas = input.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = input.nextDouble();

            if (ehterceirizado == 'n'){
                funcionarios.add(new Employee(horas, nome, valorPorHora));
            } else if (ehterceirizado == 's'){
                System.out.print("Valor adicional: ");
                double valorAdicional = input.nextDouble();
                funcionarios.add(new OutsourcedEmployee(horas, nome, valorPorHora, valorAdicional));
            }

        }

        System.out.println();
        System.out.println("Pagamentos:");
        for (Employee emp : funcionarios){
            System.out.println(emp.getNome() + " - R$" + emp.pagamento());
        }
    }
}
