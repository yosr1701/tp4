package tp_4;
import java.util.Scanner;
public class Film {
	protected int id=0;
	protected String titre;
	protected String real;
	protected String pays;
	protected int duree;
	protected int nbP;
	
	public Film(String titre,String r,String pays,int d)
	{
		this.titre=titre;
		real=r;
		this.pays=pays;
		this.duree=d;
		id++;
		
	}
	
	public void setNbP(int x)
	{
		nbP=x;
	}
	public int getNbP()
	{
		return nbP;
	}
	public String toString()
	{
		return "id :"+id+" ,"+titre+"de"+real+"("+pays+") - "+duree+"min";
	}
	public float totalVenteBillets() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrez le nombre de places réservées pour les étudiants: ");
        int places= scanner.nextInt();
        scanner.close();
        if (places> nbP) 
        {
        	return 0;
        }
        else
        {
        	
        }

        int placesPublic = nbP - places;
        float montantTotal = (places * 2) + (placesPublic * 3); 
        
        return montantTotal;
    }
}
