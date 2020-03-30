import java.util.Random;
import java.util.Scanner;

public class Back {

    Random kes = new Random();
    Scanner scan = new Scanner(System.in);


    private int x;
    private int y;
    
    private String isim;
    private String soyad;
    
    public Back(String isim, String soyad) {

        this.isim = isim;
        this.soyad = soyad;

        this.x = kes.nextInt(29);
        this.y = kes.nextInt(29);

        String name = "name";      //----> User's username and surname infos
        String surname = "username";

        if (this.isim == name && this.soyad == surname) {

            System.out.println("What is the result? " + x + " + " + y);

            int a = scan.nextInt();


            if (a == x + y) {

                    System.out.println("Access Granted");
                    System.out.println("Welcome to the system");
                }

            else {

                //int b;

                for (int b = 5;; b++) {

                    System.out.println("Try it again");
                    x = kes.nextInt(30-1);
                    y = kes.nextInt(30-1);
                    System.out.println("What is the result? " + x + " + " + y);

                    int i = scan.nextInt();

                    if (i == x + y) {
                        System.out.println("Access Granted");
                        System.out.println("Human verification completed");
                        System.out.println("Welcome to the system");
                        break;
                    }

                    else if (b == 10) {

                        System.out.println("Access Denied");
                        System.out.println("You're not a human!");
                        break;
                    }

                    else {

                        continue;
                    }

                }
            }
        }

        else {

            System.out.println("Access Denied");
        }
        
        scan.close();
    }

}
