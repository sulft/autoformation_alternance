import java.util.Scanner;

public class Order {
    static Scanner scan = new Scanner(System.in);
    private int choix; //choix commande
    private int nbCommande; //nombre de commande
    //Affiche tous les menus
    public void affichageMenu () {
        System.out.print("\n");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.print("Que souhaitez-vous comme menu ? ");
    }

    public void affichageMenuSelectionner () {

        do {
            this.choix = scan.nextInt();
            scan.nextLine();

            switch(this.choix) {

                case 1:
                    System.out.println("Vous avez fait le choix du menu " + this.choix + " - Poulet");
                    this.accompagnement(true);
                    this.boisson();
                    break;
                
                case 2:
                    System.out.println("Vous avez fait le choix du menu " + this.choix + " - Boeuf");
                    this.accompagnement(true);
                    break;

                case 3:
                    System.out.println("Vous avez fait le choix du menu " + this.choix + " - Végétarien");
                    this.accompagnement(false);
                    this.boisson();
                    break;
                
                default:
                    System.out.println("Erreur sur le choix !");
                    this.affichageMenu();
            }
        }while(this.choix<1 ||this.choix>3);
    }

    public void accompagnement(boolean accompagnementPossible ) {
        if(accompagnementPossible) {
            do {
                System.out.print("\n");
                System.out.println("1 - Légume");
                System.out.println("2 - Frite");
                System.out.println("3 - Riz");
                System.out.print("Que souhaitez-vous comme accompagnement ? ");

                this.choix = scan.nextInt();

                switch(this.choix) {
                    case 1:
                        System.out.println("Vous avez fait le choix de l'accompagnement " + this.choix + " - Légume");
                        break;
                        
                    case 2:
                        System.out.println("Vous avez fait le choix de l'accompagnement " + this.choix + " - Frite");
                        break;

                    case 3:
                        System.out.println("Vous avez fait le choix de l'accompagnement " + this.choix + " - Riz");
                        break;
                        
                    default:
                        System.out.println("Erreur sur le choix !");
                }
            }while(this.choix<1 ||this.choix>3);
        } else {
            do {
                System.out.print("\n");
                System.out.println("1 - oui");
                System.out.println("2 - non");
                System.out.print("Voulez-vous du riz ? ");

                this.choix = scan.nextInt();

                if(this.choix == 1 ) {
                    System.out.println("Vous avez choisi de prendre du riz.");
                }
                else if(this.choix == 2 ){
                    System.out.println("Vous avez choisi de ne pas prendre de riz.");
                }
                else {
                    System.out.println("Erreur sur le choix !"); 
                }
            }while(this.choix<1 ||this.choix>2);
        }
    }

    public void boisson() { 
        do {
            System.out.print("\n");
            System.out.println("1 - Eau plate");
            System.out.println("2 - Eau gazeuse");
            System.out.println("3 - Soda");
            System.out.print("Que souhaitez-vous comme boisson ? ");

            this.choix = scan.nextInt();

            switch(this.choix) {
                case 1:
                    System.out.println("Vous avez fait le choix de la boisson " + this.choix + " - Eau plate.");
                    break;
            
                case 2:
                    System.out.println("Vous avez fait le choix de la boisson " + this.choix + " - Eau gazeuse.");
                    break;

                case 3:
                    System.out.println("Vous avez fait le choix de la boisson " + this.choix + " - Soda.");
                    break;
            
                default:
                    System.out.println("Vous n'avez pas choisi de boisson");
            }
        }while(this.choix<1 ||this.choix>3);
    }

    public void runMenu () {
        this.affichageMenu();
        this.affichageMenuSelectionner();
    }

    public void nombreDeCommande() {
        System.out.print("Combien de commande, voulez-vous effectuer ? ");
        this.nbCommande = scan.nextInt();
        for(int i = 0; i<this.nbCommande; i++) {
            runMenu();
            System.out.print("\n");
            System.out.print("\n");
            if(i<this.nbCommande-1) {
                System.out.print("Ok c'est noté, commande suivante ? ");
                System.out.print("\n");
                System.out.print("\n");
            }
        }
    }
}