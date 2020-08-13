import java.util.Scanner;
public class shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal : ");
        float principal = sc.nextInt();
        System.out.println("Enter the rate of interest");
        float rateofinterest = sc.nextFloat();
        System.out.println("Enter the time period");
        int timeperiod = sc.nextInt();

        interest interest_value = new interest(principal,rateofinterest,timeperiod);
        System.out.println(interest_value.fdinterest(principal,rateofinterest,timeperiod));
    }
}