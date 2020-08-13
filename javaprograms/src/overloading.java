public class overloading {
    public static void main(String[] args){
        int a[]=new int[]{10,20,30,40,50};
        for (int i=0;i<a.length;i++){
            if(a[i]==30)
                continue;
            System.out.println(a[i]);
        }

    }
}
