/*
Create an abstract Figure class with parameters:
abstract double getPerimeter ();
abstract double getArea ();
override toString() which returns getPerimeter() + getArea()
 */

public abstract class Figure {
    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString (){
        return getPerimeter()+" "+getArea();
    }
}