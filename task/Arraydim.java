public class Arraydim {
    public static void main(String[] args) {
        // int[][][] arr = {{{2,1,4,5},{0,1,5,6},{0,7,8,9}}};
        // for(int i=0;i<arr.length;i++){
        //     for (int j = 0; j<arr.length;j++) {
        //         for(int k=0;k<arr.length;k++){
        //              System.out.println(arr[i][j][k]+" "+i+j+k);
        //         }
        //     }
        // }

        int[][][][] arr={{{{2,1,3,4},{5,6,7,8}},{{34,79,85},{43,55,65}}}};
        int max=0,smax=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    for(int q=0;q<arr[i][j][k].length;q++){
                        // System.out.println(arr[i][j][k][q]+"  "+i+j+k+q);
                        int num=arr[i][j][k][q];
                        if(num>max){
                            smax=max;
                            max=num;
                        }
                        else if(num>smax && smax!=max){
                            smax=max;
                            max=num;
                        }
                    }
                }
            }
        }
        System.out.println(smax);
    }
}