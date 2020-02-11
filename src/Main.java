import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        Osobni lamborginy = new Osobni("Galardo", 4, Rizeni.LEVE, "modra", 1.6f);
        lamborginy.setStahovaciStrecha(true);
        lamborginy.setObsazenoSedadel(1);
        lamborginy.setPocetSedadel(2);
        autos.add(lamborginy);
        Nakladani tatra = new Nakladani("TATRA Fenix", 6, Rizeni.LEVE, "cervena", 6.5f, 3);
        autos.add(tatra);
        Osobni fabie = new Osobni("Fabia", 4, Rizeni.PRAVE, "zelena", 1.3f);
        fabie.setObsazenoSedadel(3);
        fabie.setPocetSedadel(5);
        autos.add(fabie);
        Osobni focus = new Osobni("Focus", 4, Rizeni.PRAVE, "oranzova", 2.2f);
        focus.setObsazenoSedadel(3);
        focus.setPocetSedadel(4);
        focus.setStahovaciStrecha(true);
        autos.add(focus);
        Nakladani liaz = new Nakladani("Liaz", 6, Rizeni.LEVE, "bila", 4.3f, 2);
        liaz.setTypNakladu("uhli");
        autos.add(liaz);


        for (Auto auto : autos) {
            auto.systemOutPrint();
            System.out.println(auto.getPocetSedadel());
        }
    }
}
