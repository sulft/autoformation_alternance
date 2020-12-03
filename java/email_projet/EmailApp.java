import java.util.Scanner;

public class EmailApp {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quel est votre prénom ? ");
        String firstName = scan.nextLine();

        System.out.print("Quel est votre nom ? ");
        String lastName = scan.nextLine();

        Email e = new Email(firstName,lastName);
        e.affichageRecap();
    }
}