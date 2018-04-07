package homework1;
import java.util.Scanner;

public class task1_3 extends getNumbers{
    int intNum;
    int num;

    protected task1_3() {
       this.num = num;
    }

    protected int getintNum() {                       //проверка ввода int
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите натуральное трехзначное число: ");
        if (enter.hasNextInt()) {
            this.intNum = enter.nextInt();
        } else {
            System.out.println("Вы ввели не int число!");
        }
        return this.intNum;
    }
    protected void resultat() {
        int nm1 = this.num%10;
        int nm2 = (this.num%100)/10;
        int nm3 = this.num/100;
        if (nm1 >= nm2 && nm1 > nm3) {
            System.out.println("Наибольшая цифра " + nm1);
        } if (nm2 >= nm1 && nm2 >= nm3) {
            System.out.println("Наибольшая цифра " + nm2);
        } if (nm3 >= nm1 && nm3 > nm2) {
            System.out.println("Наибольшая цифра " + nm3);
        }
    }
}
