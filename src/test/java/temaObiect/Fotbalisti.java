package temaObiect;

import java.util.List;

public class Fotbalisti extends Sportivi {

    public String pozitie;
    public int numarTricou;
    public List<String> trofee;

    public Fotbalisti(String nume, String prenume, int varsta, String pozitie, int numarTricou, List<String> trofee) {
        super(nume, prenume, varsta);
        this.numarTricou = numarTricou;
        this.pozitie = pozitie;
        this.trofee = trofee;
    }

    public void afisareInformatiiFotbalist() {
        afisareDateSportiv();
        System.out.println("Pozitie: " + pozitie);
        System.out.println("Numar tricou: " + numarTricou);
        System.out.println("Trofee: " + trofee);
    }
}
