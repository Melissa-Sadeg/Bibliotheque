//localune fois que je sorte de l methode les variables ne sont pas reconnu
// global comme Mth.pi     pi=3,14
import java.util.Scanner;

import java.util.ArrayList;

public class Biblio {
    public static int maxl = 10;// variable globale
    // une biblio peut avoir plusier livres
    private ArrayList<Livre> livres;

    // constructeur pour tableau
    public Biblio() {

        this.livres = new ArrayList<Livre>();//
    }

    // fonction ajouter livre
    public void addLivre(Livre livre) {
        // ajou element dans tab

        this.livres.add(livre);
    }

    //afficher les livre dipo avec boucle for each
    public void afficheLiv() {
        for (Livre x : livres)
            System.out.println(x);
    }


    // Rechercche par titre
    public ArrayList<Livre> motCleTitre(String Titre) {//comparer Auteur biblio a  motcle
        ArrayList<Livre> trouver;

        trouver = new ArrayList<>();// initialiser un tab vide avec new     y:element tab

        for (Livre y : livres)// for each pour parcourir le tableau
            if (y.getTitre() == Titre) {// cest un appel de fonction  son ecriture cest sa creation
                trouver.add(y);// ajouter y au tableau trouver
                System.out.println(y);
            }
        if (trouver.size() == 0)// size:longeur tab
            System.out.println("le resultat est vide ");
        return trouver;

    }

    public ArrayList<Livre> motCleISBN(String ISBN) {
        ArrayList<Livre> trouver;

        trouver = new ArrayList<>();//initialiser un tab vide

        for (Livre x : livres)// parcourir le tab
            if (x.getISBN() == ISBN) {// comparaison
                trouver.add(x);
                System.out.println(x);
            }
        if (trouver.size() == 0)
            System.out.println("on'as rien trouver ");
        return null;

    }

    public ArrayList<Livre> motCleAuteur(String Auteur) {
// z=chaque auteur dans tableaux auteur
        // x=chaque livre du tablaeau livre

        ArrayList<Livre> trouver;
        trouver = new ArrayList<>();
        for (Livre x : livres)
            for (String z : x.getAuteurs())
                if (z == Auteur) {
                    trouver.add(x);
                    System.out.println(x);
                }
        if (trouver.size() == 0)
            System.out.println("on'as rien trouver ");
        return null;
    }


    //main remplir le tableux et tester la fonction de recherche
   /* public static void main(String args[]) {
        Biblio biblio = new Biblio();
        //Biblio.maxlappel variable en utilisant sa classe
        System.out.println(Biblio.maxl);
        ArrayList<String> auteurs = new ArrayList<>();
        auteurs.add("J.R.R. Tolkien");
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Roman");
        genres.add("Fantasy");
        Livre livre1 = new Livre
                ("9782266286268",
                "Le Seigneur des anneaux",
                auteurs,
                        genres);
        biblio.addLivre(livre1);
        auteurs =new ArrayList<>();
        auteurs.add("Albert Camus");
         genres = new ArrayList<>();
        genres.add("Roman");
        Livre Livre2 = new Livre
                ("9782070306022",
                        "L'Étranger",
                        auteurs ,
                        genres);
        biblio.addLivre(Livre2);

        biblio.afficheLiv();// pour aff
        biblio.motCleTitre("Le Seigneur des anneau");
        biblio.motCleISBN("9782266286268");
        //biblio.motCleAuteur("Albert Camus");
        Lecteur melissa = new Lecteur("SADEG", "Melissa", "abc@gmail.com", "abcdefg");
        melissa.emprunter(Livre2);
        melissa.retourner(Livre2);
        System.out.println(melissa);

    }*/
    // partie logique
public static void main (String[] args){
    //aceulle
    System.out.print("Acceille Bibliotheque\n" +"veillier choisir une option\n "+ "R:Rechercher" + "C:Creer"+"S:connecte"+"Q:Quiter\n");
    // prendre lentre du clavier//
    Scanner scanner=  new Scanner(System.in);
    //Creer"+"S:connecte"+"Q:Quiter"  next() retourne un string
     // char choix =choisi.next() ;pour ligne entire mais cet pas ce que on veut
    // on as plusieur facon de lire lentre
   //char choix  = choisi.next().charAt(0);//  lire premier charthere en scanner que on vas comparer  O ;Premier indice

 /*   switch (choix)// sil tape ces touche
    {
        case 'R':
            System.out.print("Vous avez choisi l'option R\n");
            break;
        case 'S':
            System.out.println("Vous avez choisi l'option S");
            break;
        case 'Q':
            System.out.println("Vous avez choisi l'option Q");
            break;
        case 'C':
            System.out.println("Vous avez choisi l'option C");
            break;

        default://si il ne tape pas ces touches


            System.out.println("Choix non valide");
            while ()

    }
*/   /*
    Boolean quitter = false;// drapeau avec while
    while(!quitter) { //!quitter : quitter == false
        System.out.println("vous naver pas quiter le progrmmme...");
        System.out.println("Entrez q pour quitter");
        char entree = scanner.next().charAt(0);
        if(entree == 'Q' || entree == 'q') {
            quitter = true;
        }

    }*/

    Boolean estvalide = false;// drapeau avec while
    while(estvalide == false) {
char choix= scanner.next().charAt(0);
        switch (choix)// sil tape ces touche
        {
            case 'R':
                System.out.print("Vous avez choisi l'option R\n");
                estvalide=true;
                break;
            case 'S':
                System.out.println("Vous avez choisi l'option S");
                estvalide=true;
                break;
            case 'Q':
                System.out.println("Vous avez choisi l'option Q");
                estvalide=true;
                break;
            case 'C':
                System.out.println("Vous avez choisi l'option C");
                estvalide=true;
                break;

            default://si il ne tape pas ces touches


                System.out.println("Choix non valide");
        }

// si il tape un bonne option je sors de la boucle si il fait une erreru japplique la boucle whilede reeseyer
    }

}


}




