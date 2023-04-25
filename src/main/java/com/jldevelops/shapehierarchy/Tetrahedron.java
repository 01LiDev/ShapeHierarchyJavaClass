/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class Tetrahedron extends ThreeDimensionShape {
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String getDescription() {
        return "Tetrahedron with edge " + edge;
    }
}
