import RecordTransaction.addcustomer;
import RecordTransaction.addaccount;
import RecordTransaction.transactionrecords;
import java.util.Scanner;

public class datebaseconnetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;
do {
    int a = sc.nextInt();
    switch (a) {
        case 1:
            System.out.println("Enter the customer details");
            System.out.println("Enter the customer name");
            String customer_name = sc.next();
            System.out.println("Enter the customer age");
            String customer_age = sc.next();
            System.out.println("Enter the customer ID");
            String customer_ID = sc.next();
            System.out.println("Enter the customer gender");
            String gender = sc.next();
            System.out.println("Enter the customer ph.no");
            String ph_no = sc.next();
            addcustomer customer = new addcustomer(customer_name, customer_age, customer_ID, gender, ph_no);
            customer.display_customer();
            break;

        case 2:
            System.out.println("Enter the account number");
            String account_number = sc.next();
            System.out.println("Enter the account holder age");
            String age = sc.next();
            System.out.println("Enter the account holder name");
            String account_name = sc.next();
            System.out.println("Enter the account type");
            String account_type = sc.next();
            System.out.println("Enter the account holder ph.no");
            String phone_no = sc.next();
            addcustomer add = new addcustomer(account_number, age, account_name, account_type, phone_no);
            add.display_customer();
            break;

            case 3:
               System.out.println("Enter the debit account");
               long debit_account = sc.nextInt();
               System.out.println("Enter the credit account");
               long credit_account = sc.nextInt();
               System.out.println("Enter the transaction amount");
               long transaction_amount = sc.nextInt();
                transactionrecords records = new transactionrecords();
                String trans_type = sc.next();
                if(trans_type.equals("debit"))
                    System.out.println(records.Debit_transaction());
                else if(trans_type.equals("credit"))
                    System.out.println(records.credit_transaction());
                break;
            /*case 4:
                accountstatement statement = new accountstatement();
                statement.miniStatement();
                break;*/
    }repeat = sc.next();
}while(repeat.equals("do")) ;
    }

}
