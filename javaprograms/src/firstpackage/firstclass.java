package firstpackage;
import java.lang.String;
public class firstclass {
    String customer_name;
    int customer_id;
    int ph_no;

    public firstclass(String name, int id, int no) {
        customer_name = name;
        customer_id = id;
        ph_no = no;
    }

    public void display_customer() {
        System.out.println(customer_name);
        System.out.println(customer_id);
        System.out.println(ph_no);
    }


}