package ro.cts.readers;

import ro.cts.model.personal.Aplicant;
import ro.cts.model.personal.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends BaseReader
{
    public StudentiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student=new Student();
            citireAplicant(student,input);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
