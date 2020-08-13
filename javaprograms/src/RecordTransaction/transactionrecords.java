package RecordTransaction;

public class transactionrecords extends addaccount {
    long debit_account_no;
    long credit_account_no;
    long transaction_amount;
    String start_date;
    String end_date;

    public long Debit_transaction() {
        debit_account_no = debit_account_no - transaction_amount;
        return debit_account_no;
    }

    public long credit_transaction() {
        credit_account_no = credit_account_no + transaction_amount;
        return credit_account_no;
    }


}