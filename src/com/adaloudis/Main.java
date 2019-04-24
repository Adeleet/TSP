package com.adaloudis;

public class Main {

    public static void main(String[] args) {
    SalesPerson salesPerson = new SalesPerson(0,0);
        Position initialPosition = new Position(0, 0);
        SalesArea sales1 = new SalesArea(10, 10, initialPosition);
        System.out.print(sales1.getHeight());
    }
}
