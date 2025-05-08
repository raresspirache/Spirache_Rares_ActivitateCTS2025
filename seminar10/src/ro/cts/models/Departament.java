package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{

    private List<StructuraAbs> structuri;

    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {

    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {

        structuri.add(structuraAbs);

    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamenul "+ this.getNume()+" contine urmatoarele sub-departamente/sectii: ");
        structuri.forEach(StructuraAbs::afiseazaDescriere);
    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return null;
    }

    @Override
    public int calculeazaNrAngajati() {
        int suma=0;

        for(StructuraAbs structuraAbs : structuri)
        {
            suma+=structuraAbs.getNumarAngajati();
        }
        return suma+this.getNumarAngajati();
    }
}
