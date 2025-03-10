package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //intru-un fisier java recunoastem o clasa dupa cuvantul "class"
    //orice clasa trebuie sa aibe un nume
    //intr-un fisier java putem avea mai multe clase diferentiate prin nume
    //nu este un best practice sa ai mai multe clase intr-un fisier
    //tot codul care apartine unei clase se regaseste intre acolade
    //clasa=sablon care contine variabile si metode despre un anumit exemplu
    //intr-o clasa putem sa avem n clase si n metode
    //proprietate=variabila in java
    //variabila= proprietatea unei clase
    //exista 2 tipuri de variabile: globala si locala
    //variabila globala=proprietate care este vizibila peste tot in programul nostru
    //structura unei variabile globala: piublic = tip variabila nume variabila;
    //variabila locala=proprietate care este vizibila doar in locul in care ai declarat-o
    //structura variabile locala: tip variabila nume variabile;
    //nu este obligatoriu ca o variabila sa aiba o valoare
    //in java exista conceptul de primitiva si non primitive
    //primitiva se bazeaza initializarea unei valori in functie de tipu de data definit
    //non primitiva se bazeaza pe instantierea unei variabila prin referinta
    //metoda=actiunea unei clase
    //exista 2 tipuri de metode: void si return
    //structura metoda void:public void nume metoda () {}
    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent() {
        nume = "Niga";
        prenume = "Oana";
        varsta = 22;
        adresa = "Carpinis nr.2";
        inaltime = 1.60;
        greutate = 54.1f;
        sex = 'F';
        areBursa = true;

        System.out.println("Numele si prenumele studentului sunt:" + nume + ' ' + prenume);
        System.out.println("Varsta studentului este:" + varsta);
        System.out.println("Adresa studentului este:" + adresa);
        System.out.println("Inaltimea studentului este:" + inaltime);
        System.out.println("Greutatea studentului este:" + greutate);
        System.out.println("Sexul studentului este" + sex);
        System.out.println("Are bursa studentul?" + areBursa);

        calculMedieStudent(9,10);
        calculMedieStudent(6,7);
        calculMedieStudent(10,10);

        calculMedieStudent3(10,9,7);
    }

    //o noua metoda care calculeaza media unui student
    //o metoda poate sau nu sa contina parametrii
    public void calculMedieStudent(double Nota1, double Nota2) {
        double Medie = (Nota1 + Nota2) / 2;
        System.out.println("Media studentului este" + Medie);

    }
    public void calculMedieStudent3(double Nota1, double Nota2, double Nota3) {
        double Medie = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("Media studentului este" + Medie);

    }
}
