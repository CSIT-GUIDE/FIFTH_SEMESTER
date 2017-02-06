public class Hetero {
    public static void main(String[] args) {
        int []patt1=new int[]{1,-1,-1,-1};
        int []patt2=new int[]{-1,1,-1,-1};
        int []patt3=new int[]{-1,-1,1,-1};
        int []patt4=new int[]{-1,-1,-1,1};
        int [][]patt5=new int[][]{{1,-1,-1},{1,-1,1},{-1,1,-1},{-1,1,1}};
        int [][]pair1=new int[4][3];
        int [][]pair2=new int[4][3];
        int [][]pair3=new int[4][3];
        int [][]pair4=new int[4][3];
        int [][]sum=new int[4][3];
        int []firstPattern=new int[]{1,-1,-1,-1};
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                pair1[i][j]=patt1[i]*patt5[0][j];
                pair2[i][j]=patt2[i]*patt5[1][j];
                pair3[i][j]=patt3[i]*patt5[2][j];
                pair4[i][j]=patt4[i]*patt5[3][j];
                sum[i][j]=pair1[i][j]+pair2[i][j]+pair3[i][j]+pair4[i][j];
            }
        }
        int []Ta=new int[4];
        int output[]=new int[4];
        for(int j=0;j<3;j++){
            for(int i=0;i<4;i++){
                Ta[j]+=firstPattern[i]*sum[i][j];
            }
            if(Ta[j]>0){
                output[j]=1;
            }
            else if(Ta[j]==0){
                output[j]=0;
            }
            else{
                output[j]=-1;
            }
        }
        System.out.println("\tThe pattern is: \n");
        for(int i=0;i<4;i++){
            System.out.print("\t"+firstPattern[i] + "  ");
        }
        System.out.println("\n");
        System.out.println("\tThe weight matrix is: \n");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t"+sum[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\tThe output is: \n");
        for(int j=0;j<3;j++){
            System.out.print("\t"+output[j]);
        }
        System.out.println("\n");
    }
}