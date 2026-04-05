package questao25;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

    }
}
