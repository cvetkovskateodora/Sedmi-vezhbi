package pettaZadacha;

import java.util.Set;
import java.util.TreeSet;

public class unija {
    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet();
        mnozestvo1.add("F");
        mnozestvo1.add("I");

        Set<String> mnozestvo2 = new TreeSet();
        mnozestvo2.add("K");
        mnozestvo2.add("T");

        System.out.println("Unija od dvete mnozhestva e:");
        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);
    }
}

