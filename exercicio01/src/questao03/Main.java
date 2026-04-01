package questao03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Valores quer adicionar? ");
        int n = input.nextInt();
        double[] vect = new double[n];

        System.out.println("Digite as alturas: ");
        for (int i=0; i<n; i++) {
            vect[i] = input.nextDouble();
        }

        System.out.println("Alturas digitadas com Sucesso");

        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }
        double media = sum/n;

        System.out.printf("MEDIA DAS ALTURAS: %.2f%n", media);

        input.close();
    }
}
