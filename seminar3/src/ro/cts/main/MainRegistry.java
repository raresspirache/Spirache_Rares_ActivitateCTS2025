package ro.cts.main;

import ro.cts.anunturi.AgentieImobiliara;
import ro.cts.anunturi.Anunt;

public class MainRegistry {
    public static void main(String[] args) {
        AgentieImobiliara agentie = new AgentieImobiliara("Imobiliare.ro",134040);
        Anunt anunt = agentie.getAnunt("Piata Victoriei nr. 23","Popescu",1);
        Anunt anunt2 = agentie.getAnunt("Piata Universitatii nr. 10","Ionescu",2);
        Anunt anunt3 = agentie.getAnunt("Piata Romana nr. 2","Popa",3);

        System.out.println(anunt3);
    }
}
