package Decorator.src.ro.cts.main;

import Decorator.src.ro.cts.modules.Nota;
import Decorator.src.ro.cts.modules.NotaDePlata;
import Decorator.src.ro.cts.modules.NotaDePlataCraciun;
import Decorator.src.ro.cts.modules.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();

        Nota notaDecorataCraciun = new NotaDePlataCraciun(notaDePlata);
        Nota nota2 = new NotaDePlataCraciun(notaDecorata);
        nota2.printare();
        notaDecorataCraciun.printare();
    }
}
