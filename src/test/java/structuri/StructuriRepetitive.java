package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive = for, while, for each

    @Test
    public void testMethod(){
      //afisamNnumere();
      //afisamNnumere2();
        //afisamNumerePare();
        calculNumere();
    }

    //Afisam primele 10 numere
    public void afisamNnumere(){
        for (int index=0;index<50;index++){
            System.out.println(index);
        }
    }

    public void afisamNnumere2(){
        int index=0;
        while (index<=50){
            System.out.println(index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void afisamNumerePare(){
        for(int index = 0; index <= 50; index += 2){
            System.out.println("numarul " + index + " este par");
        }
    }


    //Calculam cate numere pare si impare avem intr-un anumit interval
    public void calculNumere(){
        int numerePare = 0;
        int numereImpare = 0;

        for (int index = 0; index <= 50; index++) {
            if (index % 2 == 0) {
                numerePare++;
            } else {
                numereImpare++;
            }
        }

        // Afișăm rezultatul final după ce bucla s-a încheiat
        System.out.println("Numere pare = " + numerePare);
        System.out.println("Numere impare = " + numereImpare);
    }
}

