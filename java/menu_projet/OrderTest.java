import java.util.Scanner;

public class OrderTest {
    public static void main (String []args) {
        Order o = new Order();
        Scanner scan = new Scanner(System.in);
        o.affichageMenu();
        int choixMenu= scan.nextInt();
        o.affichageMenuSelectioner(choixMenu);
    }
}