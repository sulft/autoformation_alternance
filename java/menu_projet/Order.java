import java.util.Scanner;

public class Order {
    static Scanner scan = new Scanner(System.in);
    private int choix; //choix commande
    private int nbCommande; //nombre de commande

    public void demanderMenu(String categorie, String[] reponse) {
        System.out.println("Choix " + categorie); // affiche le choix de la catégorie en cours
            for(int i = 0; i < reponse.length; i++) {
                System.out.println(i+1 + " - " + reponse[i]);
            }

        System.out.print(categorie + " ? ");

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
                System.out.println("\n");
            }
            else {
                System.out.println("Vous n'avez pas choisi de " + categorie + ".." );
                System.out.println("\n");
            }
        }while(ok==false);
    }

    public void affichageMenuSelectionner(int choix) {
        String accompagnement[] = {"Légume", "Frite", "Riz"};
        String boisson[] = {"Eau plate", "Eau gazeux", "Soda"};
        if(choix == 1) {
            this.demanderAccompagnement(true, "Accompagnement", accompagnement);
            this.demanderBoisson("Boisson", boisson);

        } else if (choix == 2) {
            this.demanderAccompagnement(true, "Accompagnement", accompagnement);
        } else {
            this.demanderAccompagnement(false, "Accompagnement", accompagnement);
            this.demanderBoisson("Boisson", boisson);
        }
    }

    public void demanderAccompagnement(boolean accompagnementPossible, String categorie, String[] reponse ) {
        if(accompagnementPossible) {
            this.demanderMenu(categorie, reponse);
        } else {
            String rizOuNon[] = {"Oui", "Non"};
            this.demanderMenu("Riz", rizOuNon);
        }

    }

    public void demanderBoisson(String categorie, String[] reponse) {
        this.demanderMenu(categorie, reponse);
    }

    public void runMenu () {
        String menu[] = {"Poulet", "Boeuf", "Végétarien"};
        this.demanderMenu("Menu", menu);
        this.affichageMenuSelectionner(this.choix);//sélectionne le choix entrer dans demanderMenu
    }

    public void nombreDeCommande() {
        System.out.print("Combien de commande, voulez-vous effectuer ? ");
        this.nbCommande = scan.nextInt();
        for(int i = 0; i<this.nbCommande; i++) {
            runMenu();
            if(i<this.nbCommande-1) {
                System.out.print("Ok c'est noté, commande suivante ? ");
                System.out.print("\n");
                System.out.print("\n");
            }
        }
    }
}