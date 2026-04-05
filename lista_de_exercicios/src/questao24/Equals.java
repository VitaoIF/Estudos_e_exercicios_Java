package questao24;

public class Equals {
    public static void main(String[] args) {

        Client c1 = new Client("maria@gmail.com", "maria");
        Client c2 = new Client("maria@gmail.com", "maria");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
    }
}
