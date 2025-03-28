package ro.cts.main;

import ro.cts.models.IBuilder;
import ro.cts.models.Rezervare;
import ro.cts.models.RezervareBuild;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuild("Ionescu Nicolae");
        Rezervare rezervare;
        Rezervare rezervare1;

        IBuilder rezervareBuilder1 = new RezervareBuild("Tache Ionescu");

        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder1.setGenMuzica("rock").buildRezervare();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

    }
}