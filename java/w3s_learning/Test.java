public class Test {
    //utiliser le mot clé static permet d'utiliser une méthode sans avoir à l'instancier.
    static int addition(int a,int b) {
        return a+b;
    }

    static double addition(double a,double b) {
        return a+b;
    }
    public static void main(String []args) {
        System.out.println(addition(5,3) +" et " + addition(3.2,2.4) + "! Ici je surcharge la fonction addition");
    }
}