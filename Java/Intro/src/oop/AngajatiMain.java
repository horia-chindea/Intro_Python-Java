package oop;

public class AngajatiMain {
    public static void main(String[] args) {
        Angajati daniel = new Angajati("Popescu","Daniel","Consilier",5500,12);
        Angajati georgel = new Angajati("Ionescu","Georgel","Referent",2800,3);

        georgel.descriereAngajat();
        georgel.actualizareVechime();
        georgel.marireSalariu();
        georgel.descriereAngajat();

        daniel.descriereAngajat();
        daniel.marireSalariu();
        daniel.descriereAngajat();
    }
}
