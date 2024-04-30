package oop;

public class Angajati {
    String nume;
    String prenume;
    String functie;
    double salariu;
    int vechime;

    // Constructor:
    public Angajati(String nume, String prenume, String functie, double salariu, int vechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    // Metode:
    public void descriereAngajat() {
        System.out.println("Numele: " + this.nume);
        System.out.println("Prenumele: " + this.prenume);
        System.out.println("Functia: " + this.functie);
        System.out.println("Vechime: " + this.vechime);
        System.out.println("Salariu: " + this.salariu);
        System.out.println();
    }

    // actualizare vechime angajat
    public void actualizareVechime() {
        System.out.println("Se actualizeaza vechimea pentru " + this.nume + " " + this.prenume +".");
        this.vechime += 1;
    }

    // marire salariu angajat in functie de vechime
    public void marireSalariu() {
        if (this.vechime <= 3) {
            this.salariu = this.salariu + 300;
        } else {
            this.salariu = this.salariu + 500;
        }
        System.out.println("S-a marit salariul pentru " + this.nume + " " + this.prenume);
    }
}
