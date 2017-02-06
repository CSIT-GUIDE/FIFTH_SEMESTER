package and.model;

/**
 * Created by Zephyr on 2/5/2015.
 */
public class Train {
    private int it;
    private int[][] ip1;
    private float[] weights;
    private int[] trainIp;

    public Train(){
        ip1= new int[2][4];
        weights=new float[2];
        it=0;
    }

    public Train(int[][] ip1, float[] weights) {
        this.ip1 = ip1;
        this.weights = weights;
    }

    public Train(int it,float[] weights) {
        this.it = it;
        this.weights = weights;
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public int[][] getIp1() {
        return ip1;
    }

    public void setIp1(int[][] ip1) {
        this.ip1 = ip1;
    }


    public float[] getWeights() {
        return weights;
    }

    public void setWeights(float[] weights) {
        this.weights = weights;
    }

    public void incrIt(){
        it++;
    }
}
