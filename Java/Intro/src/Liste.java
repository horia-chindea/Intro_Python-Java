import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();    // click si Alt + Enter pe List si pe ArrayList, pentru importurile de mai sus (apar automat)
        // listele au o dimensiune dinamica
        // functioneaza pe tehnologia array
        // La modificarea listei, se distruge vechiul array (garbage collector) si se creaza unul nou, cu datele actualizate

        // adaugare elemente in lista:
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se acceseaza un element al listei:
        String fruct = fructe.get(0);
        System.out.println(fruct);

        // aflarea indexului unui element
        fruct = "mar";
        System.out.println("Indexul elementului " + fruct +": " + fructe.indexOf(fruct));

        // determinarea faptului daca lista este sau nu goala:
        System.out.println("Lista este goala? " + fructe.isEmpty());
        if (fructe.isEmpty()){
            System.out.println("Ramanem flamanzi, astazi!");
        } else {
            System.out.println("Ne indopam cu fructe!");
        }
        // sau:
        // golim lista:
        System.out.println("Golim lista;");
        fructe.clear();
        if (!fructe.isEmpty()){
            System.out.println("Ne indopam cu fructe!");
        } else {
            System.out.println("Ramanem flamanzi, astazi!");
        }
        // repopulam lista:
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // aflarea dimensiunii unei liste
        System.out.println("Numarul de elemente din lista: " + fructe.size());

        // scoaterea unui element
        fructe.remove("banana");

        // listarea elementelor unei liste
        System.out.println(Arrays.toString(fructe.toArray()));
        // sau, mai simplu, asa:
        System.out.println(fructe);

        // declaram si initializam cu valori o lista IMUTABILA (nu se pot adauga sau sterge elemente):
        // List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        List<Integer> list = Arrays.asList(new Integer[]{6, 12, 47});
        System.out.println(Arrays.toString(list.toArray()));

        // declaram o lista dinamica
        String[] flori = {"Ageratum", "Alium", "Poppy", "Catmint"};
        List<String> listaFlori = new ArrayList<>(Arrays.asList(flori));
        listaFlori.add("Rose");
        System.out.println(Arrays.toString(listaFlori.toArray()));

        // aflam indexul elementului Poppy:
        int poppy_index = listaFlori.indexOf("Poppy");
        // stergem ce e in acea pozitie
        listaFlori.remove(poppy_index);
        System.out.println(Arrays.toString(listaFlori.toArray()));

        // stergem in functie de valoarea elementului
        listaFlori.remove("Catmint");
        System.out.println(Arrays.toString(listaFlori.toArray()));

        // merge printat si mai simplu:
        System.out.println(listaFlori);

        // mai exista:
        // SET => lista de elemente in care fiecare element apare o singura data
        // Coada => pers1, pers2, pers3 => structura de tip FIFO = primul venit - primul servit
        // Stiva => structura de tip LIFO => ultimul venit - primul plecat
    }
}
