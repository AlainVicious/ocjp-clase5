package MetodosAcceso.Paquete1;

/**
 * Clase1
 */
public class Clase1 {
    private String cadenaPrivada;
    float flotanteDefault;
    protected int numeroProtegido;
    public boolean boleanoPublico;

    public Clase1(){
        boolean b = boleanoPublico;
        int n = numeroProtegido;
        float f = flotanteDefault;
        String str = cadenaPrivada;
    }
}