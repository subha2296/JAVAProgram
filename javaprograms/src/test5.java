import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value : ");
        int value = sc.nextInt();
        for(int i=0;i<value;i++){
            if(i==8)
                break;
            if(i==6)
                continue;
        System.out.print(i + " ");
        }
    }

    }
