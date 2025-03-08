package ro.cts.readers;

import ro.cts.model.personal.Angajat;
import ro.cts.model.personal.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends BaseReader
{
    public AngajatiReader(String fileName) {
        super(fileName);
    }
    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat= new Angajat();
            citireAplicant(angajat,input2);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
