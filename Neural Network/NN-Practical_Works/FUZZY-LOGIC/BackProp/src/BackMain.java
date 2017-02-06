/**
 * Created by linuxsagar on 7/8/15.
 */
public class BackMain {
    public static void main(String[] args) {
        Backpropagation backpropagation = new Backpropagation();
        // initiate the weights
        backpropagation.initWeights();
        // load in the data
        backpropagation.initData();
        // train the network
        backpropagation.train();
        //training has finished
        //display the results
        backpropagation.displayResults();
    }
}
