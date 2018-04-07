package homework1;
import java.util.Scanner;

public class getNumbers {

    int intNum, intXXXNum, intNat;
    double doubleNum;
    String anychar;

    protected int getintXXXNum() {                       //проверка ввода int 3-х значное, проверку еще не придумал
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите натуральное трехзначное число: ");
        if (enter.hasNextInt()) {
            this.intXXXNum = enter.nextInt();
        } else {
            System.out.println("Вы ввели не int число!");
        }
        return this.intXXXNum;
    }
    protected int getintNum() {                       //проверка ввода int
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (enter.hasNextInt()) {
            this.intNum = enter.nextInt();
        } else {
            System.out.println("Вы ввели не int число!");
        }
        return this.intNum;
    }
    protected double getDoubleNum() {                       //проверка ввода Double
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите double число: ");
        if (enter.hasNextDouble()) {
            this.doubleNum = enter.nextDouble();
        } else {
            System.out.println("Вы ввели не Double число!");
        }
        return this.doubleNum;
    }

    protected void getAnyChar() {
        System.out.println("Для продолжения введите любой символ");
        Scanner enter = new Scanner(System.in);
        this.anychar = enter.next();
    }
    protected int getintNat() {                       //проверка ввода int, ПРОВЕРКИ НА НОЛЬ НЕТ!
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите натуральное положительное число: ");
        if (enter.hasNextInt()) {
            this.intNat = enter.nextInt();
        } else {
            System.out.println("Вы ввели не int число!");
        }
        return this.intNat;
    }
}
