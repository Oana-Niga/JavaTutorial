package temaObiect;

public class Sportivi {

    public String nume;
    public String prenume;
    public int varsta;

    public Sportivi(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void afisareDateSportiv(){
        System.out.println("Numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Varsta sportivului este " + varsta);
    }
}
