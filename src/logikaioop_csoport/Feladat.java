package logikaioop_csoport;

import java.util.Scanner;

public class Feladat {

    String leiras = "";
    int melyik;
    Lada lada = new Lada();

    public Feladat(int melyik) {
        this.melyik = melyik;
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
        Scanner sc = new Scanner(System.in);
        melyik = sc.nextInt(1);
        
        return melyik;
    }
    
    public boolean isHelyes() {
        
        return false;
        
    }
    
    public void eredmenyKonzolra() {
        
    }
}
