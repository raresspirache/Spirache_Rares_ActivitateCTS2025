package ro.cts.main;

import ro.cts.models.IBuilder;
import ro.cts.models.Rezervare;
import ro.cts.models.RezervareBuild;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuild("Ionescu Nicolae");
        Rezervare rezervare;
        Rezervare rezervare1;
        Rezervare rezervare2;

        IBuilder rezervareBuilder1 = new RezervareBuild("Tache Ionescu");

        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder1.setGenMuzica("rock").buildRezervare();
        rezervare1=rezervareBuilder1.setAsezareGeam(true).buildRezervare();
        rezervare1=rezervareBuilder1.setDecorareMasa(true).buildRezervare();

        IBuilder rezervareBuilder2=new RezervareBuild("Popescu Ion");
        rezervare2=rezervareBuilder2.setGenMuzica("rap").buildRezervare();


        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}