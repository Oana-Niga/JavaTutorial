package obiectConstructor;

public class Masina {
    // constructor = are ca rol sa initializeze variabilele unei clase;
    // exista 2 tipuri de constructor : default (nu are parametrii / nu este definit) sau cu parametrii;
    // structura constructor: public( de cele mai multe ori) nume clasa, cu sau fara parametrii;
    // intr-o clasa putem avea mai multi constructori diferentiati prin numarul sau tipul de parametrii;
    // obiect = instanta unei clase;
    // dintr-o clasa putem sa definim mai multe obiecte pe care sa le diferentiem dupa nume;
    // in momentul in care instantiem un obiect se apeleaza constructorul clasei respective;
    // un obiect se instantiaza folosind cuvantul "new";
    // un obiect instantiat are posibilitatea sa acceseze proprietatile/metodele din clasa respectiva;

    public String marca;
    public String model;
    public String motorizare;
    public int numarLocuri;
    public int anulFabricatiei;
    public double pret;

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
    }

    public Masina(String marca, String motorizare, String model, int numarLocuri, int anulFabricatiei, double pret) {
        this.marca = marca;
        this.motorizare = motorizare;
        this.model = model;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
    }

    public void rezumat(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Motorizarea masinii este: " +motorizare);
        System.out.println("Numarul de locuri pe care le are masina: " + numarLocuri);
        System.out.println("Anul de fabricatie a masinii: " +anulFabricatiei);
        if(pret!=0){
            System.out.println("Pretul masinii este: " + pret);
        }

        }
    }

