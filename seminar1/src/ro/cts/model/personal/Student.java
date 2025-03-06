package ro.cts.model.personal;

public class Student extends Persoana
{
    private int idStudent;

    private  int aniStudentie;

    public Student(String nume, int varsta, int idStudent, int aniStudentie) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.aniStudentie = aniStudentie;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAniStudentie() {
        return aniStudentie;
    }

    public void setAniStudentie(int aniStudentie) {
        this.aniStudentie = aniStudentie;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb=new StringBuilder("Studentul invata de ");
        sb.append(this.aniStudentie);
        sb.append(" ani");
        System.out.println(sb);
    }
}
