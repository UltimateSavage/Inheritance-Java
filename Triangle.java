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
public class Triangle extends GeometricObject{
    private double Side1=1.0, Side2=1.0, Side3=1.0;
    private double s = (Side1+Side2+Side3)/2;
    public Triangle (){
    }
    public Triangle (double Side1, double Side2, double Side3){
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side3;
    }
    public Triangle(double Side1, double Side2, double Side3, String color, boolean filled){
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side3;
        setColor(color);
        setFilled(filled);
    }
    public double getSide1() {
        return Side1;
    }
    /** Set a new width */
    public void setSide1(double Side1) {
        this.Side1 = Side1;
    }
    public double getSide2() {
        return Side2;
    }
    /** Set a new width */
    public void setSide2(double Side2) {
        this.Side2 = Side2;
    }
    public double getSide3() {
        return Side3;
    }
    /** Set a new width */
    public void setSide3(double Side3) {
        this.Side3 = Side3;
    }
    public void setS (double Side1, double Side2, double Side3){
        this.s = (Side1+Side2+Side3)/2;
    }
    /** Return area */
    public double getArea() {
        return (Math.sqrt(s*(s-Side1)*(s-Side2)*(s-Side3)));
    }
    /** Return perimeter */
    public double getPerimeter() {
        return (Side1+Side2+Side3);
    }
    public String toString(){
        return "Triangle: side1 = " + Side1 + " side2 = " + Side2 + " side3 = " + Side3;
    }
}
