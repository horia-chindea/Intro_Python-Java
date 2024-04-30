public class Array {
    public static void main(String[] args) {
        // declarare si initializare
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {5, 7, 22, 45, 205};
        // contine mai multe elemente de acelasi tip
        // accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa
        // are proprietatea lenght care da dimensiunea array-ului

        System.out.println(elevi[2]);
        elevi[2] = "George";    // suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        System.out.println(elevi[1] + " " + elevi[4]);

        System.out.println(elevi.length + 7);

        // printez ultimul (nu se stie al catelea) element din matrice
        System.out.println("Ultimul element este: " + elevi[elevi.length-1]);

        // declarare si alocare de memorie pentru un array:
        int[] note = new int[5];    // => 0,0,0,0,0
        System.out.println(note[2]);
    }
}
