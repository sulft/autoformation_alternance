/*Once completed, the program should do a few things:

• It should generate a new email based on the employee’s first name, last name, and department.
• Generate a random string for their password.
• Have set methods to change the password.
• Have get methods to display name, email, and mailbox capacity.*/
import java.util.Random;
import java.util.Scanner;

public class Email { 
    private String name;
    private String lastName;
    private String department;
    private String email;
    private String altEmail;
    private String entreprise = "CGI.com";
    private int mailBoxCapacity = 500;
    private String password;

    static Scanner scan = new Scanner(System.in);

    public Email(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        this.department = demandeDepartement();

        //création email à l'aide des éléments entrés
        this.email = name.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + entreprise;
        System.out.println("Votre email est : " + this.email);

        this.password = randPassword();
        //affiche le mot de passe généré
        System.out.println("Votre mot de passe par défaut est : " + this.password);

    }

    //demande quel est le département de travail
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

        System.out.println("\n**********************************************************************\n");

        if( choix == 1 ) {
            return "sales";
        } else if ( choix == 2 ) {
            return "dev";
        } else if ( choix == 3) {
            return "acc";
        } else {
            return "";
        } 
    }

    //génération aléatoire du mot de passe 
    public String randPassword() {
        String chars = "azertyuiopmlkjhgfdsqwxcvbnABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890%&$*!?,;";
        int taille_mdp = 8;

        StringBuilder sBuilder = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < taille_mdp; i++) {
            sBuilder.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return sBuilder.toString();
    }

    //Méthode SET
    public void setMailBoxCapacity(int capacity) {this.mailBoxCapacity = capacity;}
    public void setPassword(String password) {this.password = password;}
    public void setAltEmail(String email) {this.altEmail = email;} //email alternatif
    
    //Méthode GET
    public int getMailBoxCapacity () {return mailBoxCapacity;}
    public String getAltEmail() {return altEmail;}
    public String getPassword() {return password;}
    public String getName() {return name;}
    public String getEmail() {return email;}

    //Affichage
    public void affichageRecap() {
        System.out.println("\n**********************************************************************\n");
        System.out.println("Votre nom est " + name);
        System.out.println("Votre mail est " + email);
        System.out.println("La capacité de stockage de votre boite mail est : " + mailBoxCapacity);
    }   
}