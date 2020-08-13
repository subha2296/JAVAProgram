
public class exception {
    public static void main(String[] args){
        try {
            System.out.println("hello");
            System.out.println(10 / 0);
            System.out.println("good day");
        } catch(ArithmeticException e) {
            e.printStackTrace();
            //System.out.println(10 / 2);
        }
            System.out.println("hi");


        }
    }

