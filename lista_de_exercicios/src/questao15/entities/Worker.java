package questao15.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private Double salarioBase;

    private Department department;
    private List<HourContract> contacts = new ArrayList<>();

    public void addContract(HourContract contract){
        contacts.add(contract);
    }

    public void removeContract(HourContract contract){
        contacts.remove(contract);
    }

    public double income(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contacts){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }

    public Worker() {
    }

    public Worker(String nome, WorkerLevel level, Double salarioBase, Department department) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.department = department;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContacts() {
        return contacts;
    }

}