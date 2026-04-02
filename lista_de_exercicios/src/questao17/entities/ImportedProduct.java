package questao17.entities;

public class ImportedProduct extends Product{
    private Double precoFrete;

    public ImportedProduct(){

    }

    public ImportedProduct(String nome, Double preco, Double precoFrete) {
        super(nome, preco);
        this.precoFrete = precoFrete;
    }

    @Override
    public String etiquetaPreco(){
        return getNome()
                + " R$"
                + precoTotal()
                + " (Custos do frete: $ "
                + getPrecoFrete()
                + ")";

    }

    public double precoTotal(){
        return precoFrete + getPreco();
    }

    public Double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(Double precoFrete) {
        this.precoFrete = precoFrete;
    }
}
