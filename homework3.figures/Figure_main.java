package homework3.biblioteka.figures;

public class Figure_main {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle(0,0,0,3,5,3,5,0);
        System.out.println("Периметр прямоугольника: " + abcd.countPerimetr());
        System.out.println("Площадь прямоугольника: " + abcd.countSquare());

        Circle ab = new Circle(0,0,5,5);
        System.out.println("Периметр круга: " + ab.countPerimetr());
        System.out.println("Площадь круга: " + ab.countSquare());

        Traingle abc = new Traingle(1,1,4,4,6,6);
        System.out.println("Периметр треугольника: " + abc.countPerimetr());
        System.out.println("Площадь треугольника: " + abc.countSquare());

    }
}
