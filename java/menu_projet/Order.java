import java.util.Scanner;

public class Order {
    static Scanner scan = new Scanner(System.in);
    //Affiche tous les menus
    public void affichageMenu () {
        System.out.print("\n");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.print("Que souhaitez-vous comme menu ? ");
    }

    public void affichageMenuSelectionner (int choix) {
        switch(choix) {
            case 1:
                System.out.println("Vous avez fait le choix du menu " + choix + " - Poulet");
                this.accompagnement(true);
                this.boisson();
                break;
            
            case 2:
                System.out.println("Vous avez fait le choix du menu " + choix + " - Boeuf");
                this.accompagnement(true);
                break;

            case 3:
                System.out.println("Vous avez fait le choix du menu " + choix + " - Végétarien");
                this.accompagnement(false);
                this.boisson();
                break;
            
            default:
                System.out.println("Erreur sur le choix !");
        }
    }

    public void accompagnement(boolean accompagnementPossible ) {
        int choix2;
        
        if(accompagnementPossible) {
            System.out.print("\n");
            System.out.println("1 - Légume");
            System.out.println("2 - Frite");
            System.out.println("3 - Riz");
            System.out.print("Que souhaitez-vous comme accompagnement ? ");

            choix2 = scan.nextInt();

            switch(choix2) {
                case 1:
                    System.out.println("Vous avez fait le choix de l'accompagnement " + choix2 + " - Légume");
                    break;
            
                case 2:
                    System.out.println("Vous avez fait le choix de l'accompagnement " + choix2 + " - Frite");
                    break;

                case 3:
                    System.out.println("Vous avez fait le choix de l'accompagnement " + choix2 + " - Riz");
                break;
            
            default:
                System.out.println("Vous n'avez pas choisi d'accompagnement");
            }
        } else {
            System.out.println("1 - oui");
            System.out.println("2 - non");
            System.out.print("Voulez-vous du riz ? ");

            choix2 = scan.nextInt();

            if(choix2 == 1 ) {
                System.out.println("Vous avez choisi de prendre du riz.");
            }
            else {
                System.out.println("Vous avez choisi de ne pas prendre de riz.");
            }

        }
    }

    public void boisson() { 
        int choix3;
        System.out.print("\n");
        System.out.println("1 - Eau plate");
        System.out.println("2 - Eau gazeuse");
        System.out.println("3 - Soda");
        System.out.print("Que souhaitez-vous comme boisson ? ");

        choix3 = scan.nextInt();

        switch(choix3) {
            case 1:
                System.out.println("Vous avez fait le choix de la boisson " + choix3 + " - Eau plate.");
                break;
        
            case 2:
                System.out.println("Vous avez fait le choix de la boisson " + choix3 + " - Eau gazeuse.");
                break;

            case 3:
                System.out.println("Vous avez fait le choix de la boisson " + choix3 + " - Soda.");
            break;
        
        default:
            System.out.println("Vous n'avez pas choisi de boisson");
        }

    }

    public void runMenu () {
        this.affichageMenu();
        this.affichageMenuSelectionner(scan.nextInt());
    }
}