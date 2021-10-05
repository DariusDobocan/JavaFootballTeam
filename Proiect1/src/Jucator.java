public class Jucator {

    public String nume;

    public String prenume;

    public int varsta;

    private int goluri;

    private String poz;

    public Jucator(String nume, String prenume, int varsta, int goluri, String poz){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.goluri = goluri;
        this.poz = poz;
    }

    public int getGoals() {
        return goluri;
    }

    public void setGoals(int goals) {
        this.goluri = goluri;
    }

    public String toString() {
        return "Cel mai bun jucator este: " + nume + prenume + ", goluri=" + goluri ;
    }
}
