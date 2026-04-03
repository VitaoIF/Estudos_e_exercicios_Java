package questao20;

import questao20.entities.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a data (dd/MM/yyyy): ");
        String checkin = sc.nextLine();

        LocalDate checkIn = LocalDate.parse(checkin, formatter);

        System.out.print("Data de checkout (dd/MM/yyyy): ");
        String checkoutStr = sc.nextLine();
        LocalDate checkOut = LocalDate.parse(checkoutStr, formatter);

        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Erro na reserva! A data do check-out deve ser depois da data do check-in");
        } else {
            Reserva reserva = new Reserva(checkIn, checkOut, numero);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva: ");

            System.out.print("Digite a data (dd/MM/yyyy): ");
            checkin = sc.nextLine();
            checkIn = LocalDate.parse(checkin, formatter);

            System.out.print("Data de checkout (dd/MM/yyyy): ");
            checkoutStr = sc.nextLine();
            checkOut = LocalDate.parse(checkoutStr, formatter);


            String erro = reserva.atualizarDatas(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva " + erro);
            } else {
                System.out.println("Reserva: " + reserva);
            }

            sc.close();
        }
    }
}
