package Proxy.src.ro.cts.main;

import Proxy.src.ro.cts.modules.IRezervare;
import Proxy.src.ro.cts.modules.ProxyNrPersoane;
import Proxy.src.ro.cts.modules.ProxyOra;
import Proxy.src.ro.cts.modules.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);

        IRezervare proxy = new ProxyNrPersoane(rezervare);
        proxy.rezerva("Gigel", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Popescu", 5, 19);
    }
}
