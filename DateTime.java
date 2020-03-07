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
    }
}