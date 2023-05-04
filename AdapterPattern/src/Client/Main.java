package Client;

import Adaptee.WeightMachineForBabies;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {

        WeightMachineAdapterImpl weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println("Weight in pounds: " + weightMachineAdapter.getWeightInPounds());


    }
}