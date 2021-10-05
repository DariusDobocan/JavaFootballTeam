
public class Echipa {

    public String numeEchipa;

    public Jucator j1,j2,j3;

    private int punctaj;

    public Echipa(String numeEchipa, Jucator j1, Jucator j2, Jucator j3, int punctaj){
        this.numeEchipa = numeEchipa;
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.punctaj = punctaj;
    }

    public String toString() {
        return "Echipa{" +
                "numeEchipa='" + numeEchipa + '\'' +
                ", punctaj=" + punctaj +
                '}';
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }
}
