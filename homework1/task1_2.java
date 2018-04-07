package homework1;

public class task1_2 extends getNumbers {
    int intNum;
    int a,b,c;
    double x1,x2;

    protected task1_2() {     //создаем объект со значениями
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected void resultat() {                 //считаем корни квадратного уравнения
        this.x1 = (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
//????????????????????     Дарья, обязательно ли здесь все переменные указывать this? ?????????????????????????????????
        this.x2 = (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
        int sqrt = this.b * this.b - 4 * this.a * this.c;       //проверка на вещественные корни
        if (sqrt > 0) {
            System.out.println("Корни Уравнения " + this.a + "x2 + " + this.b + "x + " + this.c + " = 0: x1= " + this.x1 + " x2= " + this.x2);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}
