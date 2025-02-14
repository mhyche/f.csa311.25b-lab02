package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    public Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void renderShape() {
        double area = shape.getArea();

        System.out.println("Shape printed\n" +  "Its area is " + area);
    }
}
