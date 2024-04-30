/*
Flow control:
- if; else;
    - evalueaza conditii si bifurca codul in functie de rezultatul acestei evaluari
 */

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Pornesc radio;");
        boolean piesa_faina = true;     // piesa-i faina?
        System.out.println("Ii faina piesa? => " + piesa_faina);
        // daca imi place piesa dau mai tare
        if (piesa_faina == true) {
            System.out.println("Dau mai tare radio;");
            System.out.println("Incep sa ma batzai penibil;");
            System.out.println("Pisicile se uita la mine nedumerite pana se termina piesa;");
        }
        System.out.println("Opresc radio;");

        // if; else
        int nr = 5;
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr +" este par.");
        } else {
            System.out.println("Numarul " + nr +" este impar.");
        }
        // verificare numar pozitiv:
        if (nr > 0) {
            System.out.println("Numarul " + nr + " este un numar pozitiv.");
        } else {
            System.out.println("Numarul " + nr + " nu este un numar pozitiv.");
        }
        System.out.println("Revin la radio;");
        // intorc pe dos valoarea variabilei piesa_faina
        if (piesa_faina == true) {
            piesa_faina = false;
        } else {
            piesa_faina = true;
        }
        System.out.println("Pornesc radio;");
        System.out.println("Ii faina piesa? => " + piesa_faina);
        if (piesa_faina == true) {
            System.out.println("Dau mai tare radio;");
            System.out.println("Incep sa ma batzai penibil;");
            System.out.println("Pisicile se uita la mine nedumerite pana se termina piesa;");
        } else {
            System.out.println("Ma stramb dezgustat;");
            System.out.println("Pisicile dorm in continuare linistite;");
        }
        System.out.println("Opresc radio;");

        // if; else if; else:
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora: ");
        int ora = sc.nextInt();
        if (ora < 0){
            System.out.println("Ora " + ora + " este invalida!");
        } else if (ora <=11) {
            System.out.println("Buna dimineata!");
        } else if (ora <=18) {
            System.out.println("Buna ziua!");
        } else if (ora <=21) {
            System.out.println("Buna seara!");
        } else if (ora <=24) {
            System.out.println("Noapte buna!");
        } else {
            System.out.println("Ora " + ora + " nu este valida");
        }

        // viteza masinii:
        System.out.println("Viteza masinii este: ");
        int viteza = sc.nextInt();
        if (viteza < 0) {
            System.out.println("Viteza invalida!");
        } else if (viteza == 0) {
            System.out.println("Masina stationeaza.");
        } else if (viteza <= 50) {
            System.out.println("Viteza de localitate.");
        } else if (viteza <= 90) {
            System.out.println("Viteza de drum national.");
        } else if (viteza <= 100) {
            System.out.println("Viteza de drum european.");
        } else if (viteza <= 130) {
            System.out.println("Viteza de autostrada.");
        } else if (viteza <= 160) {
            System.out.println("Viteza de amenda.");
        } else if (viteza <= 299) {
            System.out.println("Ti se ia carnetul, CLAR!");
        } else {
            System.out.println("Doar n-ai racheta!");
        }

        // flow control
        // switch
        System.out.println("Alege optiunea: ");
        int optiune = sc.nextInt();
        switch (optiune){
            case 0:
                System.out.println("Meniul anterior.");
                break;
            case 1:
                System.out.println("Limba romana");
                break;
            case 2:
                System.out.println("Limba engleza");
                break;
            default:
                System.out.println("Nu stiu ce-ti trebuie. Mai incearca!");
        }


    }   // inchide functia main
}   // inchide clasa
