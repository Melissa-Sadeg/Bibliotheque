
import java.util.ArrayList;
import java.util.Scanner;
// classe utilisateur
public class User {
    private String nom;
    private String prenom;
    private String email;

    private String Mdp;
    private ArrayList<Livre> livresEmpruntes;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String mdp) {
        Mdp = mdp;
    }

    public ArrayList<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    public void setLivresEmpruntes(ArrayList<Livre> livresEmpruntes) {
        this.livresEmpruntes = livresEmpruntes;
    }

    // constructeur
    public User(String nom, String prenom, String email, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        Mdp = mdp;

        this.livresEmpruntes = new ArrayList<>();



    }// methode verifie le bonne adresse emeil
        public static Boolean bonAdresse(String Email) {
            if (Email == null)
                return false;

            if  (Email.indexOf('@') == -1 || Email.indexOf('.') == -1)
                return false;

            if (Email.indexOf('@') == 0 || Email.indexOf('.') < Email.indexOf('@') || Email.length() - 1 == Email.indexOf('.'))
                return false;
            // faut pas qu @soi successive evec '.'
            if (Email.indexOf('@') + 1 == Email.indexOf('.'))
                return false;

            else
                return true;


        }// methode verifie si c'est la bon mot de passe

        public static Boolean codeBon(String Mdp) {

            if (Mdp == null || Mdp.length() < 8)
                return false;


            // Initialise des indicateurs pour vérifier la présence d'une majuscule, d'une minuscule et d'un chiffre
            boolean contientMajuscule = false;
            boolean contientMinuscule = false;
            boolean contientChiffre = false;

            //      la on vas modifier pour les 3 Parcourt chaque caractère du mot de passe
            for (char caractere : Mdp.toCharArray()) {
                // Vérifie si le caractère est une majuscule
                if (Character.isUpperCase(caractere)) {
                    contientMajuscule = true;
                }
                // Vérifie si le caractère est une minuscule
                else if (Character.isLowerCase(caractere)) {
                    contientMinuscule = true;
                }
                // Vérifie si le caractère est un chiffre
                else if (Character.isDigit(caractere)) {
                    contientChiffre = true;
                }

                // Si toutes les conditions sont remplies, le mot de passe est valide
            }

            if (contientMajuscule && contientMinuscule && contientChiffre) {
                return true;
            }

            // Si la boucle se termine sans avoir rencontré tous les critères, le mot de passe n'est pas valide
            return false;
        }
        //  class cretaion du compte
public static User creationCompte() {
    String Nom;
    String Prenom;
    String Email;
    String Mdp;
    System.out.println("Creation du compte");
    System.out.println("rentrer votre Nom:");
    Scanner scanner = new Scanner(System.in);
    Nom = scanner.next();

    System.out.println("rentrer votre Prenom:");
    Prenom = scanner.next();


    System.out.println("rentrer votre Email:");
    Email = scanner.next();

    while (User.bonAdresse(Email) == false) {
        System.out.println("Reesseyer");
        System.out.println("rentrer votre Email:");
        Email = scanner.next();
    }
    System.out.println("rentrer votre Mdp:");
    Mdp = scanner.next();

    while (User.codeBon(Mdp) == false) {
        System.out.println("Reesseyer");
        System.out.println("rentrer votre Mdp:");
        Mdp = scanner.next();
    }
    User nvxUser = new User(Nom, Prenom, Email, Mdp);
    User.bonAdresse(Email);
    User.codeBon(Mdp);

    return nvxUser;
}



// LA METHODE MAIN POUR EXECUTER
    public static void main (String[]  args ){
        String Mdp = "Root";
        System.out.println(User.codeBon(Mdp));

        String Email = "nomprenom@domaine.";
        System.out.println(User.bonAdresse(Email));

        System.out.println(User.creationCompte());
    }
}
