package com.adaloudis;

import java.util.ArrayList;

class Position {
    private double x;
    private double y;

    Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Position p) {
        return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
    }

    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }

    void setX(double X) {
        this.x = X;
    }
    void setY (double Y) {
        this.y = Y;
    }





}