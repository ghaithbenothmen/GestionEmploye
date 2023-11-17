public class Employe implements Comparable<Employe>{
    private int id,grade;
    private String nom,prenom,nomDepar;

    public Employe(){}

    public Employe(int id, int grade, String nom, String prenom, String nomDepar) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepar = nomDepar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

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

    public String getNomDepar() {
        return nomDepar;
    }

    public void setNomDepar(String nomDepar) {
        this.nomDepar = nomDepar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Employe employe) {
            return employe.nom.equals(this.nom) && employe.id==this.id;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepar='" + nomDepar + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
       // return Integer.compare(this.id,o.getId());
        return this.id - o.getId();
    }
}
