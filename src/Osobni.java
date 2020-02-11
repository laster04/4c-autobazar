public class Osobni extends Auto {

    private boolean stahovaciStrecha;
    private int obsazenoSedadel;

    public Osobni(String nazev, int pocetKol, Rizeni rizeniStrana, String barva, Float obsahMotoru) {
        super(nazev, pocetKol, rizeniStrana, barva, obsahMotoru);
    }

    @Override
    protected int countVolnaSedadla() {
        return getPocetSedadel() - this.obsazenoSedadel;
    }

    public int getObsazenoSedadel() {
        return obsazenoSedadel;
    }

    public void setObsazenoSedadel(int obsazenoSedadel) {
        this.obsazenoSedadel = obsazenoSedadel;
    }

    public boolean isStahovaciStrecha() {
        return stahovaciStrecha;
    }

    public void setStahovaciStrecha(boolean stahovaciStrecha) {
        this.stahovaciStrecha = stahovaciStrecha;
    }
}
