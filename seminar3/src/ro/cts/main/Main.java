package ro.cts.main;

import ro.cts.pachet.AgentieImobiliaraEager;
import ro.cts.pachet.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliaraEager agentieImobiliaraEager = AgentieImobiliaraEager.getAgentieImobiliara();

        System.out.println(agentieImobiliaraEager.toString());

        AgentieImobiliaraEager agentie2 = AgentieImobiliaraEager.getAgentieImobiliara();
        agentie2.setSite("Site nou.com");

        agentie2.posteazaAnunt("anunt agentie 2");
        agentieImobiliaraEager.posteazaAnunt("anunt agentie 1");

        System.out.println(agentieImobiliaraEager.toString());

        AgentieImobiliaraLazy agentie4 = AgentieImobiliaraLazy.getAgentieImobiliara("Storia",10,"storia.com",99000);
        AgentieImobiliaraLazy agentie5 = AgentieImobiliaraLazy.getAgentieImobiliara("Imobiliare",10,"imobiliare.com",2000000);

        System.out.println(agentie5.toString());


    }
}
