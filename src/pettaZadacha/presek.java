package pettaZadacha;

import java.util.Set;
import java.util.TreeSet;

public class presek{
    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet();
        mnozestvo1.add("F");
        mnozestvo1.add("I");
        mnozestvo1.add("K");
        mnozestvo1.add("T");
        mnozestvo1.add("M");
        Set<String> mnozestvo2 = new TreeSet();
        mnozestvo2.add("F");
        mnozestvo2.add("I");
        mnozestvo2.add("K");
        mnozestvo2.add("T");
        mnozestvo2.add("O");
        mnozestvo2.add("P");
        System.out.println("Presek na dvete mnozestva e");
        mnozestvo1.retainAll(mnozestvo2);
        System.out.println(mnozestvo1);

    }
}

