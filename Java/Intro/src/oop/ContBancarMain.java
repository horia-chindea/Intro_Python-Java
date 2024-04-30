package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // initializam obiecte de tip ContBancar
        // acestea sunt instante ale clasei ContBancar
        // ne aducem aminte: String nume = ...
        ContBancar cont1 = new ContBancar("Horia Chindea","RO001");
        ContBancar cont2 = new ContBancar("Anca Chindea","RO002");
//        System.out.println("Titular cont1: " + cont1.titularCont);
//        System.out.println("IBAN-ul cont1: " + cont1.iban);
//        System.out.println("Soldul cont1: " + cont1.sold);
//        System.out.println("cont1 activ?: " + cont1.activ);
//        System.out.println("Titular cont2: " + cont2.titularCont);
//        System.out.println("IBAN-ul cont2: " + cont2.iban);
//        System.out.println("Soldul cont2: " + cont2.sold);
//        System.out.println("cont2 activ?: " + cont2.activ);
        // apelam metoda descriere()
//        cont1.descriere();
//        cont2.descriere();

        // apelam metoda activareCont()
        cont1.activareCont(3456);
        cont2.activareCont(1111);
        cont2.activareCont(2222);
        cont2.activareCont(3456);

        // alimentam contul:
        cont1.alimentareCont(2000.50);
        cont2.alimentareCont(2500.35);
        cont2.alimentareCont(2400.5);

        // plata cu cardul
        // negative testing:
        cont1.plataCard(25000);
        // pozitiv cu suma exacta:
        cont1.plataCard(2000.50);
        // pozitiv de doua ori:
        cont2.plataCard(1200.75);
        cont2.plataCard(44.26);

        cont1.interogareSold();
        cont2.interogareSold();
    }


}
