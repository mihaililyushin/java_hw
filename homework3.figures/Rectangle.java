package homework3.biblioteka.figures;

 public class Rectangle {
    private double x1,y1;
    private double x2,y2;
    private double x3,y3;
    private double x4,y4;
    private double line1,line2,line3,line4;

        protected Rectangle (double x1,double y1,double x2,double y2,double x3,double y3,double x4, double y4){
            this.x1 = x1;       //координаты вершин
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
            this.x4 = x4;
            this.y4 = y4;

//            this.line1 = LineLenght.LineLenght(x1, y1, x2, y2); //длинны отрезков
//            this.line2 = LineLenght.LineLenght(x2, y2, x3, y3);
//            this.line3 = LineLenght.LineLenght(x3, y3, x4, y4);
//            this.line4 = LineLenght.LineLenght(x4, y4, x1, y1);   //вызов работает,хотя класс не использует интерфейс???


        }

        public double getPerimetr(Rectangle rectangle){            //так не заработало...ругается на Rectangle rectangle
            double per = 0;
            double line1 = Math.sqrt(Math.pow((rectangle.y2 - rectangle.y1),2) + Math.pow((rectangle.x2 - rectangle.x1),2));
            double line2 = Math.sqrt(Math.pow((rectangle.y3 - rectangle.y2),2) + Math.pow((rectangle.x3 - rectangle.x2),2));
            double line3 = Math.sqrt(Math.pow((rectangle.y4 - rectangle.y3),2) + Math.pow((rectangle.x4 - rectangle.x3),2));
            double line4 = Math.sqrt(Math.pow((rectangle.y1 - rectangle.y4),2) + Math.pow((rectangle.x1 - rectangle.x4),2));
            per = line1 + line2 + line3 + line4;
            return per;
        }
        protected double countPerimetr(){
            double per = this.line1+this.line2+this.line3+this.line4;
            return per;
        }

        protected double countSquare(){
            double sqr = this.line1*this.line2;
            return sqr;
        }


    }


