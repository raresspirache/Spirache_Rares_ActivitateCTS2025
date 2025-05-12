package ro.cts.Strategy.module;

public class PlataSMS implements IMetodaPlata{

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata prin SMS validata!");
    }
}
