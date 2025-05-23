package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative = IF (conditie) ... ELSE, SWITCH (value) ... CASE

    @Test
    public void metodaTest(){
//     afisamNRMaiMare(5,4);
//     afisamNRMaiMare(3,8);
//     verificareNrPar(-2);
//     verificareNrPar(3);
//     verificareNrPar(0);
//     verificareNrPar(-3);
//     verificareNrPar(4);
        zileSaptamana(10);



    }

    //verificam care numar este mai mare dintre 2 valori

    public void afisamNRMaiMare(int nr1, int nr2){
     if (nr1>nr2){
         System.out.println("nr1: "+nr1+" este mai mare decat nr2: "+nr2);
     }
     else {
         System.out.println("nr2:"+nr2+" nu este mai mare decat nr1: "+nr1);
     }
    }

    //verificam daca un numar este par si pozitiv
    public void verificareNrPar(int nr){
        if (nr>0) {
            if(nr%2==0){
                System.out.println(nr+": este par si pozitiv ");
            }
            else{
                System.out.println(nr+": este impar si pozitiv");
            }
        }
        else if (nr<0){
            if(nr%2==0){
                System.out.println(nr+": este par si negativ ");
            }
            else{
                System.out.println(nr+": este impar si negativ ");
            }
        } else{
            System.out.println(" nr este egal cu 0 ");
        }
    }

    //afisam una dintre zilele saptamanii
    public void zileSaptamana (int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");

        }
    }
}
