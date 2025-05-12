package ro.cts.Strategy.main;


import ro.cts.Strategy.module.CardCalatorie;
import ro.cts.Strategy.module.IMetodaPlata;
import ro.cts.Strategy.module.PlataSMS;
import ro.cts.Strategy.module.Calator;

public class Main {

    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new CardCalatorie(2);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Cata");
        Calator calator2 = new Calator("Dan");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);

        calator2.platesteCalatorie(5);
        calator2.setMetodaPlata(cardCalatorie);
        calator2.platesteCalatorie(5);
        calator2.platesteCalatorie(5);
        calator2.platesteCalatorie(5);
        calator2.setMetodaPlata(plataSMS);
        calator2.platesteCalatorie(5);
    }
}
