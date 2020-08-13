import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        do {
            System.out.println("Enter your first No.: ");
            a = sc.nextInt();
            System.out.println("Enter your second No.: ");
            b = sc.nextInt();
            System.out.println("The sum is: " + (a % b));
            System.out.println("Do you want to perform again: ");
        }while(a%b ==0);

    }
}



