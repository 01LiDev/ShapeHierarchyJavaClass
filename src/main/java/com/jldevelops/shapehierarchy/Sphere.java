/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Sphere extends ThreeDimensionShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getDescription() {
        return "Sphere with radius " + radius;
    }
}
