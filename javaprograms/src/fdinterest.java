import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class fdinterest {
    float depositamount;
    float rateofinterest;
    String payout;
    String date1;
    String date2;

    public float maturity_amount(float depositamount,float rateofinterest,String payout,String date1,String date2) {

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        long num = ChronoUnit.MONTHS.between(d1,d2);

        float formula = (depositamount * (25 + rateofinterest) * 4 * num ) / (12 *25) ;
            //double formula=(depositamount * (Math.pow(((25 + rateofinterest)/25),(4 * num))));

        if (payout.equals("monthly")) {
            float fd = (formula / 12);
            return fd;
        }
       else if (payout.equals("quaraterly")) {
            float fd = (formula / 3);
            return (fd);
        }
        else if (payout.equals("halfyearly")) {
            float fd = (formula / 2);
            return (depositamount+ fd);
        }
        else {
            return (formula);
        }
    }

}


