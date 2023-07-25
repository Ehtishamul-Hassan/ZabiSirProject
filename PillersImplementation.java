// deisgn and develop an application to claculate area of different geometric shapes.
package JavaProjects;

import java.util.*;

abstract class Shapes {
    float area;

    public abstract void acceptInput();

    public abstract void compute();

    public void disp() {
        System.out.println("The area of the is:  " + area);

    }

}

class Square extends Shapes {
    private float length;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square");
        length = sc.nextFloat();

    }

    public void compute() {
        area = length * length;
    }

}

class Rectangle extends Shapes {
    private float length;
    private float breadth;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the rectangle ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle");
        breadth = sc.nextFloat();

    }

    public void compute() {
        area = length * breadth;

    }

}

class Circle extends Shapes {
    private float radius;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

}

class Geometry {
    public void permit(Shapes ref) {
        ref.acceptInput();
        ref.compute();
        ref.disp();

    }
}

public class PillersImplementation {
    public static void main(String args[]) {

        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry a = new Geometry();
        a.permit(s);
        a.permit(r);
        a.permit(c);

    }

}
