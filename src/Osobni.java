public class Osobni extends Auto {

    private boolean stahovaciStrecha;

    public Osobni(String nazev, int pocetKol, Rizeni rizeniStrana, String barva, Float obsahMotoru) {
        super(nazev, pocetKol, rizeniStrana, barva, obsahMotoru);
    }

    @Override
    public void nastaveniStartovani() {

    }

    public boolean isStahovaciStrecha() {
        return stahovaciStrecha;
    }

    public void setStahovaciStrecha(boolean stahovaciStrecha) {
        this.stahovaciStrecha = stahovaciStrecha;
    }
}
