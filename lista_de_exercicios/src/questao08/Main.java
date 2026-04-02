package questao08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Para usar uma Lista é necessário instanciar ela de uma classe que implmente
        // A interface Lista como por exemplo um ArrayList
        // Em versões antigas do Java era necessário informar o tipo nos <> mas hj em dia não precisa
        List<String> lista = new ArrayList<>();

        lista.add("Vito");
        lista.add("João");
        lista.add("Wesley");
        lista.add("Victor");
        lista.add("Deivin");
        lista.add("Clécio");
        lista.add("Radla");
        lista.add(2, "Marco");

        System.out.println("Tamanho da lista: "+lista.size());

        //lista.remove("Wesley"); formas de remover
        //lista.remove(4);
        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=");
        lista.removeIf(x -> x.charAt(0) == 'M');

        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=");
        System.out.println("Index de Wesley: " + lista.indexOf("Wesley"));
        System.out.println("Index de Vito: " + lista.indexOf("Vito"));
        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=");

        List<String> result = lista.stream()
                .filter(x -> x.charAt(0) == 'R')
                .toList();

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'V')
                .findFirst()
                .orElse(null);
        System.out.println(nome);

    }
}
