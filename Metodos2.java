/**
 * Metodos2
 */
public class Metodos2 {

    public static void main(String[] args) {

        metodo("1","2", "3", "4");
    }

    public static String prueba(int a) {
        if (a == 4)
            return "es 4";
        else
            return "no es 4";
    }
    
    public static void metodo(String argumentos){
        System.out.println("1 string");
    }

    public static void metodo(String... argumentos){
        System.out.println("varargs");
    }

    public static void metodo(String args, String args2, String args3){
        System.out.println("3 strings");
    }

    public static void metodo(int a, String... lista){

    }

    // public static void metodo(String almno1 ){}
    // public static void metodo(String almno1, String alumno2 ){}
    // public static void metodo(String almno1, String alumno2,String alumno3){}
    // public static void metodo(String almno1, String alumno2,String alumno3, String alumno4){}
    // public static void metodo(String almno1, String alumno2,String alumno3, String alumno4, String alumno5){}
    // public static void metodo(String almno1, String alumno2,String alumno3, String alumno4, String alumno5, String alumno6 ){}
    

    


}
