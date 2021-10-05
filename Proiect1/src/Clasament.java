public class Clasament {

    public static Echipa e1,e2,e3;

    public Clasament(Echipa e1, Echipa e2, Echipa e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public static void bestJe1(){

        if(e1.j1.getGoals() > e1.j2.getGoals() && e1.j1.getGoals() > e1.j3.getGoals()) System.out.println(e1.j1.toString());
        else if(e1.j2.getGoals() > e1.j3.getGoals()) System.out.println(e1.j2.toString());
        else System.out.println(e1.j3.toString());
    }
    public static void bestJe2(){

        if(e2.j1.getGoals() > e2.j2.getGoals() && e2.j1.getGoals() > e2.j3.getGoals()) System.out.println(e2.j1.toString());
        else if(e2.j2.getGoals() > e2.j3.getGoals()) System.out.println(e2.j2.toString());
        else System.out.println(e2.j3.toString());
    }
    public static void bestJe3(){

        if(e3.j1.getGoals() > e3.j2.getGoals() && e3.j1.getGoals() > e3.j3.getGoals()) System.out.println(e3.j1.toString());
        else if(e3.j2.getGoals() > e3.j3.getGoals()) System.out.println(e3.j2.toString());
        else System.out.println(e3.j3.toString());
    }

    public static void bestE(Echipa e1,Echipa e2,Echipa e3){
        Echipa aux;
        Echipa[] vect;
        vect = new Echipa[3];
        vect[0] = e1;
        vect[1] = e2;
        vect[2] = e3;
        for(int i = 0; i < 2; ++i)
        for(int j = i+1; j <=2; ++j){
            if(vect[i].getPunctaj() < vect[j].getPunctaj())
            {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
            }
        }
        System.out.println("1." + vect[0].numeEchipa + " " + vect[0].getPunctaj() + "\n" + "2." + vect[1].numeEchipa + " " + vect[1].getPunctaj()  + "\n" + "3."  + vect[2].numeEchipa +" " + vect[2].getPunctaj());
    }

}
