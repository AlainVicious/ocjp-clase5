/**
 * WrapperClasses
 */
public class WrapperClasses {

    public static void main(String[] args) {
        
        // boolean b = "true";

        boolean a = Boolean.parseBoolean("true");
        System.out.println(a);

        boolean b = Boolean.valueOf("TRUE");
        System.out.println(b);

        double dou = Double.parseDouble("1");
        System.out.println(dou);

    }
}