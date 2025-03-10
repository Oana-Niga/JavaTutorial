package multimi;

import org.testng.annotations.Test;

import java.util.*;


public class Multimi {

    //Multimi array, list, map

    @Test
    public void testMethod() {
        //afisareColegi();
        //afisareColegi2();
        //afisareProduse();
        //afisareFructe();
        //afisareProduse2();
        //afisareProduse3();
        carteDeRetete();

    }

    //Afisam numele colegilor de la curs
    public void afisareColegi() {
        String[] colegi = new String[5];
        colegi[0] = "Oana";
        colegi[1] = "Razvan";
        colegi[2] = "Ana";
        colegi[3] = "Levi";
        colegi[4] = "Natalia";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului meu este: " + colegi[index]);
        }
    }

    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Oana");
        colegi.add("Razvan");
        colegi.add("Ana");
        colegi.add("Levi");
        colegi.add("Natalia");

        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("Numele colegului meu este: " + colegi.get(index));
        }

    }


    //Afisare produse

    public void afisareProduse() {
        String[] produse = new String[8];
        produse[0] = "lapte";
        produse[1] = "paine";
        produse[2] = "unt";
        produse[3] = "branza";
        produse[4] = "cascaval";
        produse[5] = "suc";
        produse[6] = "sunca";
        produse[7] = "iaurt";

        for (int index = 0; index < produse.length; index++) {
            System.out.println("Numele produsului este: " + produse[index]);
        }
    }

    //Afisare fructe
    public void afisareFructe() {
        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("para");
        fructe.add("banana");
        fructe.add("ananas");
        fructe.add("portocala");
        fructe.add("mango");

        for (int index = 0; index < fructe.size(); index++) {
            System.out.println("Numele fructului  este: " + fructe.get(index));

        }
    }


    // Map = key - value
    public void afisareProduse2()
    {
        Map<String, String> raion = new HashMap<>();
        raion.put("Raftul 1", "Paine");
        raion.put("Raftul 2", "Cereale");
        raion.put("Raftul 3", "Ciocolata");

        for (String key: raion.keySet())
        {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsul de pe raftul curent este: " + raion.get(key));
        }
    }

    public void  afisareProduse3()
    {
        Map<String, List<String>> raion = new LinkedHashMap<>();

        List<String> produseRaft1 = new ArrayList<>();
        produseRaft1.add("Lapte");
        produseRaft1.add("Mere");
        produseRaft1.add("Banane");

        List<String> produseRaft2 = new ArrayList<>();
        produseRaft2.add("Struguri");
        produseRaft2.add("Amandine");
        produseRaft2.add("Eclere");

        List<String> produseRaft3 = new ArrayList<>();
        produseRaft3.add("Apa");
        produseRaft3.add("Branza");

        raion.put("Raft 1", produseRaft1);
        raion.put("Raft 2", produseRaft2);
        raion.put("Raft 3", produseRaft3);

        for (String key: raion.keySet())
        {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsele de pe raftul curent sunt: " + raion.get(key));
        }
    }

    public void carteDeRetete()
    {
        Map<String, List<String>> retete = new LinkedHashMap<>();

        List<String> ingredienteciorba = new ArrayList<>();
        ingredienteciorba.add("2 L Apa");
        ingredienteciorba.add("10 Cartofi");
        ingredienteciorba.add("0 Ceapa");
        ingredienteciorba.add("2 Ardei");
        ingredienteciorba.add("5 Morcovi");

        List<String> ingredientesarmale = new ArrayList<>();
        ingredientesarmale.add(" 0 varza");
        ingredientesarmale.add("100 g orez");
        ingredientesarmale.add("0 ceapa");
        ingredientesarmale.add("0 felie de paine");


        List<String> ingredienteclatite = new ArrayList<>();

        ingredienteclatite.add("1 Kg Faina");
        ingredienteclatite.add("1 L de Lapte");

        retete.put("Ciorba", ingredienteciorba);
        retete.put("Sarmale", ingredientesarmale);
        retete.put("Clatite", ingredienteclatite);

        for (String key: retete.keySet())
        {
            System.out.println("Pentru a face " + key + " avem nevoie de: ");
            System.out.println(" " + retete.get(key));
        }
    }
}







