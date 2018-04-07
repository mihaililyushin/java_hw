package homework1;

public class task1_1 extends getNumbers {
    double m;
    double n;

    protected task1_1 (){
        this.m = m;             //создаем объект с числами
        this.n = n;
    }

    protected void resultat(){
        if (Math.abs(this.m - 10) > Math.abs(this.n - 10)) {            //считаем какое число ближе к 10
            System.out.println("Число " + this.n + " ближе к 10");
        } else {
            System.out.println("Число " + this.m + " ближе к 10");
        }
    }
}
