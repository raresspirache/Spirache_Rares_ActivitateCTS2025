package ro.cts.main;

import ro.cts.module.AdaptorMedicament;
import ro.cts.module.MedicamentFarmacie;
import ro.cts.module.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Medi", 50, true, "11.02.2029");
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Medi2", 45);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicamente(adaptorMedicament);

        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen", 20, true, "12.12.2029");
        vindeMedicamente(medicamentFarmacie2);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("Ibuprofen", 30);
        AdaptorMedicament adaptorMedicament2 = new AdaptorMedicament(medicamentSpital2);
        vindeMedicamente(adaptorMedicament2);
    }
}