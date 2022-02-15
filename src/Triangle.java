/*
Create a Triangle class which inherits from Figure class with parameters.
- int catet;
-int height
Create default and parameter constructors
Create getters and setters
Implement: all abstract methods
 */

public class Triangle extends Figure{
    private int catet;
    private int height;

    public Triangle(){}
    public Triangle(int catet, int height){
        this.catet = catet;
        this.height = height;
    }

    public int getCatet(){
        return catet;
    }

    public int getHeight(){
        return height;
    }

    public void setCatet(int catet){
        this.catet = catet;
    }

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public double getPerimeter(){
        return catet+catet+catet;
    }

    @Override
    public double getArea(){
        return 0.5*catet*height;
    }

    @Override
    public String toString (){
        return super.toString()+" "+this;
    }
}