package tp_4;
public class main {
    public static void main(String[] args) {
        Jcc jcc2021 = new Jcc(3, 2021);  

        Documentaire doc1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");        
        doc1.setNbP(30);

        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setNbP(45);
        
        Film film3 = new Film("dfs", "jfd", "Tunisie", 105);
        film2.setNbP(43);

        jcc2021.ajoutFilm(doc1);
        jcc2021.ajoutFilm(film2);
        jcc2021.ajoutFilm(film3);
        
        System.out.println("films en jcc 2021 :");
        jcc2021.listeFilmsJCC();

        float totalVentes = jcc2021.totalVenteBilletsJCC();
        System.out.println("montant total des ventes de billets : " + totalVentes + " DT.");
    }

}
