/*
Create a Rectangle class which inherits from Figure class with parameters.
- int height;
- int width
Create default and parameter constructors
Create getters and setters
Implement: all abstract methods
 */

public class Rectangle extends Figure{
    private int height;
    private int width;

    public Rectangle(){}
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return 2*(height+width);
    }

    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public String toString(){
        return super.toString()+" "+this;
    }
}