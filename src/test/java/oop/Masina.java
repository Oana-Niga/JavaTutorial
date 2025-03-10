package oop;

public class Masina {
     //oop = programare orientata obiect;
    // exista 4 principii = mostenire, incapsularea datelor, polimorfismul si abstractizarea;
    // mostenirea = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte);
    // in Java putem mosteni o singura clasa;
    // ca sa mostenim o clasa folosim cuvantul "extends";
    // in momentul in care clasa copil mosteneste clasa parinte, copilul trebuie sa apeleze constructorul din parinte;
    // copilul apeleaza constructorul din parinte folosind cuvantul "super";
    // in momentul in care clasa copil mosteneste clasa parinte, copilul are acces la variabile/metode din parinte;

    // incapsulare = conceptul prin care putem defini restrictii la nivel de vizibilitate pentru proprietati/metode;
    // pentru a seta restrictii avem nevoie de access control de tip private/protected;
    // private = access control care restrictioneaza vizibilitatea doar la nivel de clasa;

    // Polimerfismul = conceptul prin care o metoda poate avea implementari diferite la nivel de body sau structura;
    // Polimerfismul este de 2 feluri: dinamic (override) si static (overload);
    // Polimerfismul dinamic: Intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    // Polimerfismul static: Posibilitatea prin care putem avea mai multe metode cu acelasi nume diferentiate prin numar/tip de parametrii;



    private String marca;
    private String model;
    private int anFabricatie;
    private String combustibil;
    private int pret;

    public Masina(String marca, String model, int anFabricatie, String combustibil, int pret) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.pret = pret;
    }

    public void rezumatComanda(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie al masinii este: " +anFabricatie);
        System.out.println("Combustibilul masinii este: " + combustibil);
        System.out.println("Pretul masinii este: " +pret);
    }

    //Polimorfism dinamic

    public void pornesteMotor(){
        System.out.println("Masina porneste motorul din cheie");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getPret() {
        return pret;
    }
}
