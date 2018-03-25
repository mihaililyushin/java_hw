import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class homework2 {
    public static void main(String[] args) {
        // Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        // отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой
        // строки). Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
        Scanner in = new Scanner(System.in);
        System.out.println("Для запуска задания 2.1 введите любой символ");
        String enter1 = in.next();
        int n1 = 0;
        int n2 = 0;
        do {
        n1++;
        n2 += 2;
        } while (n2 < 20);  //выясняем размер массива i1

        int arr1 [] = new int [n1];
        int arr1n = 2;
        for (int i1 = 0; i1 < arr1.length; i1++) {
            arr1 [i1] = arr1n;
            arr1n += 2;
        }
        System.out.println(Arrays.toString(arr1));
        for (int j1 = 0; j1 < arr1.length; j1++) {
            System.out.println(arr1[j1]);
        }

        //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        // а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)
        System.out.println("Для запуска задания 2.2 введите любой символ");
        String enter2 = in.next();
        int n1_1 = 0;
        int n1_2 = 0;
        do {
            n1_1 ++;
            n1_2 += 2;
        } while (n1_2 < 99);    //размер массива

        int arr2 [] = new int [n1_1];
        int arr2n = 1;
        for (int i2 = 0; i2 < arr2.length; i2++) {
            arr2[i2] = arr2n;
            arr2n += 2;
        }
        System.out.println(Arrays.toString(arr2));
        for (int j2 = n1_1 - 1; j2 >= 0; j2--) {
            System.out.print(arr2[j2] + " ");
        }

        //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        System.out.println("Для запуска задания 2.3 введите любой символ");
        String enter3 = in.next();
        int arr3 [] = new int [15];
        Random num3 = new Random();
        int i3_3 = 0;   //счетчик четных символов в массиве
        for (int i3 = 0; i3 < arr3.length; i3++) {
            arr3 [i3] = num3.nextInt(10);
            if (arr3[i3]%2 == 0) {i3_3 ++;}
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("Четных элементов в массиве " + i3_3);

        //Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран
        // в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
        System.out.println("Для запуска задания 2.4 введите любой символ");
        String enter4 = in.next();
        Random num4 = new Random();
        int arr4_1 [] = new int[5];
        int arr4_2 [] = new int[5];
        double j4_1 = 0;     //суммы элементов массива
        double j4_2 = 0;     //суммы элементов массива
        for (int i4 = 0; i4 < arr4_1.length; i4++) {
            arr4_1 [i4] = num4.nextInt(5);
            arr4_2 [i4] = num4.nextInt(5);
            j4_1 += (double) arr4_1[i4];
            j4_2 += (double) arr4_2[i4];
        }
        System.out.println(Arrays.toString(arr4_1));
        System.out.println(Arrays.toString(arr4_2));
        System.out.println(j4_1 + " " + j4_2);
        if (j4_1 != j4_2) {
            if (j4_1 < j4_2) {
                System.out.println(j4_2/5 + "- это наибольшее среднеарифметическое массива arr4_2");
            } else {
                System.out.println(j4_1/5 + "- это наибольшее среднеарифметическое массива arr4_1");
            }
        } else {
            System.out.println("среднеарифметическое " + j4_1/5 + " массивов arr4_1 и arr4_2 равны");
        }

        //Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
        // Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        System.out.println("Для запуска задания 2.5 введите любой символ");
        String enter5 = in.next();
        Random num5 = new Random();
        int arr5 [] = new int [4];
        int j5 = 0;  //счетчик сравнений элементов массива
        for (int i5 = 0; i5 < arr5.length; i5++) {
            arr5 [i5] = (num5.nextInt(80) + 10);
            if (i5 != 0) {  //исключаем -1 элемент массива
            if (arr5 [i5-1] < arr5 [i5]) {
                j5 ++;
            }}
        }
        System.out.println(Arrays.toString(arr5));
        if (j5 == (arr5.length - 1)) {
            System.out.println("чудо!!! массив случайных чисел arr5 строго возрастает");
        }

         //Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать
            // массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
            // После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины
            // массива больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт
            // неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано
            // корректное значение.

        int num6 = 1;   //######## Дарья, нужно ли здесь определять значение??? ############

        Random num6_1 = new Random();
        System.out.println("Для запуска задания 2.6 введите четное положительное число");
        if (in.hasNextInt()) {
            do {
                System.out.println("введите четное положительное число");
                num6 = in.nextInt();
            } while (num6 <= 0 || num6%2 != 0 );        //проверка на четность и положительность
        }
        int arr6 [] = new int [num6]; //########## иначе он здесь ругается, если не было определено значение,
        // оно же вводилось выше через in.nextInt(); #######

        int arr6_1 = 0;
        int arr6_2 = 0; //суммы половинок массива
        int k6 = arr6.length / 2;   //половина длинны массива
        for (int i6 = 0; i6 < arr6.length; i6++) {
           arr6 [i6] = (num6_1.nextInt(10) - 5);
           if (i6 < k6) {
              arr6_1 += Math.abs(arr6[i6]);
           } else {
               arr6_2 += Math.abs(arr6[i6]);
           }
        }
        System.out.println("массив: " + Arrays.toString(arr6));
        StringBuilder result6 = new StringBuilder();
        if (arr6_1 == arr6_2) {
            result6.append("левая ").append(arr6_1).append(" и правая часть ").append(arr6_2).append(" равны");
        } if (arr6_1 < arr6_2) {
             result6.append("левая ").append(arr6_1).append(" меньше правой ").append(arr6_2);
            } else {
            result6.append("левая ").append(arr6_1).append(" больше правой ").append(arr6_2);
        }
        System.out.println(result6);

        // Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        // Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого
        // массива (его индекс не имеет значения).

        System.out.println("Для запуска задания 2.7 введите любой символ");
        String enter7 = in.next();
        int arr7 [][] = new int [5][8];
        int max7 = 0;
        Random num7 = new Random();
        for (int i7 = 0; i7 < arr7.length; i7++) {
            for (int ii7 = 0; ii7 < arr7[0].length; ii7++){
                arr7[i7][ii7] = (num7.nextInt(200) - 100);
                if (i7 != 0 && ii7 != 0) {
                    if (max7 < arr7[i7][ii7]) {
                        max7 = arr7[i7][ii7];
                    }
                }
                if (i7 == 0 && ii7 == 0) {
                    max7 = arr7[i7][ii7];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr7));
        System.out.println("Максимальное значение " + max7);

        // Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать
        // каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
        // а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить
        // на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению
        // на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся
        // (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
/*        System.out.println("Для запуска задания 2.8 введите любой символ");
        String enter8 = in.next();
        int arr8[][] = new int [8][8];
        int k8 = 2;
        Random num8 = new Random();
        for (int i8 = 0; i8 < arr8.length; i8++) {
            for (int j8 = 0; j8 < arr8[0].length; j8++) {
                if (j8 + k8 > 9) {
                    arr8 [i8][j8] = 0;
                } else {
                    arr8 [i8][j8] = j8 + k8;
                }
            }
            k8++;
        }

        System.out.println(Arrays.deepToString(arr8));
*/
        // Найти в строке указанную подстроку и заменить ее на новую.
        // Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        System.out.println("Для запуска задания 2.9 введите строку");
        String enter9 = in.nextLine();
        System.out.println("Введите что заменить в строке");
        String enter9_from = in.nextLine();
        System.out.println("Введите на что заменить в строке");
        String enter9_to = in.nextLine();
        String itog9 = enter9.replaceAll(enter9_from , enter9_to);
        System.out.println("строка после замены: " + itog9);

        // Требуется удалить из нее повторяющиеся символы и все пробелы.
        // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
        System.out.println("Для запуска задания 2.10 введите строку");
        String enter10 = in.nextLine();
        enter10 = enter10.replaceAll("([a-z])\\1+", "$1");
        System.out.println("Строка без повторяющихся символов:" + enter10);


    }
    }














