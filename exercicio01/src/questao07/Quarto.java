package questao07;

public class Quarto {
    public int[] quartos = new int[10];
    public Estudantes estudantes = new Estudantes();
    public int quarto;
    public String nome;
    public String email;

    public Quarto(Estudantes estudantes) {
        this.estudantes = estudantes;
        this.quarto = estudantes.getQuarto();
        this.nome = estudantes.getNome();
        this.email = estudantes.getEmail();
    }
}
