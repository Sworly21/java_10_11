package hu.petrik.javainterfaces;

import java.time.LocalDateTime;

public class Ujsag implements Kolcsonozheto{

    private String cim;
    private int kiadasEv;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    private int kiadasHet;

    @Override
    public String megjelenitendoNev() {
        return String.format("%s %d/%d", this.cim, this.kiadasEv, this.kiadasHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
