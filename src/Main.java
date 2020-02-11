import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        Osobni lamborginy = new Osobni("Galardo", 4, Rizeni.LEVE, "modra", 1.6f);
        lamborginy.setStahovaciStrecha(true);


        autos.add(lamborginy);
        Nakladani tatra = new Nakladani("TATRA Fenix", 6, Rizeni.LEVE, "cervena", 6.5f);
            autos.add(tatra);

    }
}
