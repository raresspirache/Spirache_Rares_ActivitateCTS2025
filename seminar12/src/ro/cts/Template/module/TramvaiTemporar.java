package ro.cts.Template.module;

public class TramvaiTemporar extends TramvaiAbs{
    private int nrLinie;

    public TramvaiTemporar(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Marriott");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Parcul Sebastian ");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul " + nrLinie + " nu opreste in statia Pasaj Grant se lucreaza, pentru ca se lucreaza");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + nrLinie + " nu opreste in statia Manastirea Casin, pentru ca se lucreaza");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Piata Presei");
    }
}