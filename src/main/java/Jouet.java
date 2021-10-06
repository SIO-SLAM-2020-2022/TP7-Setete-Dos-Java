public class Jouet {

    private int numero;
    private String libelle;
    private Categorie categ;
    private TrancheAge tranche;


    public Jouet(int numero, String libelle, Categorie categ, TrancheAge tranche) {
        this.numero = numero;
        this.libelle = libelle;
        this.categ = categ;
        this.tranche = tranche;
    }


    public boolean Convient(int unAge){
        if (unAge >= this.tranche.getAgeMin() && unAge <= this.tranche.getAgeMax()){
            return true;
        } else {
            return false;
        }
    }

    public String GetInfos(){
        return "\u001b[33m Libellé du jouet : " + this.libelle +
                "; \n Libellé de sa catégorie : " + this.categ.getLibelle() +
                "; \n Âge mini : " + this.tranche.getAgeMin() + " ; Âge Max : " + this.tranche.getAgeMax() + "\u001b[0m";
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Categorie getCateg() {
        return categ;
    }

    public void setCateg(Categorie categ) {
        this.categ = categ;
    }

    public TrancheAge getTranche() {
        return tranche;
    }

    public void setTranche(TrancheAge tranche) {
        this.tranche = tranche;
    }


    @Override
    public String toString() {
        return "Jouet{" +
                "numero=" + numero +
                ", libelle='" + libelle + '\'' +
                ", categ=" + categ +
                ", tranche=" + tranche +
                '}';
    }
}
