
public class Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("Hello world");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        int c = 50;
        c += 10;
        System.out.println(c);
        c -= 5;
        System.out.println(c);
        c *= 2;
        System.out.println(c);

        int d = 21;
        int e = 20;

        System.out.println(d < e);
        System.out.println(d > e);
        System.out.println(d == e);
        System.out.println(d != e);
        System.out.println(d >= e);
        System.out.println(d <= e);

        boolean studied = true;
        boolean land =true;
        boolean gold = false;

        System.out.println(studied || land || gold);
        System.out.println(!true);
        // System.out.println(studied&&land);
        // System.out.println(studied&&land);

        if (studied && land && gold) {
            System.out.println("I will marry her");
        }
        else if(studied && land || gold){
            System.out.println("marry her its ok");
        }
        else {
            System.out.println("I will not marry her");
        }

        int o=10;
        int k=20;

        if(o==k){
            System.out.println("both are equal");
            if(o==10){
                System.out.println("a is 10");
            }
            else {
                System.out.println("a is not 10");
            }

        }
        else {
            System.out.println("not equal");
        }

     String email ="abcd@gmail.com";
     String pwd="123";
     if(email.equals("abc@gmail.com") && pwd.equals("123")){
        System.out.println("logined");
     }
     else{
        System.out.println("not login");
     }

    }
}
