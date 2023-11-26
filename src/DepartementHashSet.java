import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

    public Set<Departement> listDepa;


    public DepartementHashSet(){
        listDepa=new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        listDepa.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement :listDepa){
            if (departement.getNomDepar().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        if(listDepa.contains(departement))return true;
        else return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
listDepa.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(listDepa);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        TreeSet<Departement> dep = new TreeSet<>(listDepa);
        return dep;
    }
}
