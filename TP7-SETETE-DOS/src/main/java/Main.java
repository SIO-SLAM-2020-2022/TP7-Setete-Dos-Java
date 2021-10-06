import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        TrancheAge tr1 = new TrancheAge(1234 ,3, 12);
        TrancheAge tr2 = new TrancheAge(5678, 13, 18);
        TrancheAge tr3 = new TrancheAge(91011, 18, 99);

        Categorie cat1 = new Categorie(1000, "Enfants");
        Categorie cat2 = new Categorie(2000, "Adolescents");
        Categorie cat3 = new Categorie(3000, "Adultes");

        Jouet jouet1 = new Jouet(1, "Playmobile Chateau", cat2, tr2);
        Jouet jouet2 = new Jouet(2, "Peluche Ours", cat1, tr1);
        Jouet jouet3 = new Jouet(3, "Poupée Porcelaine", cat2, tr2);
        Jouet jouet4 = new Jouet(4, "Armes à feu", cat3, tr3);

        cat1.ajouterJouet(jouet2);
        cat2.ajouterJouet(jouet1);
        cat2.ajouterJouet(jouet3);
        cat3.ajouterJouet(jouet4);

        Map<Jouet, Integer> listeJouets1 = new HashMap<>();
        listeJouets1.put(jouet1, 900);
        listeJouets1.put(jouet2, 5);
        listeJouets1.put(jouet3, 10);
        listeJouets1.put(jouet4, 1);

        Catalogue catalog1 = new Catalogue("2010", listeJouets1);
        //System.out.println(catalog1.StatsCateg());
        System.out.println(jouet2.GetInfos());
    }
}
