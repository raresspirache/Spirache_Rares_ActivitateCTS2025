package prototype.ro.seminar4.main;

import prototype.ro.seminar4.models.ARezervare;
import prototype.ro.seminar4.models.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare r1 = new Rezervare("Andrei",13,2,12,Boolean.TRUE);
        ARezervare r2 = r1.clonare(20);

        System.out.println(r2.toString());

    }
}