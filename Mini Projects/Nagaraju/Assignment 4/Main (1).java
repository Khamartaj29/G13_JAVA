
abstract class Shape {
     
    public abstract void draw();
}

 
class Circle extends Shape {
     
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

 
public class Main {
    public static void main(String[] args) {
         
        Shape circle = new Circle();
        circle.draw();  
    }
}