package homework3.biblioteka.figures;

public class Circle {
    private double centX, centY, radX, radY, radius;

    protected Circle(double centX, double centY, double radX, double radY){
        this.centX = centX; //коорднаты центра
        this.centY = centY;
        this.radX = radX;   //координаты точки на окружности
        this.radY = radY;
        this.radius = LineLenght.LineLenght(centX,centY,radX,radY);
    }
    protected double countPerimetr(){
        double per = 2*Math.PI*this.radius;
        return per;
    }
    protected double countSquare(){
        double sqr = Math.PI*Math.pow(this.radius,2);
        return sqr;
    }
}
