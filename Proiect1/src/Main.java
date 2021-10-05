import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Jucator[] j;
        j = new Jucator[6];
        Echipa[] e;
        e = new Echipa[3];
        Scanner sc = new Scanner(System.in);
        Random rnd1 = new Random();
        for (int k = 0; k < 3; ++k) {
            for (int i = 0; i < 3; ++i) {

                System.out.println("Nume jucator:");
                String nume = sc.next();

                System.out.println("Preume jucator:");
                String prenume = sc.next();

                System.out.println("Pozitie jucator:");
                String poz = sc.next();

                j[i] = new Jucator(nume, prenume, rnd1.nextInt(18, 35), rnd1.nextInt(50), poz);
            }
            System.out.println("Nume echipa:");
            String numeE = sc.next();
            e[k] = new Echipa(numeE, j[0], j[1], j[2], rnd1.nextInt(50));

        }
        Clasament c = new Clasament(e[0],e[1],e[2]);

        int key = -1;
        int key2 = 0;

        while(key != 0){
            System.out.println("Alege optiunea: \n");
            System.out.println("1.Afiseaza clasament. \n");
            System.out.println("2.Afiseaza cel mai bun jucator dintr-o echipa. \n");
            System.out.println("3.Genereaza meci. \n");
            System.out.println("0.Opreste programul. \n");
            key = sc.nextInt();

            if(key == 1) c.bestE(e[0],e[1],e[2]);
            else if(key == 2) {
                System.out.println("Alege echipa(1,2,3) " + e[0].numeEchipa + ", " + e[1].numeEchipa + " sau " + e[2].numeEchipa + "\n");
                key2 = sc.nextInt();
                if(key2 == 1) c.bestJe1();
                else if(key2 == 2) c.bestJe2();
                else c.bestJe3();
            }
            else if(key == 3) {
                int r1 = rnd1.nextInt(0,3);
                int r2 = rnd1.nextInt(0,3);
                while(r1 == r2){
                     r2 = rnd1.nextInt(0,3);
                }
                System.out.println(e[r1].numeEchipa + " VS " + e[r2].numeEchipa);

                int g1 = rnd1.nextInt(0, 6);
                int g2 = rnd1.nextInt(0, 6);
                if(g1 > g2) {
                    System.out.println(e[r1].numeEchipa + " a castigat cu: " + g1 + " la " + g2);
                    e[r1].setPunctaj(e[r1].getPunctaj()+3);
                }
                if(g1 < g2) {
                    System.out.println(e[r2].numeEchipa + " a castigat cu: " + g2 + " la " + g1);
                    e[r2].setPunctaj(e[r2].getPunctaj()+3);
                }
                if(g1 == g2) {
                    System.out.println("Egalitate scor "+ g1 + " la " + g2);
                    e[r1].setPunctaj(e[r1].getPunctaj()+1);
                            e[r2].setPunctaj(e[r2].getPunctaj()+1);
                }
            }
        }
    }
}
