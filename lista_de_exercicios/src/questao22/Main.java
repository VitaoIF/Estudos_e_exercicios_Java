package questao22;

import questao22.entities.Contract;
import questao22.entities.Installment;
import questao22.services.ContractService;
import questao22.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contract contract = new Contract(data, numero, valor);

        System.out.print("Informe o número de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallment()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
