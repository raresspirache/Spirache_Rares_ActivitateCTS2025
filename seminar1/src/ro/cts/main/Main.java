package ro.cts.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti=new ArrayList<>();
        studenti.add(new Student("Popescu",21,1,2));
        studenti.add(new Student("Ionescu",22,2,3));

        iPredabil profesor=new Profesor("Gigel",38,1,12);

        Curs curs=new Curs("CTS",profesor,studenti);

        curs.sustinereExamen();

        iPredabil asistent=new Asistent("Andrei",26,2,1);
        curs.setCadruDidactic(asistent);

        ((Persoana)curs.getCadruDidactic()).afiseazaModInvatare();

        curs.sustinereExamen();
    }
}