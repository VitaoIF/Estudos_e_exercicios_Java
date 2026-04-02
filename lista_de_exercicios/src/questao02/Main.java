package questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Carro car = new Carro();
        System.out.print("Informe o modelo: ");
        car.modelo = input.next();

        System.out.print("Informe a marca: ");
        car.marca = input.next();

        System.out.print("Informe o peso: ");
        car.peso = input.nextInt();

        System.out.print("Informe o ano: ");
        car.ano = input.nextInt();

        System.out.print("Informe o estado: ");
        car.state = input.nextInt();

        car.info();
        car.estadoDoCarro();
    }
}
