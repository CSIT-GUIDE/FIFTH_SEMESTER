package model;

/**
 * Created by Zephyr on 2/18/2015.
 */
public class Test {
    private float error;
    private int[] input;
    private float[] weight;
    private float output;
    
    public Test(){
        error=0;
    }

    public Test(float[] weight) {
        this.weight = weight;
    }

    public Test(int[] input, float[] weight) {
        this.input = input;
        this.weight = weight;
    }

    public Test(float output, float error){
        this.output=output;
        this.error=error;
    }

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    public float[] getWeight() {
        return weight;
    }

    public void setWeight(float[] weight) {
        this.weight = weight;
    }

    public float getOutput() {
        return output;
    }

    public void setOutput(float output) {
        this.output = output;
    }

    public float getError() {
        return error;
    }

    public void setError(float error) {
        this.error = error;
    }
}
