package ro.cts.model.personal;

public class Asistent extends Persoana implements iPredabil
{
    private int idAsistent;

    private float experienta;

    public Asistent(String nume, int varsta, float experienta, int idAsistent) {
        super(nume, varsta);
        this.experienta = experienta;
        this.idAsistent = idAsistent;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public float getExperienta() {
        return experienta;
    }

    public void setExperienta(float experienta) {
        this.experienta = experienta;
    }

    public void preda()
    {
        StringBuilder sb=new StringBuilder("Asistentul ");
        sb.append(super.nume);
        sb.append(" preda de obicei la seminar");
        System.out.println(sb);
    }

    @Override
    public void afiseazaModInvatare()
    {
        StringBuilder sb=new StringBuilder("Asistentul invata de ");
        sb.append(this.experienta);
        sb.append(" ani");
        System.out.println(sb);
    }
}
