import java.util.Scanner;

public class example
{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a :");

        int a=sc.nextInt();

        System.out.println("Enter the value of b :");

        int b=sc.nextInt();

        System.out.println("Adding of two number : "+(a+b));

        System.out.println("Subtracting of two number : "+ (a-b));

        System.out.println("multiplication  of two number : "+ (a*b));

        System.out.println("division of two number : "+ (a/b));

        System.out.println("modulo of two number : "+ (a%b));

        System.out.println("pre-increment of number : "+ (a++) );

        System.out.println("post-increment of number : "+ (++a));

        System.out.println("pre-decrement of number : "+ (a--) );

        System.out.println("post-decrement of number : "+ (--a));

    }
}
