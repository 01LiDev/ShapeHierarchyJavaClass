/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Cube extends ThreeDimensionShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String getDescription() {
        return "Cube with side " + side;
    }
}