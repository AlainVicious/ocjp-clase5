import java.util.ArrayList;
import java.util.List;

/**
 * ArrayLists
 */
public class ArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<>();

        List<String> lista = new ArrayList<String>();
        List<String> lista2 = new ArrayList<>();

        al.add("a");
        al.add("e");
        al.add("i");
        al.add("o");
        al.add("u");
        
        al2.add("a");
        al2.add("e");
        al2.add("i");
        al2.add("o");
        al2.add("u");
        
        al.remove("a");
        al.remove(1);


        al.set(2, "z");

        System.out.println("es vacia? " + al.isEmpty());
        System.out.println("contiene \"z\"? " + al.contains("z"));
        System.out.println("el tamano es: " + al.size());
        System.out.println("lista 1 es igual a lista 2? " + al.equals(al2));
        System.out.println(al);

        al.clear();
        System.out.println(al);
    }
}