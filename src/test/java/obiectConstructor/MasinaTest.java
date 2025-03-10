package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethod(){
        Masina comanda1 = new Masina("Volvo","XC60", "diesel", 5,2022);
        comanda1.rezumat();

        System.out.println();

        Masina comanda2 = new Masina("Audi", "A3","benzina",5,2017);
        comanda2.rezumat();

        System.out.println();

        Masina comanda3 = new Masina("Mercedes", "C200", "benzina", 5,2018, 18.300);
        comanda3.rezumat();
    }
}
