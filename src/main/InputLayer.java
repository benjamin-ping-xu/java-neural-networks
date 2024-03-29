package main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  Implementation of input layer to neural network
 *  @author Benjamin Xu
 */
public class InputLayer extends Layer{

    /**
     *  Initializes the input layer with pseudo-random real numbers
     *  @param inputLayer the input layer to initialize
     */
    public InputLayer initLayer(InputLayer inputLayer){
        ArrayList<Double> listOfWeightInTemp = new ArrayList<Double>();
        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();

        for (int i = 0; i < inputLayer.getNumberOfNeuronsInLayer(); i++) {
            Neuron neuron = new Neuron();

            listOfWeightInTemp.add( neuron.initNeuron() );

            neuron.setListOfWeightIn( listOfWeightInTemp );
            listOfNeurons.add( neuron );

            listOfWeightInTemp = new ArrayList<Double>();
        }

        inputLayer.setListOfNeurons(listOfNeurons);

        return inputLayer;
    }

    /**
     *  Prints the input weights of the layer
     *  @param inputLayer the layer to print input weights for
     */
    public void printLayer(InputLayer inputLayer){
        System.out.println("### INPUT LAYER ###");
        int n = 1;
        for (Neuron neuron : inputLayer.getListOfNeurons()) {
            System.out.println("Neuron #" + n + ":");
            System.out.println("Input Weights:");
            System.out.println(Arrays.deepToString( neuron.getListOfWeightIn().toArray() ));
            n++;
        }
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer + 1; //BIAS
    }

}
