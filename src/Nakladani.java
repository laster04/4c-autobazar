public class Nakladani extends Auto {

    private String typNakladu;

    public Nakladani(String nazev, int pocetKol, Rizeni rizeniStrana, String barva, Float obsahMotoru, int pocetSedadel) {
        super(nazev, pocetKol, rizeniStrana, barva, obsahMotoru);
        this.setPocetSedadel(pocetSedadel);
    }

    @Override
    protected int countVolnaSedadla() {
        return this.getPocetSedadel() - 1;
    }

    public String getTypNakladu() {
        return typNakladu;
    }

    public void setTypNakladu(String typNakladu) {
        this.typNakladu = typNakladu;
    }
}
