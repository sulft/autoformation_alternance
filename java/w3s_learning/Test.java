public class Test {
    //utiliser le mot clé static permet d'utiliser une méthode sans avoir à l'instancier.
    static int addition(int a,int b) {
        return a+b;
    }

    static double addition(double a,double b) {
        return a+b;
    }

    static int recursivite(int a) {
        if(a>3){
            System.out.println(a);
            return a + recursivite(a-1);
        } else {
            return 0;
        }
    }

    public static void main(String []args) {
        System.out.println(addition(5,3) +" et " + addition(3.2,2.4) + "! Ici je surcharge la fonction addition");
        System.out.print("\n");
        System.out.print(recursivite(6));
    }
}