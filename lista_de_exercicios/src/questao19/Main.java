package questao19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        metodo1();

        System.out.println("FIm do programa");
    }

    public static void metodo1(){
        System.out.println("*** Começo do Metodo 1 ***");
        metodo2();
        System.out.println("*** Fim do Metodo 1 ***");
    }

    public static void metodo2(){
        System.out.println("*** Começo do Metodo 2 ***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vect[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Invalida!");
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de input! ");
        }
        System.out.println("*** Fim do Metodo 2 ***");

        sc.close();
    }
}
