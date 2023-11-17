import java.util.*;

public class SocieteArrayList implements IGestion<Employe>{

    private List<Employe> liseEmploye;

    public SocieteArrayList(){
        liseEmploye=new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        liseEmploye.add(employe );
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe :liseEmploye){
            if (employe.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
       /*for (Employe emp :liseEmploye){
            if (emp.equals(employe)){
                return true;
            }
        }
        return false;*/

        if(liseEmploye.contains(employe))return true;
        else return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        liseEmploye.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for (Employe employe : liseEmploye) {
            System.out.println(employe.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liseEmploye);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(liseEmploye, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                int comparNom=o1.getNom().compareTo(o2.getNom());
                int compareDep=o1.getNomDepar().compareTo(o2.getNomDepar());
                if(comparNom==0){
                    if(compareDep==0){
                        return o1.getGrade() - o2.getGrade();
                        //return Integer.compare(o1.getGrade(), o2.getGrade());
                    }
                    return compareDep;
                }
                return comparNom;
            }
        });

    }
}
