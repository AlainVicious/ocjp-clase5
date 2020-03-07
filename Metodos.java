/**
 * Metodos
 */
public class Metodos {
    public static void main(String[] args) {
        Telefono t1= new Telefono();
        System.out.println(t1.numeroSerie);
        System.out.println(t1.telefonoId);

        Telefono t2 = new Telefono();
        System.out.println(t2.numeroSerie);
        System.out.println(t2.telefonoId);

        Telefono t3 = new Telefono();
        System.out.println(t3.numeroSerie);
        System.out.println(t3.telefonoId);
        
        Telefono t4 = new Telefono();
        System.out.println(t4.numeroSerie);
        System.out.println(t4.telefonoId);
    }
}
class Telefono {
    public int numeroSerie;
    public static int telefonoId;
  
    public Telefono(){
         generarSerie();
    }

    private void generarSerie() {
        numeroSerie = ++telefonoId;
    }
}
