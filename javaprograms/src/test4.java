import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value : ");
        int value = sc.nextInt();
        for(int i=1;i<=value;i++) {
                    System.out.println("5 * " + i + " = " + i*5);
        }
    }
    }