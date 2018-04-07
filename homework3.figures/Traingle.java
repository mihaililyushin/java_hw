package homework3.biblioteka.figures;

public class Traingle {
    private double x1,y1,x2,y2,x3,y3; //координаты вершин
    private double line1,line2,line3; //длинны сторон


    protected Traingle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        this.line1 = LineLenght.LineLenght(x1, y1, x2, y2);
        this.line2 = LineLenght.LineLenght(x2, y2, x3, y3);
        this.line3 = LineLenght.LineLenght(x3, y3, x1, y1);

    }

    protected double countPerimetr(){
        double per = this.line1+this.line2+this.line3;
        return per;
    }

    protected double countSquare(){
        double per = this.line1+this.line2+this.line3;
        double sqr = Math.sqrt(per*(per-this.line1)*(per-this.line2)*(per-this.line3));
        return sqr;
    }
}
