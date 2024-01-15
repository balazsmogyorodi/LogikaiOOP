package logikaioop_csoport.cntroller;

import logikaioop_csoport.model.Lada;
import java.util.Scanner;

public class Feladat {

    private Scanner sc = new Scanner(System.in);
    String leiras = "";
    int melyik = 0;
    Lada bronz = new Lada("arany", "Ebben van a kincs"),
            ezust = new Lada("ezüst", "Nem ebben van a kincs."),
            arany = new Lada("bronz", "Az arany hazudik.");
    Lada[] lada = new Lada[3];

    public void run() {
        lada[0] = bronz;
        lada[1] = ezust;
        lada[2] = arany;
        System.out.print(leiras());
        MelyikAz();
        isHelyes();
        eredmenyKonzolra();
    }

    public String leiras() {
        leiras = "Kezdödhet a kincs keresés!\n\n";
        for (int i = 0; i < lada.length; i++) {
            leiras += lada[i].getAnyag() + ": ";
            leiras += lada[i].getAllitas() + "\n";
        }
        return leiras;
    }

    public int MelyikAz() {
        while (melyik < 1 || melyik > 3) {
            System.out.print("Válasz a ládák közül! Sorrend alapján 1-től 3-ig: ");
            melyik = sc.nextInt();
            System.out.println("");
        }
        melyik = melyik - 1;
        return melyik;
    }

    public boolean isHelyes() {
        if (lada[melyik].getKincs()) {
            return true;
        } else {
            return false;
        }
    }

    public void eredmenyKonzolra() {
        if (isHelyes()) {
            System.out.println("Jó választás");
        } else {
            System.out.println("Rossz választás");
        }
    }
}
