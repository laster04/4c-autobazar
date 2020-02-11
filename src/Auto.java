abstract public class Auto {

    private String nazev;
    private int pocetKol;
    private Rizeni rizeniStrana;
    private String barva;
    private Float obsahMotoru;
    private Startovani startovani;

    public Auto(String nazev, int pocetKol, Rizeni rizeniStrana, String barva, Float obsahMotoru) {
        this.nazev = nazev;
        this.pocetKol = pocetKol;
        this.rizeniStrana = rizeniStrana;
        this.barva = barva;
        this.obsahMotoru = obsahMotoru;
    }

    abstract public void nastaveniStartovani();

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocetKol() {
        return pocetKol;
    }

    public void setPocetKol(int pocetKol) {
        this.pocetKol = pocetKol;
    }

    public Rizeni getRizeniStrana() {
        return rizeniStrana;
    }

    public void setRizeniStrana(Rizeni rizeniStrana) {
        this.rizeniStrana = rizeniStrana;
    }

    public Startovani getStartovani() {
        return startovani;
    }

    public void setStartovani(Startovani startovani) {
        this.startovani = startovani;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public Float getObsahMotoru() {
        return obsahMotoru;
    }

    public void setObsahMotoru(Float obsahMotoru) {
        this.obsahMotoru = obsahMotoru;
    }
}
