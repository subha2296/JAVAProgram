import firstpackage.*;
import java.util.Scanner;

public class main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the customer name");
            String customer_name = sc.nextLine();
            System.out.println("Enter the customer id");
            int customer_id = sc.nextInt();
            System.out.println("Enter the phone number");
            int ph_no = sc.nextInt();
            firstclass first = new firstclass(customer_name, customer_id, ph_no);

            first.display_customer();

            int a[]=new int[3];int total=0;
            for(int i=1;i<a.length;i++) {
                System.out.println("Enter the items");
                String b = sc.next();
                product pd = new product();
                a[i] = pd.price(b);
            }
            for(int i=0;i<a.length;i++){
                total=total+a[i];
            }System.out.println(total);
            }
        }



