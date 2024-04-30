public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";
        // strongly typed = trebuie sa specificam tipul de date

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Modelul cumparat este: " + modelMasina);

        // suprascrierea variabilelor:
        modelMasina = "XC 60 facelift";
        System.out.println("Dupa suprascriere, modelul devine: " + modelMasina);

        // declarare fara initializare:
        String proprietar;
        // initializare variabila initializata:
        proprietar = "Hori";
        System.out.println("Proprietar: " + proprietar);
        String nume;
        String prenume;
        nume = "Chindea";
        prenume = "Horia";
        // concatenare de stringuri
        System.out.println("Proprietar, cu nume si prenume: " + nume + " " + prenume);
        int varsta = 49;
        System.out.println("Varsta: " + varsta);


    }
}
