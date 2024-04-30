public class While {
    public static void main(String[] args) {
        // while = loop (ciclu repetitiv), adica o zona de cod ce se repeta atata timp cat o anumita conditie este true
        // masina merge atata timp cat are comustibil
        int litri_combust = 10;
        while (litri_combust > 0) {
            System.out.println("Mai avem " + litri_combust + " litri de combustibil. Acceleram! Consumam combustibil!");
            // aprindem beculetul daca avem 3 litri de combustibil sau mai putin:
            if (litri_combust <= 3) {
                System.out.println("Se aprinde beculetul rosu! Alimenteaza cu combustibil!");
            }
            litri_combust = litri_combust - 1;
           if (litri_combust == 0) {
               System.out.println("Ti s-a terminat combustibilul!");
           }
        }
        System.out.println("Masina se opreste din lipsa de combustibil!");
    }
}
