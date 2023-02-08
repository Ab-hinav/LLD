package org.example;

import java.util.List;

public class ButtonRequestDispatcher {
    private List<ElevatorController> elevatorControllers;
    private ElevatorStrategy elevatorStrategy;

    public ButtonRequestDispatcher(List<ElevatorController> elevatorControllers) {
        this.elevatorControllers = elevatorControllers;
    }

    public void submitRequest(){

    }


}
