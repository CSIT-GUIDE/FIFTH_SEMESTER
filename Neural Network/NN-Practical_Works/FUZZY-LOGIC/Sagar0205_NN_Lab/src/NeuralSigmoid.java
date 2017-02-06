import java.util.Scanner;

/**
 * Created by linuxsagar on 7/8/15.
 */
public class NeuralSigmoid {

    public static void main(String[] args) {
        int[] weights = {1,1,1,1};
        double[] h1 = new double[3];
        double[] h2 = new double[3];
        double[] oP = new double[4];

        Scanner inpScanner = new Scanner(System.in);
        int[] inp1 = new int[4];
        int[] inp2 = new int[4];

        System.out.println("Enter input1");
        for (int i = 0; i < 4; i++) {
            inp1[i] = inpScanner.nextInt();
        }

        System.out.println("Enter input2");
        for (int i = 0; i < 4; i++) {
            inp2[i] = inpScanner.nextInt();
        }



        for (int i = 0; i < 3; i++) {
            double temp = 1/(1+Math.exp(-(i-0.5)));
            h1[i] = temp;
        }

        for (int i = 0; i < 3; i++) {
            double temp = 1/(1+Math.exp(-(i-1.5)));
            h2[i] = temp;
        }


        double oP1 = Math.abs(h2[0]-h1[0]);
        double oP2 = Math.abs(h2[1]-h1[1]);
        double t1Output = 1/(1+Math.exp(-(oP1-0.2)));
        double t2Output = 1/(1+Math.exp(-(oP2-0.2)));


        for (int i = 0; i < 4; i++) {
            if(i==0){
                oP[i]=t1Output;
            }
            if(i==1){
                oP[i]=t2Output;
            }
            if(i==2){
                oP[i]=t2Output;
            }
            if(i==3){
                oP[i]=t1Output;
            }
        }


        System.out.println("************OUTPUT************");
        for (int i = 0; i < oP.length; i++) {
            if (oP[i]>0.5){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }


    }
}
