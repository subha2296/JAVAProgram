import java.util.Scanner;
public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first value :");
        int first_value = sc.nextInt();
        System.out.println("Enter the value of second value :");
        int second_value = sc.nextInt();
        System.out.println("sum of two numbers : " + add(first_value, second_value));
        System.out.println("Greater number : " + Math.max(first_value,second_value));
        System.out.println("power of the number : " + Math.pow(first_value,second_value));
        System.out.println("Smaller number : " + Math.min(first_value,second_value));


    }

    public static int add(int number1, int number2) {
        return (number1 + number2);
    }
}
