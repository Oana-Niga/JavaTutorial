package temaObiect;

import org.testng.annotations.Test;
import java.util.Arrays;

public class TestSportivi {

    @Test
    public void testMethod(){
        Fotbalisti fotbalist = new Fotbalisti("Popescu", "Ion", 28, "Atacant", 10,
                Arrays.asList("Trofeu Campionat", "Trofeu Supercup"));
        fotbalist.afisareInformatiiFotbalist();

        System.out.println();

        Tenismen tenismen = new Tenismen("Ionescu", "Andrei", 25, 5, 3);
        tenismen.afisareInformatiiTenismen();
    }
}
