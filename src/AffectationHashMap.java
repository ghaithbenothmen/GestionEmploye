import java.util.*;

public class AffectationHashMap {

    Map<Employe,Departement> mapEmp;


    public AffectationHashMap(){
        mapEmp=new HashMap<>();

    }


    public void ajouterEmployeDepartement(Employe e, Departement d){

        mapEmp.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe, Departement> entry : mapEmp.entrySet()){

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e){

        //if(mapEmp.remove(e).equals(mapEmp.getValue()))
         mapEmp.remove(e);
        System.out.println("employe bien supprimer");
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        mapEmp.remove(e,d);
        System.out.println("employe bien supprimer");
    }

    public void afficherEmployes(){
        Set<Employe> keys = mapEmp.keySet();

        Iterator<Employe> iterator = keys.iterator();

        while (iterator.hasNext()) {

            System.out.println("Key(Employe): " + iterator.next());

        }

    }

    public void afficherDepartements(){

        Collection<Departement> values = mapEmp.values();

        for (Departement value : values) {

            System.out.println("Value(Departement) : " + value);

        }
    }

    public boolean rechercherEmploye (Employe e){
        return mapEmp.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return mapEmp.containsValue(d);
    }

    public  TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe, Departement> emp = new TreeMap<>(mapEmp);
        return emp;
    }
}
