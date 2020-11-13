/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package GeometricObject.lab;

/**
 *
 * @author varun
 */
public class TestGeometricObjects {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        Rectangle myRectangle = new Rectangle(2, 4);
        Triangle myTriangle = new Triangle (1,2,3);
        System.out.println("A myCircle " + myCircle.toString());
        System.out.println("The color is " + myCircle.getColor());
        System.out.println("The radius is " + myCircle.getRadius());
        System.out.println("The area is " + myCircle.getArea());
        System.out.println("The diameter is " + myCircle.getDiameter());
        
        System.out.println("\nA myRectangle " + myRectangle.toString());
        System.out.println("The area is " + myRectangle.getArea());
        System.out.println("The perimeter is " + myRectangle.getPerimeter());
        
    }
}
