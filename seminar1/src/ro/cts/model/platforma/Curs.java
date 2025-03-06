package ro.cts.model.platforma;

import ro.cts.model.personal.Student;
import ro.cts.model.personal.iPersoana;
import ro.cts.model.personal.iPredabil;

import java.util.List;

public class Curs
{
    private String nume;

    private iPredabil cadruDidactic;

    private List<Student> studenti;

    public Curs(String nume, iPredabil cadruDidactic, List<Student> studenti) {
        this.nume = nume;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public iPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(iPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustinereExamen()
    {
        StringBuilder sb=new StringBuilder("Cadrul didactic ");
        sb.append(((iPersoana)this.cadruDidactic).getNume());
        sb.append(" are examen la materia ");
        sb.append(this.nume);
        sb.append(" cu urmatorii studenti");
        System.out.println(sb);
        for(Student student : studenti)
        {
            System.out.println(student.getNume());
        }
    }
}
