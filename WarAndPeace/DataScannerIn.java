package WarAndPeace;

import java.util.Scanner;

public class DataScannerIn {
    private Integer intZnachenie;
    private String stringWord;
    private int k;

    public static final DataScannerIn VVOD = new DataScannerIn();

    public int int1_5(){       //проверка ввода int 1-5 значений
        this.k = 0;
        do {
            Scanner vvod2 = new Scanner(System.in);
            if (vvod2.hasNextInt()) {
                this.intZnachenie = vvod2.nextInt();
                if (this.intZnachenie == 1|this.intZnachenie == 2|this.intZnachenie == 3|this.intZnachenie == 4|this.intZnachenie == 5){
                    this.k = 1;
                    break;
                }
                else {
                    System.out.println(" Значение должно быть 1-5! Введите 1-5");
                }
            }
            else {
                System.out.println("Нужно ввести число!");
            }
        } while (this.k != 1);
        return this.intZnachenie;
    }
    public String string_return_exit(){      //проверка ввода string return или exit
        this.k = 0;
        do {

            Scanner vvod1 = new Scanner(System.in);
            boolean RetOrExit = vvod1.hasNext("return") | vvod1.hasNext("exit");
            if (RetOrExit) {
                this.stringWord = vvod1.nextLine();
                break;
            } else {
                System.out.println("Допустимые команды retur , exit");
            }
        } while (this.k != 1);
        return this.stringWord;
    }
}
