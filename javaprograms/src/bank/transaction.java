package bank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class transaction {
    long amount;
    String card;
    String date1;
    String date2;

    public long debit(long amount,String card,String date1,String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        long num = ChronoUnit.MONTHS.between(d1,d2);
        if(amount >10000) {
            if (card.equals("greencard"))
                return (amount - (30 * num));
            else if (card.equals("credit"))
                return (amount - (50 * num));
            else
                return amount;
        }
        else
            return (amount - (200 * num));
    }
}
