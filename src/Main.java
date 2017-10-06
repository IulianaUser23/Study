import java.util.Scanner;

public class Main {

    /**
     * Calculeaza in ce S din orar se afla un student.
     *
     * Exemplu: calcul(2, 1) == 3
     * @param nrGrupa numarul grupei studentului, intre 1 si 3.
     * @param nrSemigrupa numarul semigrupei studentului, 1 sau 2.
     * @return un S reprezentand S-ul din orar.
     */
    public static String calculSpentruOrar(int nrGrupa, int nrSemigrupa) {

        int numarS = 2*(nrGrupa - 1) + nrSemigrupa;
        return "S" + numarS;
    }

    public static void main(String[] args) {

        String[] mesaje = {"Salut!" + "Ce faci?", "Hello world!"};
        System.out.println(mesaje[0]);
        System.out.println(mesaje[1]);
        System.out.println(mesaje.length);

        float pi = 3.14159f;
        double e = 2.72;
        System.out.println(pi + e);

//        for (int i = 0; i < 20; ++i) {
//            System.out.println(i);
//        }
//        System.out.println(i); // EROARE!

        /*int i = 0;
        while (i < 20) {
            System.out.println(i);
            ++i;
        }*/

//        int n = 100;
//        for (int i = 1; i <= n; ++i) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz!");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz!");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz!");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner s = new Scanner(System.in);
        System.out.println("Dati numarul grupei:");
        int numarGrupa = s.nextInt();
        System.out.println("Dati numarul semigrupei:");
        int numarSemigrupa = s.nextInt();

        /*
        1,1 => S1     0,1
        1,2 -> S2     0,2
        2,1 -> S3     2,1
        2,2 -> S4     2,2
        3,1 -> S5     4,1
        3,2 -> S6     4,2
         */

        String S = calculSpentruOrar(numarGrupa, numarSemigrupa);
        System.out.println("Esti in " + S);

    }
}