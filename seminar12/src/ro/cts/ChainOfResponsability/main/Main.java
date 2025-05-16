package ro.cts.ChainOfResponsability.main;

import org.xml.sax.helpers.AttributesImpl;
import ro.cts.ChainOfResponsability.module.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz = new InfoTroleibuz();
        AInfoTransport autobuz = new InfoAutobuz();
        AInfoTransport tramvai = new InfoTramvai();
        AInfoTransport metrou = new InfoMetrou();

        troleibuz.setNext(autobuz);
        troleibuz.setNext(tramvai);
        troleibuz.setNext(metrou);

        troleibuz.recomandaTransport(2);
        troleibuz.recomandaTransport(12);
        troleibuz.recomandaTransport(7);
        troleibuz.recomandaTransport(4);

    }
}
