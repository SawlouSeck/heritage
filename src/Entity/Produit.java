package Entity;

public class Produit {
    private  String ref, libelle;
    private   double quantite;
    private  int prix;

    public Produit() {
    }

    public Produit(String ref, String libelle, double quantite, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getRef() {
        return ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
