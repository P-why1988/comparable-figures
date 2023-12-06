package Application;

public class TriBulleTableau {

    public static void trier(Comparable tableau[]) {
        boolean permut;
        int n;
        Comparable x;

        do {
            permut = false;
            for (n = 0 ;n < tableau.length - 1; n++) {
                if (tableau[n].compareTo(tableau[n+1])>0) {
                    x = tableau[n];
                    tableau[n] = tableau[n+1];
                    tableau[n+1] = x;
                    permut = true;
                }
            }
        }
        while (permut ==true);

    }
    public static void afficher (Comparable tableau[]) {
        int n;
        for (n=0; n< tableau.length; n++) {
            System.out.println(tableau[n]);
        }
    }

}
