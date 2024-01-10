package logikaioop_csoport;

import java.util.Scanner;

public class Feladat {

    private Scanner sc = new Scanner(System.in);
    String leiras = "";
    int melyik;
    Lada lada = new Lada();

    public void run() {
        MelyikAz();
        getLeiras();
        isHelyes();
        eredmenyKonzolra();
    }

    public String getLeiras() {
        leiras = "Leírás";
        leiras += lada;
        leiras += "Melyik:";
        leiras += "A válasz jo | rossz";
        leiras += melyik;

        return leiras;
    }

    public int MelyikAz() {

        melyik = sc.nextInt();

        return melyik;
    }

    public boolean isHelyes() {
        if (melyik == 1) {
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
