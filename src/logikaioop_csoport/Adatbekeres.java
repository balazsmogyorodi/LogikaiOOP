/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop_csoport;

import java.util.ArrayList;
import java.util.Scanner;

public class Adatbekeres {

    private String leiras;
    private int melyik;

    public void run() {
        Scanner sc = new Scanner(System.in);
        Lada a = new Lada();
        System.out.println("Leírás");
        System.out.println(a);
        System.out.println("Melyik:");
        System.out.println("A válasz jo | rossz");
        String username = sc.nextLine();
        System.out.println(username);

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
