package com.csc205.project1;

import java.lang.Math;

public class Point {

    private double x;
    private double y;

    //constructors

    //default constructor that sets x and y to 0
    public Point() {
        setPoint(0, 0);
    }

    //secondary constructor that lets the values of x and y be set when called
    public Point(double _x, double _y) {
        setPoint(_x, _y);
    }

    //outputs the distance using the formula and a second point to compare to
    public double distance(Point p2) {
        return Math.sqrt(Math.pow((getX() - p2.getX()), 2) + Math.pow((getY() - p2.getY()), 2));
    }

    // getters and setters for x and y
    public double getX() {
        return x;
    }

    public void setX(double _x) {
        x = _x;
    }

    public double getY() {
        return y;
    }

    public void setY(double _y) {
        y = _y;
    }

    //used to update both x and y at the same time
    public void setPoint(double _x, double _y) {
        setX(_x);
        setY(_y);
    }

    //moves x or y on their axis the distance input
    public void shiftX(double n) {
        setX(getX() + n);
    }

    public void shiftY(double n) {
        setY(getY() + n);
    }

    //rotates this point using the formula
    /*
     x` = x*cos(theta) - y*sin(theta)
     y` = x*sin(theta) + y*cos(theta)

     theta is the angle in radians
     x` and y` are the new locations
     */
    public void rotate(double theta) {
        setX((getX() * Math.cos(theta)) - (getY() * Math.sin(theta)));
        setY((getX() * Math.sin(theta)) + (getY() * Math.cos(theta)));
    }

    // overwrites the toString function to format the output
    // example - Point{x = 0.1, y = 2.5}
    public String toString() {
        return "Point{x = " + getX() + ", y = " + getY() + "}";
    }
}
