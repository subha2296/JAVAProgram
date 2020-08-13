import java.util.Scanner;
public class fdinterestrun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a;
        do {
            System.out.println("Enter the deposit amount");
            long deposit = sc.nextInt();
            System.out.println("Enter rateofinterest");
            long rate = sc.nextInt();
            System.out.println("Enter the payout method");
            String payout = sc.next();
            System.out.println("Enter the date1 : ");
            String date1 = sc.next();
            System.out.println("Enter the date2 : ");
            String date2 = sc.next();

            fdinterest fd = new fdinterest();
            System.out.println(fd.maturity_amount(deposit, rate, payout,date1,date2));
            a=sc.next();
        } while(a.equals("a"));

    }
}
