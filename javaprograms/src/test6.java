import java.util.Scanner;
public class test6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of marks");
        char grade=sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Amazing");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You can do better next time");
                break;
            default:
                System.out.println("Invalid grade entered");
                break;

        }
    }
}
