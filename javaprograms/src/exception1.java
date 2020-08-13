public class exception1 {
    public static void main(String[] args){
        /*try{
            a();
        }catch(ArithmeticException e ){
            System.out.println("exception error");
        }
    }
    public static void a(){
        b();
    }
    public static void b(){
        System.out.println(10/0);
    }*/
        try {
            System.out.println("1.hello");
        }
        catch(Exception e){
            System.out.println("2.good day");
                try{
                    System.out.println(10/0);
                }
                catch(ArithmeticException a) {
                    System.out.println("4.happy");
                }
        }
        finally{
            System.out.println("5.today");
        }

}
}