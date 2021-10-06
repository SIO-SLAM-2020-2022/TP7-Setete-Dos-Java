import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    private String annee;
    private Map<Jouet, Integer> lesJouets = new HashMap<>();

    public Catalogue(String annee, Map<Jouet, Integer> lesJouets) {
        this.annee = annee;
        this.lesJouets = lesJouets;
    }

    public int QuantiteDistribue(){
        int quantiteTotale = 0;

        for (Jouet j : this.lesJouets.keySet()){
            quantiteTotale += this.lesJouets.get(j);
        }
        return quantiteTotale;
    }


    public Map<Categorie, Integer> StatsCateg(){

        Map<Categorie, Integer> lesCategs = new HashMap<>();

        for (Jouet j : this.lesJouets.keySet()){
            Categorie categ = j.getCateg();

            if (lesCategs.containsKey(categ)){
                lesCategs.put(categ, lesCategs.get(categ) + this.lesJouets.get(j));
            } else {
                lesCategs.put(categ, this.lesJouets.get(j));
            }
        }
        return lesCategs;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }


    @Override
    public String toString() {
        return "Catalogue{" +
                "annee='" + annee + '\'' +
                ", lesJouets=" + lesJouets +
                '}';
    }
}
