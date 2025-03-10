package oop;

import java.util.List;

public class Ford extends Masina {
    private List<String> dotariInterioare;
    private List<String> dotariExterioare;


    public Ford(String marca, String model, int anFabricatie,
                String combustibil, int pret, List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void rezumatFord() {
        rezumatComanda();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
    }

    public void pornesteMotor(){
        System.out.println("Masinile Ford pornesc singure");
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
