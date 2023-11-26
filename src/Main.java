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

//Departement

        DepartementHashSet dep=new DepartementHashSet();
        Departement dep1 =new Departement(10,10,"Info");
        Departement dep2 =new Departement(2,10,"Gestion");
        Departement dep3 =new Departement(3,10,"Elec");

        dep.ajouterDepartement(dep1);
        dep.ajouterDepartement(dep2);
        dep.ajouterDepartement(dep3);

        dep.displayDepartement();


        System.out.println("set trie**********");
        System.out.println(dep.trierDepartementById());
       // dep.displayDepartement();


//hashmap
        System.out.println("*************hashMap**********");
        AffectationHashMap empDep=new AffectationHashMap();
        empDep.ajouterEmployeDepartement(e1,dep1);
        empDep.ajouterEmployeDepartement(e2,dep2);
        empDep.afficherEmployesEtDepartements();

        System.out.println("TreeMap");
        System.out.println(empDep.trierMap());


    }
}