public class Pattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                if(j==(n/2)){
                System.out.print("*");
            }
            else if(j%2==0){
                System.out.print("*");
            }
            else{
                System.out.print("");
            }
        }
        }
    }
}