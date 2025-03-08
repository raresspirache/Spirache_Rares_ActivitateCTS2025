package ro.cts.model.platforma;

import ro.cts.model.personal.Angajat;
import ro.cts.model.personal.Aplicant;
import ro.cts.readers.AngajatiReader;
import ro.cts.readers.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader=new AngajatiReader("angajati.txt");
		try {
			listaAplicanti =baseReader.readAplicants();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
