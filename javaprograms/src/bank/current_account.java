package bank;
import java.util.*;
public class current_account {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        long amount=sc.nextLong();
        String card = sc.next();
        String date1 = sc.next();
        String date2 = sc.next();
        try {
            transaction trans = new transaction();
            System.out.println(trans.debit(amount,card,date1,date2));
        }catch(Exception ex){
            System.out.println("error");
        }
       /* System.out.println("Enter the debit account");
        int debit_account = sc.nextInt();
        System.out.println("Enter the credit account");
        int credit_account = sc.nextInt();
        System.out.println("Enter the transaction amount");
        int transaction_amount = sc.nextInt();
        System.out.println("credited account : "+ (credit_account = credit_account + transaction_amount));
        System.out.println("debited account : " + (debit_account = debit_account - transaction_amount));
*/
    }
}
