package WelcomeUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] users = new String[10];
        int i;
        for ( i = 0; i <10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Username: ");
            // users = new String[10];
            users[i] = sc.next();
            System.out.println("Welcome " +users[i]);
        }
       /* for (int x=0; x<=10; x++){

            System.out.println("Welcome " +users[i]);
        }*/




    }
}
