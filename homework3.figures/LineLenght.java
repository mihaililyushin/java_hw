package homework3.biblioteka.figures;

interface LineLenght {

    static double LineLenght(double x1, double y1, double x2, double y2){
        double line = Math.sqrt(Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2));
        return line;
    }
}
