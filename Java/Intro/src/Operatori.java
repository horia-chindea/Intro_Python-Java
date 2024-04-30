/*
Recapitulare:
- variabile
- principalele tipuri de date:
    char - un singur caracter (nu apare in Python)
    string - un sir de caractere
    int - numar intreg
    float / double - numar zecimal, recomandat double in Java
    boolean - true / false

Operatori:
- aritmetici: +; -; *; /; % (modulo = restul unei impartiri);
- de comparare: <; >; ==; !=; >=; <=;
- logici: &&; ||; ! (not = inversa);
 */
public class Operatori {
    public static void main(String[] args) {
        int a = 5;      // declarare && initializare
        int b = 7;
        System.out.println("a = " + a +"; b = " + b);
        a = b;    // suprascriere: a preia valoarea lui b
        System.out.println("Dupa suprascriere: a = " + a +"; b = " + b);
        a = 5;
        System.out.println("Dupa revenire (iarasi suprascriere): a = " + a +"; b = " + b);

        // Operatori aritmetici:
        System.out.println("a + b = " + a + b); // concateneaza
        System.out.println("a + b = " + (a + b));   // calculeaza
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // => atentionare, nu calculeaza valori subunitare
        System.out.println("b / a = " + (b / a));   // rezultatul este calculat ca int (1.8 => 1)
        System.out.println("b % a = " + (b % a));

        // Operatori de comparare:
        System.out.println("12 este mai mare decat b ("+b+")? => " + (12 > b)); // rezultat boolean
        System.out.println("12 este mai mic decat b ("+b+")? => " + (12 < b));
        System.out.println("a ("+a+") este mai mare decat b ("+b+")? => " + (a > b));
        System.out.println("a ("+a+") este mai mic decat b ("+b+")? => " + (a < b));
        b = 12;
        System.out.println("12 este mai mare decat b ("+b+")? => " + (12 > b)); // rezultat boolean
        System.out.println("12 este mai mic decat b ("+b+")? => " + (12 < b));
        System.out.println("12 este mai mare sau egal decat b ("+b+")? => " + (12 >= b)); // rezultat boolean
        System.out.println("12 este mai mic sau egal decat b ("+b+")? => " + (12 <= b));
        b=7;
        System.out.println("a ("+a+") este diferit de b ("+b+")? => " + (a != b));
        a=7;
        System.out.println("a ("+a+") este diferit de b ("+b+")? => " + (a != b));
        System.out.println("a ("+a+") este egal cu b ("+b+")? => " + (a == b));
        a=5;
        System.out.println("a ("+a+") este egal cu b ("+b+")? => " + (a == b));

        // Operatori logici:
        System.out.println("7 mai mare decat a ("+a+") si 7 mai mare decat b ("+b+")? => " + (7 > a && 7 > b)); // => false
        System.out.println("7 mai mare decat a ("+a+") si 2 mai mic decat b ("+b+")? => " + (7 > a && 2 < b)); // => true
        System.out.println("7 mai mare decat a ("+a+") sau 7 mai mare decat b ("+b+")? => " + (7 > a || 7 > b)); // => true
        System.out.println("7 mai mare decat a ("+a+") sau 7 mai mic decat b ("+b+")? => " + (7 > a || 2 < b)); // => true
        System.out.println("Inversa lui \"7 mai mare decat a ("+a+") sau 7 mai mare decat b ("+b+")\". => " + !(7 > a || 7 > b)); // => false
    }
}
