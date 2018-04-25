package WarAndPeace;

import java.io.*;


public class ExecuteBookAnalyzer {
    public static void main(String[] args) throws IOException {

        DataBookAnalyzer wp = new DataBookAnalyzer();
        wp.SetListOfWords("C:\\Users\\Ирочка\\IdeaProjects\\java_hw\\text.txt");

        do {
        System.out.println("1. Сосчитать частоту встречаемости слов в книге War and peace.\n" +
                "2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова:" +
                " [the, war, jar, get, met...], в другую [on, up, no, of...].\n" +
                "3. Вывести топ 10 самых частых слов и фраз.\n" +
                "4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).\n" +
                "5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.");

        System.out.println("Выберете номер задания (1-5)");

        switch (DataScannerIn.VVOD.int1_5()){
            case 1:
                wp.SetWordsCollection();
                wp.GetWordsCollection();
                System.out.println("Для возврата наберите return , для выхода exit");
                wp.SetExiter(DataScannerIn.VVOD.string_return_exit());
                break;
            case 2:
                wp.SetWordsByLeingth();
                wp.GetWordsByLeingth();
                System.out.println("Для возврата наберите return , для выхода exit");
                wp.SetExiter(DataScannerIn.VVOD.string_return_exit());
                break;
            case 3:
                wp.SetWordsCollection();
                wp.SetCountOfTopWords(10);
                wp.SetWordsTop();
                wp.GetWordsTop();
                System.out.println("Для возврата наберите return , для выхода exit");
                wp.SetExiter(DataScannerIn.VVOD.string_return_exit());
                break;
            case 4:
                wp.SetWordsByLeingthENUM();
                wp.GetWordsByLeingthENUM();
                System.out.println("Для возврата наберите return , для выхода exit");
                wp.SetExiter(DataScannerIn.VVOD.string_return_exit());
                break;
            case 5:
                wp.SetWordsCollection();
                wp.SetWordstoChars();
                wp.GetCharsProcent();
                System.out.println("Для возврата наберите return , для выхода exit");
                wp.SetExiter(DataScannerIn.VVOD.string_return_exit());
                break;
        }}
        while ((wp.GetExiter()).equals("return"));



    }
}
