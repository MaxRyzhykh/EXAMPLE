//example
public class Circle extends Figure {
    protected double a;

    public Circle(double r) {
        super(r, r);
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(a, 2);
    }


    @Override
    public double perimeter(){
        return 2 * Math.PI * a;
    }
}
