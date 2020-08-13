import java.util.Scanner;
public class  accountdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals("accountopening")) {
            System.out.println("Enter the account name");
            String acc_name = sc.next();
            System.out.println("enter the age");
            int age = sc.nextInt();
            System.out.println("Enter the account type");
            String acc_type = sc.nextLine();
            System.out.println("Enter the gender");
            String gender = sc.next();
            System.out.println("enter the ph_no");
            int ph_no = sc.nextInt();

            test9 test = new test9(acc_name, age, acc_type, gender, ph_no);
            test.display_account();
        }
            else
            System.out.println("Enter the principal :");
            float principal = sc.nextInt();
            System.out.println("Enter the rateofinterest :");
            float rateofinterest = sc.nextFloat();
            System.out.println("Enter the timeperiod :");
            float timeperiod = sc.nextFloat();

            //String interest_type = sc.next();
            //(interest_type.equals("savinginterest")) {
                interest interest_value = new interest(principal, rateofinterest, timeperiod);
                System.out.println(interest_value.savinginterest(principal, rateofinterest, timeperiod));
           // } else if (interest_type.equals("fdinterest")) {
               // interest interest_value = new interest(principal, rateofinterest, timeperiod);
                System.out.println(interest_value.fdinterest(principal, rateofinterest, timeperiod));
           // }

        }
    }
