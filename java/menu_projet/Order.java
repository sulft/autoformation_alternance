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


    public void demanderMenu(String categorie, String[] reponse) {
        System.out.println("Choix " + categorie); // affiche le choix de la catégorie en cours
        for(int i = 0; i < reponse.length; i++) {
            System.out.println(i+1 + " - " + reponse[i]);
        }

        System.out.println("Que voulez-vous comme " + categorie + " ? ");

        boolean ok; //verifie si la commande est bien effectué 

        do {
            this.choix = scan.nextInt();
            if(this.choix >0 && this.choix<4){
                ok = true;
            }
            else {
                ok = false;
            }

            if(ok == true) {
                System.out.println("Vous avez choisi " + categorie + " : " + reponse[this.choix - 1]);
            }
            else {
                System.out.println("Vous n'avez pas choisi de " + categorie + ".." );
            }
        }while(ok==false);
    }

    public void affichageMenuSelectionner(int choix) {
        String accompagnement[] = {"Légume", "Frite", "Riz"};
        if(choix == 1) {
            this.demanderAccompagnement(true, "Accompagnement", accompagnement);
        } else if (choix == 2) {
            this.demanderAccompagnement(true, "Accompagnement", accompagnement);
        } else {
            this.demanderAccompagnement(false, "Accompagnement", accompagnement);
        }
    }

    public void demanderAccompagnement(boolean accompagnementPossible, String categorie, String[] reponse ) {
        if(accompagnementPossible) {
            String accompagnement[] = {"Poulet", "Boeuf", "Végétarien"};
            this.demanderMenu("Accompagnement", accompagnement);
        } else {
            String rizOuNon[] = {"Oui", "Non"};
            this.demanderMenu("Riz", rizOuNon);
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
        String menu[] = {"Poulet", "Boeuf", "Végétarien"};
        this.demanderMenu("Menu", menu);
        this.affichageMenuSelectionner(this.choix);//sélectionne le choix entrer dans demanderMenu
        //this.affichageMenuSelectionner();
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