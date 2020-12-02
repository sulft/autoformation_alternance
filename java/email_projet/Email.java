/*Once completed, the program should do a few things:

• It should generate a new email based on the employee’s first name, last name, and department.
• Generate a random string for their password.
• Have set methods to change the password.
• Have get methods to display name, email, and mailbox capacity.*/

import java.util.Scanner;

public class Email { 
    private String name;
    private String lastName;
    private String department;
    private int mailBoxCapacity;
    private String password;

    static Scanner scan = new Scanner(System.in);

    public Email(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        this.department = demandeDepartement();
        //affiche le departement de l'utilisateur
        System.out.println("Vous êtes du département " + this.department + ".");
    }

    //demande du département
    private String demandeDepartement() {
        System.out.println("Quel est votre département ?");
        System.out.println("1 - Sales");
        System.out.println("2 - Development");
        System.out.println("3 - Accounting");
        System.out.println("0 - Aucun département");
        System.out.print("Réponse : ");
        int choix;

        do {
            choix = scan.nextInt();
            if((choix<0) || (choix>3)) {
                System.out.print("Erreur de saisi, saisir un nombre entre 1 et 3. Réponse : ");
            }
        }while( (choix<0) || (choix>3) );

        switch(choix) {
            case 1:
                return "sales";

            case 2:
                return "dev";

            case 3:
                return "acc";

            case 0:
                return "";

            default:
                return "";
        }
    }

    //génération aléatoire du mot de passe 
    public String randPassword() {
        return 
    }
    //affichage prenom

    //affichage email
    public void affichageEmail() {
        System.out.println("");
    }

    //affichage capacité de stockage de la boite mail

    //demande mot de passe

    //demande quel est le département de travail

    //création email alternatif



}