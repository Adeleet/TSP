package com.adaloudis;

public class Main {

    public static void main(String[] args) {
        SalesArea area1 = new SalesArea(10, 10);
        area1.generateRandomDestinations(10);
        NNAgent agent1 = new NNAgent(0,0, area1);
        for (int i = 0; i < 15 ; i++) {
            System.out.println(agent1.getDestinations().size());
            agent1.moveToNearestDestination();
        }

    }
}
