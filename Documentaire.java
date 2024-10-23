package tp_4;

public class Documentaire extends Film {
    private String sujet;
    private static final float tarif = 2;
    
    public Documentaire(String titre, String realisateur, String pays, int duree, String sujet) {
        super(titre, realisateur, pays, duree);
        this.sujet = sujet;
        this.id++;
    }
    
    public String toString() {
        return super.toString() + " Sujet : " + sujet;
    }
    
    public float totalVenteBillets() {
        return super.getNbP() * tarif;
    }
}
