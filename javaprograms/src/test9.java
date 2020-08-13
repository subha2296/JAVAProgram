public class test9 {
        String acc_name;
        int age;
        String acc_type;
        String gender;
        int ph_no;

        test9(String name, int a , String type ,String g, int no) {
            acc_name = name;
            a = age;
            acc_type = type;
            gender = g;
            ph_no = no;
        }

        void display_account() {
            System.out.println(acc_name);
            System.out.println(age);
            System.out.println(acc_type);
            System.out.println(gender);
            System.out.println(ph_no);
        }
    }


