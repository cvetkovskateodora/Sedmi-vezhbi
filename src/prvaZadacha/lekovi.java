package prvaZadacha;

import java.util.ArrayList;
import java.util.List;

public class lekovi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Analgin");
        lista.add("Paracetamol");
        lista.add("Kafetin");

        if(lista.get(lista.size() - 1).equals("Paracetamol")){
            System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
        }
        else
            System.out.println("Namenata na lekot e nepoznata");
    }
}
