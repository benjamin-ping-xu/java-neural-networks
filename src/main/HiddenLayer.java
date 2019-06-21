package main;

import java.util.ArrayList;

/**
 *  Implementation of hidden layer for neural network
 *  @author Benjamin Xu
 */
public class HiddenLayer extends Layer {

    /** Initializes a list of hidden layers with pseudo-random real numbers
     *  @param hiddenLayer hidden layer to initialize
     *  @param listOfHiddenLayer list of hidden layers to initialize
     *  @param inputLayer
     *  @param outputLayer
     *  @return list of hidden layers*/
    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer,
                                            InputLayer inputLayer, OutputLayer outputLayer){
        return new ArrayList<HiddenLayer>();
    }

    /**
     *  Print the weights for the list of hidden layers
     *  @param listOfHiddenLayer list of hidden layers to print weights for
     */
    public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer){

    }



}
