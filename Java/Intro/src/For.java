public class For {
    public static void main(String[] args) {
        // for = loop
        // de unde incepem?; pana unde mergem?; pasul de parcurgere;
        // problema: printam 101 dalmatieni
        for (int i = 1; i<=101; i++) {
            System.out.println("Dalmatianul cu numarul " + i);
        }

        // for ne ajuta si sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 5, 9};
        for (int i = 0; i < numere.length; i++) {
            System.out.println("Elementul cu indexul " + i + " are valoarea " + numere[i]);
        }
        // parcurgerea din 2 in 2:
        int[] numere2 = {3, 7, 5, 9, 4, 8, 6};
        for (int i = 0; i < numere2.length; i+=2) {
            System.out.println("Elementul cu indexul " + i + " are valoarea " + numere2[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere2) {
            System.out.println("Numarul este: " + numar);
        }
        // for (String culoare : culori)
        String[] culori = {"alb","rosu","galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma numerelor din array:
        int s = 0;
        for (int numar : numere2) {
            s = s + numar;
        }
        System.out.println("Suma este: " + s);
    }
}
