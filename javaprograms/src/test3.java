public class test3 {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(1,2));
        display();
        display("subha");
        //display("subha",23);
    }

    public static int add(){
        return (1+2);
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void display(){
        System.out.println("hello");
    }
    public static void display(String name){
        System.out.println(name);
    }
    //public static int display(String name,String age) {
        //return (name + age);

}
