import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map = reprezentare de date in sistem chei valoare
        // exemplu: Gigel are nota 10, Costel are nota 9
        // este un array la care indexul are o eticheta data de noi. In exemplu, nota 10 are indexul Gigel

        // declararea unui map:
        // Map<String,Integer> map = new HashMap<String,Integer>();
        // sau:
        Map<String,Integer> note_elevi = new HashMap<>();

        // adaugare elemente
        note_elevi.put("Gigel" , 10);
        note_elevi.put("Costel" , 9);
        note_elevi.put("Ana" , 10);

        // declarare si initializare cu valori:
        Map<String, Integer> luni = new HashMap<>()
        {{
            put("Ianuarie", 1);
            put("Februarie", 2);
            put("Martie", 3);
        }};

        // aflarea notelor, in functie de nume
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        // suprascriere:
        note_elevi.replace("Costel", 7);
        System.out.println("Noua nota a lui Costel este " + note_elevi.get("Costel"));

        // aflam dimensiunea map-ului:
        System.out.println(note_elevi.size());

        // stergerea valorilor
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());
    }
}
