package ro.cts.models;

import javax.print.attribute.standard.JobKOctets;

public abstract class StructuraAbs
{


    private String nume;

    private int numarAngajati;

    public StructuraAbs(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public abstract void stergeNod(StructuraAbs structuraAbs);
    public abstract void adaugaNod(StructuraAbs structuraAbs);
    public abstract void afiseazaDescriere();
    public abstract StructuraAbs getNodCopil(int index);
    public abstract int calculeazaNrAngajati();
}
