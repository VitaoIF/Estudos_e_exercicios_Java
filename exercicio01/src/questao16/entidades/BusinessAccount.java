package questao16.entidades;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        //super(); Caso tenha alguma lógica que precise repetir
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // Estou chamando o construtor da super classe(ou classe mãe)
        this.loanLimit = loanLimit;
    }

    @Override
    public void saque(double amount){
        super.saque(amount);
        balance -= 2.0;
    }

    public void loan(double amount){
        if (amount <= loanLimit) {
            depositar(amount);
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
