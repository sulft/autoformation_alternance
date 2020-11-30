/* Projet réalisation Menu de Terry. Inspiré du cours openclassroom :
https://openclassrooms.com/en/courses/4975451-demarrez-votre-projet-avec-java
*/

import java.util.Scanner;

public class Order {
    static Scanner scan = new Scanner(System.in);
    private int choix; //choix commande
    private int nbCommande; //nombre de commande
    private String menu[] = {"Poulet", "Boeuf", "Végétarien"};

    public int demanderMenu(String categorie, String[] reponse) {
        System.out.print("\n");
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
            }
            else {
                System.out.println("Vous n'avez pas choisi de " + categorie + ".." );
                System.out.print(categorie + " ? ");

            }
        }while(ok==false);

        return this.choix;
    }

    //cas spécial en cas de menu végétarien, seulement possibilité de riz
    public void demandeAccompagnement(boolean accompagnementPossible) {
        String accompagnement[] = {"Légume", "Frite", "Riz"};
        String rizOuNon[] = {"Oui", "Non"};
        if(accompagnementPossible) {
            this.demanderMenu("Accompagnement", accompagnement);
        } else {
            this.demanderMenu("Riz", rizOuNon);
        }
    }

    public void demandeBoisson() {
        String boisson[] = {"Eau plate", "Eau gazeux", "Soda"};
        this.demanderMenu("Boisson", boisson);
    }

    public void runMenu () {
        int valeur = this.demanderMenu("Menu", this.menu);//valeur retourné permettant de savoir le menu selectionné avec ces options
        switch(valeur) {
            case 1:
                this.demandeAccompagnement(true);
                this.demandeBoisson();
                break;

            case 2:
                this.demandeAccompagnement(true);
                break;

            case 3:
                this.demandeAccompagnement(false);
                this.demandeBoisson();
                break;
        }
    }

    public void nombreDeCommande() {
        System.out.print("Combien de commande, voulez-vous effectuer ? ");
        this.nbCommande = scan.nextInt();
        for(int i = 0; i<this.nbCommande; i++) {
            runMenu();
            if(i<this.nbCommande-1) {
                System.out.print("Ok c'est noté, commande suivante ? ");
                System.out.print("\n");
            }
        }
    }
}