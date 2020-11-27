public class Order {
    //Affiche tous les menus
    public void affichageMenu () {
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.print("Que souhaitez-vous comme menu ? ");
    }

    public void affichageMenuSelectioner (int choix) {
        System.out.print("\n");
        switch(choix) {

            case 1:
                System.out.println("Vous avez choix le menu " + choix + " - Poulet");
                break;
            
            case 2:
                System.out.println("Vous avez choix le menu " + choix + " - Boeuf");
                break;

            case 3:
                System.out.println("Vous avez choix le menu " + choix + " - Végétarien");
                break;
            
            default:
                System.out.println("Erreur sur le choix !");
                
        }
    }
}