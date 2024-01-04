// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

    // Programme boucle main toujour
    public static void main(String[] args) {
        int but = 119;
        Boolean reussie = false;
        Scanner scanner = new Scanner(System.in);// creer loutlle
        //int num = scanner.nextInt();//lire entier et le mettre dans num

        while (reussie == false) {
            System.out.println("entrer un valeur");
            int num = scanner.nextInt();


            if (num == but) {
                System.out.println("cest reussie");
                reussie=true;
            } else if (num < but)
                System.out.println("cest petit");
            else System.out.println("cest grand");



        }
    }

}
// c
//le s se conecter
// mettre dans loption s
