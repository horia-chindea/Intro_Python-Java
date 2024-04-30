import java.util.Scanner;

public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu se pot folosi spatii in numele functiei
    // nu se poate defini o functie in alta functie
    // variabilele definite intr-o functie "traiesc" doar in acea functie.

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns (nu are return)
    // nu are parametri:
    public static void printGreeting() {
        // public: se poate accesa din orice clasa;
        // static: nu lucram im mod de programare bazata pe obiecte
        // void: nu returneaza nimic
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul cu numele sau
    // nu ne da niciun raspuns (nu are return)
    // are nevoie de parametri:
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua, " + nume + " " + prenume + "! Bine ati venit!");
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns (suma numerelor). Va avea return.
    // ce tip de date va avea raspunsul? In functie de asta cream functia;
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoare lui pi
    // ne da un raspuns (valoarea lui pi). Va avea return.
    // ce tip de date va avea raspunsul? double;
    // nu are nevoie de parametri
    public static double piValue() {
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
        // sau double pi = 3.14;
        // return pi;
    }

    // aria dreptunghiului:
    public static int ariaDreptunghi(int lungime,int latime) {
        int aria = lungime * latime;
        return aria;
    }

    // aria cercului:
    public static double ariaCercului(int raza) {
        double ariaC = piValue() * raza * raza;
        return ariaC;
    }

    // numarul de caractere din nume+prenume
    public static int nrCaractere(String nume, String prenume) {
        int lNume = nume.length();
        int lPrenume = prenume.length();
        int nrCaractere = lNume + lPrenume;
        return (nrCaractere);
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting();    // se apeleaza functia

        // intra clientul 2
        printGreeting();    // Ctrl + click pe functie ne duce la corpul functiei

        // apelam o functie cu parametri, oferind argumente:
        printGreetingByName("Chindea","Horia");
        printGreetingByName("Chindea","Anca");
        printGreetingByName("Chindea","Calin");

        System.out.println(mediaNr(3, 3, 5));
        double media1 = mediaNr(6546456,977665,32435);
        double media2 = mediaNr(6556,9765,3465);
        double media3 = mediaNr(6546,975,4465);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());

        // aria unui dreptunghi:
        Scanner sc = new Scanner(System.in);
        System.out.println("Lungimea dreptunghiului: ");
        int lungime = sc.nextInt();
        System.out.println("Latimea dreptunghiului: ");
        int latime = sc.nextInt();
        if (lungime>=latime) {
            int aria = ariaDreptunghi(lungime,latime);
            System.out.println("Aria unui dreptunghi avand lungimea de " + lungime + " si latimea de " + latime + " este de " + aria + ".");
        } else {
            System.out.println("EROARE! Lungimea nu poate fi mai mica decat latimea!");
        }

        // aria cercului:
        System.out.println("Raza cercului: ");
        int raza = sc.nextInt();
        System.out.println("Aria cercului cu raza de " + raza + " este de " + ariaCercului(raza) + ".");

        // numarul de caractere din nume+prenume
        System.out.println("Introduceti numele: ");
        String nume = sc.nextLine();
        System.out.println("Introduceti prenumele: ");
        String prenume = sc.nextLine();
        // DE CE LA RULARE SARE DIRECT SA CEARA PRENUMELE SI NU SE OPRESTE LA NUME ???
        int nrCaractere = nrCaractere(nume,prenume);
        System.out.println("Numele si prenumele " + nume + prenume + " contin impreuna un numar de " + nrCaractere + " caractere.");

    }
}
