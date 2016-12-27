import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.time.DayOfWeek.FRIDAY;

/**
 * Created by Gil on 21-Dec-16.
 */
public class NewYear {

    public static void main(String[] args) throws InterruptedException, IOException {

        LocalDate startDate = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2018, Month.JANUARY, 1);

        int i = 0;

        while (startDate.isBefore(endDate)){
            if (startDate.getDayOfWeek() == FRIDAY && startDate.getDayOfMonth() == 13){
                i++;
                System.out.println(startDate.toString());
            }
            startDate = startDate.plusDays(1);
        }

        System.out.println(i);

        LocalDateTime newYear = LocalDateTime.of(2017, Month.JANUARY, 1, 0, 0, 0);

//        while (true) {
//            LocalDateTime now = LocalDateTime.now();
//            System.out.println(ChronoUnit.DAYS.between(now, newYear) + " days " +
//                    ChronoUnit.HOURS.between(now, newYear) % 24 + " hours " +
//                    ChronoUnit.MINUTES.between(now, newYear) % 60 + " minutes " +
//                    ChronoUnit.SECONDS.between(now, newYear) % 60 + " seconds ");
//            Thread.currentThread().sleep(1000);
//        }


    }
}
