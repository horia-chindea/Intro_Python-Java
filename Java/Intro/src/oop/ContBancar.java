package oop;

public class ContBancar {
    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // definim o clasa: este un tip nou
    // clasa este definitia unui concept
    // clasa este "reteta" la o MANCARE.
    // exemplu: clasa Car

    // definim un obiect: este instanta unei clase
    // obiectul este MANCAREA in sine
    // exemplu: obiect de tip Car

    // "reteta" (clasa) contine fields, proprietati, atribute. Acestea reprezinta, in fapt, acelasi lucru.
    // fields = proprietati = atribute
    // Aceste field-uri sunt, de fapt, variabilele.
    // exemple: culoare a obiectului de tip Car, marca obiectului, modelul obiectului, consumul obiectului, pretul obiectului

    // definim o metoda: este o actiune ce poate fi facuta de obiecte
    // metodele, sunt, de fapt, functii
    // exemple: accelereaza(); franeaza(); claxoneaza(); deschideUsa();

    // Un cont bancar are, in materie de atribute (fielduri, proprietati):
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 3456;
    int incercariActivare = 0;

    // constructor = functie are rolul de a impune date de start.
    // ca si * din formularele de completat (required fields).
    // Constructorul (click dr. - Generate - Constructor - selectare simpla fielduri required):


    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode = actiunile clasei
    // metoda care sa descrie contul:
    public void interogareSold() {
        System.out.println("Titular: " + this.titularCont);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Soldul: " + this.sold);
        System.out.println("Activ?: " + this.activ);
        System.out.println("Incercari gresite: " + this.incercariActivare);
        System.out.println();
        System.out.println();
    }
//    public void activareCont() {
//        // modifica starea contului (variabila activ) in true
//        this.activ = true;
//        System.out.println("Contul a fost activat!");
//        System.out.println();
//        System.out.println();
//    }
    // activam contul doar daca pin=ul este corect:
    public void activareCont(int pinUtilizator) {
        System.out.println("Buna, " + this.titularCont + "!");
        if(pinUtilizator == this.pin) {
            this.activ = true;
            System.out.println("Cont activat cu succes!");
        } else {
            System.out.println("PINul introdus nu este corect!");
            // this.incercariActivare += 1;
            this.incercariActivare ++;
        }
        System.out.println();
    }
    public void alimentareCont(double sumaDepusa) {
        // la ce aveam in cont (this.sold) se adauga suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna, " + this.titularCont + "!");
        System.out.println("Depunere cu succes suma de " + sumaDepusa + "! Aveti in cont suma de " + this.sold);
        System.out.println();
    }

    public void plataCard(double sumaCheltuita) {
        // din ce aveam in cont (this.sold) se scade suma retrasa
        // se poate cheltui doar in limita soldului
        System.out.println("Buna, " + this.titularCont + "!");
        if (sumaCheltuita <= this.sold) {
            this.sold = this.sold - sumaCheltuita;
            System.out.println("Ai cheltuit " + sumaCheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
        System.out.println();
    }


    // La curs, cei patru piloni ai OOP:
    // inheritance = mosteniri
    // polymorphism = polimorfismul
    // encapsulation = encapsularea
    // abstraction = abstractizarea

}
