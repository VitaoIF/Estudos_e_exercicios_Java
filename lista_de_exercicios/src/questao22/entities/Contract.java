package questao22.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate data;
    private Double totalValue;

    private List<Installment> installment = new ArrayList<>();

    public Contract(LocalDate data, Integer number, Double totalValue) {
        this.data = data;
        this.number = number;
        this.totalValue = totalValue;
    }

    public Contract() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Installment> getInstallment() {
        return installment;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
