// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(11, 2, "Ben othmen", "Ghaith", "Dev");
        Employe e2 = new Employe(2, 3, "Ben ahmed", "Ahmed", "Marketing");
        Employe e3 = new Employe(3, 4, "Ben yaghlen", "khalil", "RH");


        SocieteArrayList sc = new SocieteArrayList();
        sc.ajouterEmploye(e1);
        sc.ajouterEmploye(e2);
        sc.ajouterEmploye(e3);

        sc.displayEmploye();

       // sc.supprimerEmploye(e1);
        System.out.println("*****apres Trie********");

        sc.trierEmployeParNomDepartementEtGrade();
        sc.displayEmploye();


    }
}