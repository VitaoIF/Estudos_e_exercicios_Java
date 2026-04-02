package questao01;

public class Pessoa {
    public String nome;
    public int altura;
    public int peso;

    public Pessoa(){}

    public void info(){
        System.out.println("Nome: "+ nome);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
    }
}
