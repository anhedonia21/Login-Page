import java.util.Scanner;

public class Front {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int l = 5;; l++) {
            
            System.out.println("First Name: ");
            String k = scan.nextLine();                  //---> We get user's infos here
        
            System.out.println("Second Name: ");
            String e = scan.nextLine();


            if (k.equals("name") & e.equals("username")) {   //---> This checks if user's informations are true
                
                Back Her = new Back("name", "username");     //---> User's name and surname goes here
                break;
            }
        
            else if (l == 10) {

                System.out.println("Access Denied");
                break;
            }

            else {

                System.out.println("!!!");
            }


        }

        scan.close();
    }
}