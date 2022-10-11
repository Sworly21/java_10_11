package hu.petrik.javainterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus = new ArrayList<>();
    static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
	    Konyv konyv1 = new Konyv("A gyűrűk ura", "J. R. R Tolkien", "AABBCC-12314");
        Dvd dvd1 = new Dvd("Star Wars V. rész", 124);
        Dvd dvd2 = new Dvd("Star Wars IV. rész", 121);
        Dvd dvd3 = new Dvd("Star Wars VI. rész", 131);
        Dvd dvd4 = new Dvd("A gyűrűk ura 1", 102);
        Dvd dvd5 = new Dvd("A gyűrűk ura 2", 103);
        Dvd dvd6 = new Dvd("A gyűrűk ura 3", 104);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);

        Kolcsonozheto kolcsonozheto = new Kolcsonozheto() {
            @Override
            public String megjelenitendoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        for (Kolcsonozheto e : katalogus){
            System.out.println(e.megjelenitendoNev() + " " + e.meddigKolcsonozheto());
        }

        System.out.println();

        Collections.sort(dvdk);
        for (Dvd d : dvdk){
            System.out.println(d.megjelenitendoNev() + " " + d.getHossz());
        }
    }
}
