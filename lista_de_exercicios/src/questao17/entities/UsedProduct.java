package questao17.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate diaDeFabricacao;

    public UsedProduct(){

    }

    public UsedProduct(String nome, Double preco, LocalDate diaDeFabricacao) {
        super(nome, preco);
        this.diaDeFabricacao = diaDeFabricacao;
    }

    @Override
    public String etiquetaPreco(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return getNome()
                + " (usado) R$"
                + getPreco()
                + " (Dia de fabricação: "
                + getDiaDeFabricacao().format(formatter)
                + ")";

    }

    public LocalDate getDiaDeFabricacao() {
        return diaDeFabricacao;
    }

    public void setDiaDeFabricacao(LocalDate diaDeFabricacao) {
        this.diaDeFabricacao = diaDeFabricacao;
    }
}
