public class Order {
    //Affiche tous les menus
    public void affichageMenu () {
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    public void affichageMenuSelectioner (int choix) {
        System.out.println("Vous avez choisi le menu " + choix + " !");
    }
}