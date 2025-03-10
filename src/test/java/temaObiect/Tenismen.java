package temaObiect;

public class Tenismen extends Sportivi {
    public int ranking;
    public int numarTurneeCastigate;

    public Tenismen(String nume, String prenume, int varsta, int ranking, int numarTurneeCastigate) {
        super(nume, prenume, varsta);
        this.ranking = ranking;
        this.numarTurneeCastigate = numarTurneeCastigate;
    }

    public void afisareInformatiiTenismen() {
        afisareDateSportiv();
        System.out.println("Ranking: " + ranking);
        System.out.println("Numar turnee castigate: " + numarTurneeCastigate);
    }
}

