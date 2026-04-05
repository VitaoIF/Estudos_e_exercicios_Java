package questao23;

import questao23.service.PrintService;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> service = new PrintService<>();

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            service.addValue(value);
        }

        service.print();
        System.out.println("Primeiro: " + service.first());
        sc.close();
    }
}
