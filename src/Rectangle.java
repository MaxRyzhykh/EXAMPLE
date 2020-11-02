public class Rectangle {
    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }


    public double perimeter(){
        return (a * 2) + (b * 2);
        }
    }
