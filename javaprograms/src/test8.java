import java.util.Scanner;
public class test8 {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the length : ");
      int length=sc.nextInt();
      System.out.println("Enter the breadth : ");
      int breadth=sc.nextInt();
      System.out.println("Enter the height : ");
      int height=sc.nextInt();
        Box box=new Box(length,breadth,height);
        System.out.println("Area of the box : " + box.area());
        System.out.println("volume of the box : " + box.volume());
    }

}

class Box {
    int length;
    int breadth;
    int height;

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int area() {
        return length * breadth;
    }

    int volume() {
      return length * breadth * height;
   }

    }
