package main;

import java.util.ArrayList;

/**
 *  A basic implementation of a neural network neuron
 *  @author Benjamin Xu
 */
public class Neuron {

    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;

    public Neuron(){}

    /**
     * Initializes listOfWeightIn and listOfWeightOut function
     * with a pseudo random real number
     * @return a pseudo random real number
     */
    public double initNeuron(){
        return 0;
    }

    /**
     *  Sets the listOfWeightIn function with a list of real numbers
     *  @param listOfWeightIn the list of real numbers to be stored
     */
    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){

    }

    /**
     *  Sets the listOfWeightOut function with a list of real numbers
     *  @param listOfWeightOut the list of real numbers to be stored
     */
    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){

    }

    /**
     *  Returns the input weights list for the neuron
     *  @return the list of real numbers stored in listOfWeightIn
     */
    public ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    /**
     *  Returns the output weights list for the neuron
     *  @return the list of real numbers stored in listOfWeightOut
     */
    public ArrayList<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }
}
