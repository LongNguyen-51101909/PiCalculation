import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nqlong on 14-Sep-16.
 */
public class PiCalculation {
    public static void main(String[] args) {
        double piQuarter = 0;

        //step 1
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1<<30; i++) {
            piQuarter = piQuarter + Math.pow(-1, i) / (2*i + 1);
            System.out.println(i);
        }
        // step 2
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println("pi: " + piQuarter * 4);

    }

}
