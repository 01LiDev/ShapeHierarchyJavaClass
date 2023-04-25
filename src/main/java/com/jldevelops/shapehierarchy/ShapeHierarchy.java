/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.shapehierarchy;

/**
 *
 * @author Johnson
 */
public class ShapeHierarchy {

    public static void main(String[] args) {
         Shape[] shapes = new Shape[6];

        // Add some shapes to the array
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Triangle(3, 6);
        shapes[3] = new Sphere(3);
        shapes[4] = new Cube(4);
        shapes[5] = new Tetrahedron(2);

        // Loop through all shapes in the array
        for (Shape shape : shapes) {
            // Print the shape's description
            System.out.println(shape.getDescription());

             // Determine whether the shape is 2D or 3D
             switch (shape) {
                 case TwoDimensionalShape twoDShape -> // If 2D, print its area
                     System.out.printf("Area: %.2f%n%n", twoDShape.getArea());
                 case ThreeDimensionShape threeDShape -> {
                     // If 3D, print its area and volume
                     System.out.printf("Surface area: %.2f%n", threeDShape.getArea());
                     System.out.printf("Volume: %.2f%n%n", threeDShape.getVolume());
                 }    case default -> {
                 }
             }
        }
    }
}
