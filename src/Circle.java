/*
Create a Circle class which inherits from Figure class with parameters.
- int radius;
Create default and parameter constructors
Create getters and setters
Implement: all abstract methods
 */

public class Circle extends Figure{
    private int radius;

    public Circle(){}
    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter (){
        return 2*radius*3.14;
    }

    @Override
    public double getArea(){
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public String toString(){
        return super.toString()+" "+this.radius;
    }
}