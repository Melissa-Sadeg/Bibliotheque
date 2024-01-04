import java.util.ArrayList;

//
class Lecteur extends User{
    private ArrayList<String> Emprun;
    private ArrayList<String>Retour;

    public Lecteur(String nom, String prenom, String email, String mdp) {
        super(nom, prenom, email, mdp);
        this.Emprun = new ArrayList<>();
        this.Retour = new ArrayList<>();

    }

    public ArrayList<String> getEmprun() {
        return Emprun;
    }

    public void setEmprun(ArrayList<String> emprun) {
        Emprun = emprun;
    }

    public void emprunter(Livre livre){
        this.Emprun.add(livre.getTitre());
        livre.setEtat(false);
    }
    public void retourner(Livre livre){
        int indice = this.Emprun.indexOf(livre.getTitre());
        this.Emprun.remove(indice);
        this.Retour.add(livre.getTitre());
        livre.setEtat(false);
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "Emprun=" + Emprun +
                ", Retour=" + Retour +
                '}';
    }

    public static void main(String args[]) {

    }
}
