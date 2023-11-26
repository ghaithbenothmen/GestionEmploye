public class Departement implements Comparable<Departement>{

    private int id,nbrEmployes;
    private String nomDepar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    public String getNomDepar() {
        return nomDepar;
    }

    public void setNomDepar(String nomDepar) {
        this.nomDepar = nomDepar;
    }

    public Departement(int id, int nbrEmployes, String nomDepar) {
        this.id = id;
        this.nbrEmployes = nbrEmployes;
        this.nomDepar = nomDepar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Departement d) {
            return d.nomDepar.equals(this.nomDepar) && d.id==this.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbrEmployes=" + nbrEmployes +
                ", nomDepar='" + nomDepar + '\'' +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
