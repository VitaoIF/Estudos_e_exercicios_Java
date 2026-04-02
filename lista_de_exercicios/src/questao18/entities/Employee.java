package questao18.entities;

public class Employee {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Employee() {
    }

    public Employee(Integer horas, String nome, Double valorPorHora) {
        this.horas = horas;
        this.nome = nome;
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return horas * valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
