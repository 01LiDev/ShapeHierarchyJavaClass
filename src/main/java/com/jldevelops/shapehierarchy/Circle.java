/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}
