package homeworks;

import org.testng.annotations.Test;

public class Tema1 {

    @Test
    public void metodaTest(){
        afisaretema();
    }

    public void afisaretema(){
        System.out.println("Hello world");
        System.out.println("Numele meu este Niga");
        System.out.println("Prenumele meu este Oana");
        System.out.println("Salut" + "M");
        System.out.println("H" + "Hello");
        System.out.println("AnaZ areZ mereZ pereZ pruneZ");
        System.out.println("Poti pleca acasa dupa ce iti verific munca!");

        String angajat = "Ion";
        if (angajat == "Andrei"){
            System.out.println("Salariul lui Andrei este 5000");
        }
        if (angajat == "Ion"){
            System.out.println("Ion are id 100 si departamentul marketing");
        }

        int departament = 289;
        if (departament > 287){
            System.out.println("Numarul departamentului este: " + departament);
        }

        double medie = (double) (2 + 3 * 4 - 3) / 3;
        System.out.println("Rezultatul corect este: " + medie);
    }
}
