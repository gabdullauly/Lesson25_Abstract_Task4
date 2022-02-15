/*
4)In main Create objects of All 3 classes (Amount is up to you)
Create Figure[] figures and add all your classes.
In For loop call toString in all classes if  area>100
 */

public class Main {
    public static void main (String[] args){
        Circle circle = new Circle(10);
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(20);

        Rectangle rectangle = new Rectangle(5, 8);
        Rectangle rectangle1 = new Rectangle(6, 9);
        Rectangle rectangle2 = new Rectangle(7, 10);

        Triangle triangle = new Triangle(3, 10);
        Triangle triangle1 = new Triangle(5, 15);
        Triangle triangle2 = new Triangle(9, 21);

        Figure[] figures = {circle, circle1, circle2, rectangle, rectangle1, rectangle2, triangle, triangle1, triangle2};

        for (int i=0; i<figures.length; i++){
            if (figures[i].getArea()>100){
                System.out.println(figures[i].toString());
            }
        }

        System.out.println(circle.getArea());

    }
}