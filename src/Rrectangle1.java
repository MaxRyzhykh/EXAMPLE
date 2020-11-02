//класс родитель может быть только 1, а интерфейсов много
// ctrl + A
// если класс реализует не все методы интерфейса - то надо его указать как abstract
public class Rrectangle1 implements FigureNameProvider, FigurePropertiesCalculator {

    private final static String figure_name = "Прямоугольник";

    @Override
    public String getFigureName(){
        return figure_name;
    }
}
