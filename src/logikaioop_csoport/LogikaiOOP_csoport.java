package logikaioop_csoport;

import java.util.Scanner;

public class LogikaiOOP_csoport {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Lada a = new Lada();
        System.out.println("Leírás");
        System.out.println(a);
        System.out.println("Melyik:");
        System.out.println("A válasz jo | rossz");
        String username = sc.nextLine();
        System.out.println(username);
    }
    
}

