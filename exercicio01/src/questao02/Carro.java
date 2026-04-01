package questao02;

public class Carro {
    public String modelo;
    public String marca;
    public int peso;
    public int ano;
    public int state = 0;

    public void estadoDoCarro(){
        if (state != 0){
            System.out.println("O carro está ligado");
        } else{
            System.out.println("O carro está desligado");
        }
    }

    public void info() {
        System.out.println("O modelo: "+ modelo);
        System.out.println("A marca: " + marca);
        System.out.println("O peso: " + peso);
        System.out.println("O ano: " + ano);
    }
}
