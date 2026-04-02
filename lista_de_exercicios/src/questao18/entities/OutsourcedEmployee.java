package questao18.entities;

public class OutsourcedEmployee extends Employee{
    private Double valorAdicional;

    public OutsourcedEmployee(){
    }

    public OutsourcedEmployee(Integer horas, String nome, Double valorPorHora, Double valorAdicional) {
        super(horas, nome, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double pagamento(){
        return  super.pagamento() + valorAdicional * 1.1;
    }


    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
