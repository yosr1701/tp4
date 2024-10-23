
package tp_4;

public class Jcc {

    private Film competition[];
    private int anne;
    private static final int nbfmax = 30; 
    private int nbf = 0;
    

    public Jcc(int taille, int anne) {
        if (taille <= nbfmax) {
            competition = new Film[taille];  
            this.anne = anne;
            
        }
    }

    public void ajoutFilm(Film f) {
        if (nbf < competition.length) {
            competition[nbf] = f;
            nbf++;
        } else {
            System.out.println("la compétition est complet.");
        }
    }

    public void listeFilmsJCC() {
    	int nb=0;
        for (int i = 0; i < nbf; i++) {
            System.out.println(competition[i].toString());
            nb++;
        }
        System.out.println("nombre de films et doc :"+nb);
    }

    public float totalVenteBilletsJCC() {
        float totalVentes = 0;
        for (int i = 0; i < nbf; i++) {
            totalVentes += competition[i].totalVenteBillets();
        }
        return totalVentes;
    }
}
