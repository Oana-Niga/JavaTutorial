package oop;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OopTest {

    @Test
    public void testMethod(){
        Volvo comanda1= new Volvo("Volvo", "XC60", 2018,
                "Diesel",19000, Arrays.asList("Incalzire scaune", "Climatrizare", "Piele"));
        comanda1.rezumatVolvo();
        comanda1.pornesteMotor();
        System.out.println();


        Volvo comanda2 = new Volvo("Volvo", "XC90", 2014,
                "Benzina", 15000,Arrays.asList("Piele", "Climatrizare"));
        comanda2.rezumatComanda();

        System.out.println();

        Dacia comanda3 = new Dacia("Dacia", "Logan", 2009,
                "Diesel", 8000,Arrays.asList("Camera","Senzori", "Incalzire oglinzi"));
        comanda3.rezumatDacia();
        comanda3.pornesteMotor();
        comanda3.aplicareDiscount();
        comanda3.aplicareDiscount(10);
        comanda3.aplicareDiscount("Cupon pensie");
        System.out.println();

        Ford comanda4 = new Ford("Ford", "Puma", 2020,
                "Benzina",2100,Arrays.asList("Camera","Senzori", "Incalzire oglinzi"),
                Arrays.asList("Incalzire scaune", "Climatrizare", "Piele"));
        comanda4.rezumatFord();
        comanda4.pornesteMotor();
    }
}
