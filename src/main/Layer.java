package main;

import java.util.ArrayList;

/**
 *  Abstract definition for a neural network layer
 *  @author Benjamin Xu
 */
public abstract class Layer {

    private ArrayList<Neuron> listOfNeurons;
    private int numberOfNeuronsInLayer;

    public Layer(){
    }

    /**
     *  Return the list of neurons in the layer
     *  @return a list of neurons
     */
    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    /**
     *  Set the list of neurons in the layer
     *  @param listOfNeurons the list of neurons to set for the layer
     */
    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    /**
     *  Returns the number of neurons in the layer
     *  @return the number of neurons
     */
    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    /**
     *  Set the number of neurons in the layer
     *  @param numberOfNeuronsInLayer the number of neurons to set for the layer
     */
    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}
