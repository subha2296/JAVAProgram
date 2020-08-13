import java.util.*;
public class test {
    public static void main(String[] args){
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age<21)
            System.out.println("Ineligible");
        else if((age>21) && age<55)
            System.out.println("saving account");
        else if(age>55)
            System.out.println("senior citizen account");

    }
}
