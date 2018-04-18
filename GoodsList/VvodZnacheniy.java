package GoodsList;

import java.util.Scanner;

class VvodZnacheniy {
    private Integer intZnachenie;
    private String rusString;
    private int k;

    public static final VvodZnacheniy VVOD = new VvodZnacheniy();

    public int INT(){       //проверка ввода int значений
        this.k = 0;
        do {
            Scanner vvod2 = new Scanner(System.in);
            if (vvod2.hasNextInt()) {
                this.intZnachenie = vvod2.nextInt();
                if (this.intZnachenie > 0 & this.intZnachenie != 0){
                    this.k = 1;
                    break;
                }
                else {
                    System.out.println(" Значение должно быть > 0!");
                }
            }
            else {
                System.out.println("Нужно ввести int число!");
            }
        } while (this.k != 1);
        return this.intZnachenie;
    }

    protected String RUSSTRING(){      //проверка ввода string начений, только русские буквы
        this.k = 0;
        do {
            Scanner vvod1 = new Scanner(System.in);
            boolean OnlyAlphabet = vvod1.hasNext("^[а-яА-Я]+$");
            if (OnlyAlphabet) {
                this.rusString = vvod1.nextLine();
                break;
            } else {
                System.out.println("Используйте только русские буквы!");
            }
        } while (this.k != 1);
        return this.rusString;
    }
}
