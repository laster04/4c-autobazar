public class Nakladani extends Auto {

    private String typNakladu;

    public Nakladani(String nazev, int pocetKol, Rizeni rizeniStrana, String barva, Float obsahMotoru) {
        super(nazev, pocetKol, rizeniStrana, barva, obsahMotoru);
    }

    @Override
    public void nastaveniStartovani() {

    }

    public String getTypNakladu() {
        return typNakladu;
    }

    public void setTypNakladu(String typNakladu) {
        this.typNakladu = typNakladu;
    }
}
