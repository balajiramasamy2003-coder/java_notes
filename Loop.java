import java.util.Scanner;
public class Loop{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int len=sc.nextInt();
        int evencount=0,oddcount=0;
        int[] odd=new int[len];
        int[] even = new int[len];

        

        for(int i=0 ;i<len;i++){
            int j=sc.nextInt();
            if(j%2==0){
                even[evencount]=j;
                evencount++;
            }
            else{
                odd[oddcount]=j;
                oddcount++;
            }
        }
         for (int i = 0; i < evencount; i++) {
            System.out.println("even:"+even[i]);
        }
        for(int a:even){
            System.out.println("even:"+a);
        }
        for(int b:odd){
            System.out.println("even:"+b);
        }
    }
}