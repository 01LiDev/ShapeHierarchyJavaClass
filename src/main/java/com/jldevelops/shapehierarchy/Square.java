/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public String getDescription() {
        return "Square with side " + side;
    }
}