import java.util.ArrayList;

public class Livre {

    private String ISBN;
    private String Titre;
    private ArrayList<String> Auteurs;  //variable local car le livre peut contenir plusieurs auteur
    private ArrayList<String> Genres;
    private Boolean Etat;

    public Livre(String ISBN, String titre, ArrayList<String> auteurs, ArrayList<String> genres) {
        this.ISBN = ISBN;
        Titre = titre;
        Auteurs = auteurs;
        Genres = genres;
    }//get pour avoir les v  aleur des info  des livres

    public String getISBN()
    {
        return ISBN;
    }

    public String getTitre() {
        return Titre;
    }

    public ArrayList<String> getAuteurs() {
        return Auteurs;
    }

    public ArrayList<String> getGenres() {
        return Genres;
    }

    public String toString() {
        return "Livre{\n" +
                "ISBN='" + ISBN + "\'\n" +
                ", Titre='" + Titre + "\'\n" +
                ", Auteurs=" + Auteurs +
                ", Genres=" + Genres +
                '}';
    }



    //affiacher letat livre emprinter ou pas

    public Boolean getEtat() {
        return this.Etat ;
    }

    public void setEtat(Boolean etat) {
        Etat = etat;
    }
}