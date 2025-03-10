package homeworks;

import org.testng.annotations.Test;

public class Tema2 {

    @Test
    public void methodTest() {
        //afisareDA();
        //afisareNumere();
        //afisareNrMaiMare(15, 20);
        //afisareNrMaiMic(4.5,3.25);
        //calculNumere();
        //afisareNumerePare();
        //afisareNumereDivizibileCu5();
        //afisarePrimele3Nr();
        //afisareSuma();
        afisareSumaNumerelorPanaLa10();

    }

    // Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre

    public void afisareDA() {
        for (int i = 0; i < 5; i++) {
            System.out.print("DA ");
        }
    }
    // Afisam in consola primele 3 numere de la 1 la 3

    public void afisareNumere() {
        for (int index = 1; index < 4; index++) {
            System.out.println(index);
        }
    }
    //Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda

    public void afisareNrMaiMare(int nr1, int nr2) {
        if (nr1 < nr2) {
            System.out.println("Numarul mai mare este: " + nr2);
        } else {
            System.out.println("Numarul mai mare este: " + nr1);
        }
    }

    // Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda

    public void afisareNrMaiMic(double nr1, double nr2) {
        if (nr1 < nr2) {
            System.out.println("Numarul mai mic este " + nr1);
        } else {
            System.out.println("Numarul mai mic este " + nr2);
        }
    }

    // Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for")
    public void calculNumere() {
        System.out.print("Numere pare: ");
        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
        System.out.println();

        System.out.print("Numere impare: ");
        for (int index = 0; index <= 10; index++) {
            if (index % 2 != 0) {
                System.out.print(index + " ");
            }
        }

    }

    // Afisam in consola doar numerele pare pana la 10 (utilizam "for")
    public void afisareNumerePare() {
        System.out.print("Numere pare: ");
        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
    }

    //Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda

    public void afisareNumereDivizibileCu5() {
        int limitaInferioara = 1;
        int limitaSuperioara = 50;

        System.out.print("Numere divizibile cu 5 intre " + limitaInferioara + " si " + limitaSuperioara + ": ");
        for (int i = limitaInferioara; i <= limitaSuperioara; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda

    public void afisarePrimele3Nr() {
        int limitaInferioara = 1;
        int limitaSuperioara = 15;

        System.out.print("Primele 3 numere divizibile cu 5 sunt: ");
        for (int i = limitaInferioara; i <= limitaSuperioara; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");


            }
        }
    }
    //Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE

    public void afisareSuma() {
        int nr1 = 235;
        int nr2 = 10;
        int suma = nr1 + nr2;

        System.out.println("Suma numerelor " + nr1 + " și " + nr2 + " este: " + suma);
    }

    // Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE
    public void afisareSumaNumerelorPanaLa10() {
        int suma = 0;
        int limitaSuperioara = 10;

        for (int i = 1; i <= limitaSuperioara; i++) {
            suma += i;
        }

        System.out.println("Suma numerelor de la 1 pana la " + limitaSuperioara + " este: " + suma);
    }

    // Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE
    public void afisareProdusNumerelorPanaLa5() {
        int produs = 1;
        int limitaSuperioara = 5;

        for (int i = 1; i <= limitaSuperioara; i++) {
            produs *= i;
        }

        System.out.println("Produsul numerelor de la 1 pana la " + limitaSuperioara + " este: " + produs);
    }
}



















