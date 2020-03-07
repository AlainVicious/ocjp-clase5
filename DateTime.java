// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

import java.time.*;

/**
 * DateTime
 */
public class DateTime {

    public static void main(String[] args) {
        // System.out.println(LocalDate.now());
        // System.out.println(LocalTime.now());
        // System.out.println(LocalDateTime.now());

        LocalDate fecha = LocalDate.of(2020 ,4, 1);
        LocalDate fecha2 = LocalDate.of(2020 ,Month.APRIL, 1);

        System.out.println(fecha);
        System.out.println(fecha2);

        fecha = fecha.plusDays(5);
        System.out.println(fecha);

        fecha = fecha.plusWeeks(1);
        System.out.println(fecha);

        fecha = fecha.plusMonths(5);
        System.out.println(fecha);

        fecha = fecha.plusYears(5);
        System.out.println(fecha);



        LocalTime hora1 = LocalTime.of(10, 30);
        LocalTime hora2 = LocalTime.of(10, 30, 40);
        LocalTime hora3 = LocalTime.of(10, 30, 40, 100);

        System.out.println(hora1);
        System.out.println(hora2);
        System.out.println(hora3);



        System.out.println("\n\nperiodos\n\n");

        LocalDate inicio = LocalDate.of(2020, Month.JANUARY, 1); // deinimos fecha inicio
        LocalDate fin = LocalDate.of(2020, Month.DECEMBER, 30); // definimos fecha fin
        Period periodo = Period.ofMonths(1); // definimos cuanto de va a hacer el incremento enperiodo
        LocalDate hasta = inicio; // inicializamos nuestro iterador

        while (hasta.isBefore(fin)) {
            System.out.println("Pagar recibo: " + hasta); // imprimo fecha en curso iterada
            hasta = hasta.plus(periodo); // le sumo el lapso de periodo que en este caso es un mes 
        }

    }
}