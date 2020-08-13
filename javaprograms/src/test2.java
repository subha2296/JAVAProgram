import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int value=sc.nextInt();
        int a=1,num=1;
        while (a<=value){
            num=a*num;
            a+=1;
            System.out.print(num);
            if(a<=value)
                System.out.print(",");
            else
            System.out.println();
        }
            System.out.println(num);
    }
}