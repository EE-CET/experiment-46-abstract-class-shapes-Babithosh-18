abstract class Shape {
    // TODO: Abstract method numberOfSides()

	    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
   
}

// TODO: Create class Rectangle extends Shape
// Implement numberOfSides() to print "Rectangle has 4 sides"

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"

// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"

public class AbstractShapes {
    
        // TODO: Create objects for Rectangle, Triangle, and Hexagon
        // TODO: Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
	
	public static void main(String[] args) {

        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape h = new Hexagon();

        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
	
    }
}
