package RecordTransaction;

public class addaccount {
    String account_number;
    String customer_age;
    String accountholder_name;
    String account_type;
    String ph_no;
    int amount;
    int transaction_amount;

    public addaccount(String accnumber, String age, String accountname, String accounttype, String phno) {
        accnumber = account_number;
        age = customer_age;
        accountname = accountholder_name;
        account_type = accounttype;
        ph_no = phno;
    }

    public void display_account() {
        System.out.println(account_number);
        System.out.println(customer_age);
        System.out.println(accountholder_name);
        System.out.println(account_type);
        System.out.println(ph_no);
    }

    public int credit(){
        amount=amount+transaction_amount;
        return amount;
    }

}