import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ArrayLists
 */
public class ArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<>();
        
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
        
        //////////////
        //////////////
        //////////////

        System.out.println("\n\nlista a arreglos....\n\n");
        
        List<String> lista = new ArrayList<String>();
        List<String> lista2 = new ArrayList<>();
        
        lista.add("elemento1");
        lista.add("elemento2");

        Object[] arrStr = lista.toArray();

        System.out.println(arrStr);

        System.out.println("\n\narreglos a lista....\n\n");

        String[] arreglo = {"Hulk", "Spiderman"};
        List<String> lista3 = Arrays.asList(arreglo);

        System.out.println(lista3);

        System.out.println("\n\nsort\n\n");

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(55);
        listaNumeros.add(87);
        listaNumeros.add(23);
        listaNumeros.add(10);

        System.out.println(listaNumeros);

        Collections.sort(listaNumeros);

        System.out.println(listaNumeros);

    }
}