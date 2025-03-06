package ro.cts.model.personal;

public class Profesor extends Persoana implements iPredabil
{
    private int idProfesor;

    private int vechime;

    public Profesor(String nume, int varsta, int idProfesor, int vechime) {
        super(nume, varsta);
        this.idProfesor = idProfesor;
        this.vechime = vechime;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void preda() {
        StringBuilder sb=new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(" preda la curs");
        System.out.println(sb);
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb=new StringBuilder("Profesorul preda de ");
        sb.append(this.vechime);
        sb.append(" ani");
        System.out.println(sb);
    }
}
