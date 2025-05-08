package ro.cts.models;

public class Sectie extends StructuraAbs
{

    public Sectie(String nume, int numarAngajati) {
        super(nume, numarAngajati);
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {

    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {

    }

    @Override
    public void afiseazaDescriere() {

        System.out.println("Sectia "+ this.getNume());

    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return null;
    }

    @Override
    public int calculeazaNrAngajati() {
        return 0;
    }
}
