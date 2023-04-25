/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getDescription() {
        return "Triangle with base " + base + " and height " + height;
    }
}
