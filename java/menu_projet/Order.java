/* Projet réalisation Menu de Terry. Inspiré du cours openclassroom :
https://openclassrooms.com/en/courses/4975451-demarrez-votre-projet-avec-java
*/

import java.util.Scanner;
import java.util.*;

public class Order {
    static Scanner scan = new Scanner(System.in);
    private int choix; //choix commande
    private int nbCommande; //nombre de commande
    static boolean ok; //valeur valide
    private String menu[] = {"Poulet", "Boeuf", "Végétarien"};
    public String recapitulatif = "";

    public int demanderMenu(String categorie, String[] reponse) {
        System.out.print("\n");
        System.out.println("Choix " + categorie); // affiche le choix de la catégorie en cours
            for(int i = 0; i < reponse.length; i++) {
                System.out.println(i+1 + " - " + reponse[i]);
            }

        System.out.print(categorie + " ? ");


        do {
            try {
                this.choix = scan.nextInt();
                if(this.choix >0 && this.choix<4){
                    ok = true;
                }
                else {
                    ok = false;
                }

                if(ok == true) {
                    String selection = "Vous avez choisi " + categorie + " : " + reponse[this.choix - 1];
                    this.recapitulatif = this.recapitulatif + selection + "\n";
                }
                else {
                    System.out.println("Vous n'avez pas choisi de " + categorie + ".." );
                    System.out.print(categorie + " ? ");
                }
            } catch(InputMismatchException e) {
                scan.next();
                System.out.println("Saisissez un entier s'il vous plaît ..");
                ok = false;
            }
        }while(ok==false);
        System.out.print(this.recapitulatif);

        return this.choix;//retourne le numéro du choix choisi
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

    public void runMenu (int i) {
        System.out.print("Menu : " + (i+1));
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
        System.out.print("\n");
        System.out.println("Résumé de votre commande :");

    }

    public void nombreDeCommande() {
        System.out.print("Combien de commande, voulez-vous effectuer ? ");
        do {
            try {
                this.nbCommande = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Saisissez un entier s'il vous plaît..");
                System.out.print("Combien de commande, voulez-vous effectuer ? ");
                ok = false;
            }
            for(int i = 0; i<this.nbCommande; i++) {
                runMenu(i);            
                System.out.println(this.recapitulatif);
                if(i<this.nbCommande-1) {
                    System.out.print("Ok c'est noté, commande suivante ? ");
                    System.out.print("\n");
                }
            }
        }while(ok==false); 
        /*tant que ok est égale à false, c'est à dire en rentrant dans 
        le catch de l'exception, on redemandera à l'utilisateur de saisire sa valeur */
    }
}