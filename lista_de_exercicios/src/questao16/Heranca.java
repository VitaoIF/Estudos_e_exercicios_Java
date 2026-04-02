package questao16;

import questao16.entidades.Account;
import questao16.entidades.BusinessAccount;
import questao16.entidades.SavingsAccount;

public class Heranca {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // Upcasting = pegar um objeto do tipo BusinessAccount e atribuir para uma variavel do tipo account

        Account acc1 = bacc; // Não dá erro pq a herança tem como elemento ser "é-um" ou seja uma BusinnessAccount é uma Account
        Account acc2 = new BusinessAccount(2002, "Wesley", 0.0, 100.0);
        Account acc3 = new SavingsAccount(2003, "João Elias", 0.0, 0.01);
        //Super normal pegar um objeto da subclasse e atribuir a superclasse

        // DownCasting = converter um objeto da superclasse para a subclasse o processo inverso

        //BusinessAccount acc4 = acc2; Dessa forma dá erro pq não posso converter de Account para BusinessAccount
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; Aqui já dá erro pq o objeto acc3 é um SavingAccount
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Empréstimo Realizado! ");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Atualizado! ");
        }

        Account acc6 = new Account(2010, "Ernesto", 1000.0);
        acc6.saque(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(2210, "Mariana", 1000.0,0.01);
        acc7.saque(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(2011, "Max Steel", 1000.0, 500.0);
        acc8.saque(200.0);
        System.out.println(acc8.getBalance());

    }

}
