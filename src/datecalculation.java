import java.time.*;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class datecalculation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String date1 = sc.next();
        String date2 = sc.next();
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        long numDays = ChronoUnit.MONTHS.between(d1,d2);
        System.out.println(numDays);
    }
}
