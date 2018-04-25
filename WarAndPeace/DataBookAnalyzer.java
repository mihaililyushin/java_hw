package WarAndPeace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class DataBookAnalyzer {

    private ArrayList<String> list;     //для считанных из файла строк
    private ArrayList<String> words;    //для строк разбитых на слова
    private ArrayList<String>[] groupWords;  //для сгруппированных по размеру слов
    private ArrayList<String>[] groupWordsENUM;  //для сгруппированных по размеру слов за вычетом слов из enum
    private ArrayList<Character> chars;    //для букв всего текста
    private Map<String, Integer> wordsCount;    //коллекция с посчитанными словами
    private Map<String, Integer> copywordsCount;   //копия для работы
    private Map<Character, Integer> charscount;     //коллекция с символами
    private Integer[] maxWords;     //массив для значений количества используемых слов (для вывода топа)
    private int count;  //используется для передачи значения при работе с Map<String, Integer>
    private int number; //используется для задания размера Integer[] maxWords
    private int wordLength; //длинна самого длинного слова
    private String exiter;  //для работы в main - повторный запуск задания или выход
    private enum NOTNEED {the, a, on, to, even, only, merely, solely, just, but, alone} // частицы, которые нужно убрать и т.д.

//----------------------------------------Конструктор------------------------------------------------------------------
    protected DataBookAnalyzer(){
        this.list = new ArrayList<>();      //массив со всеми строками текста
        this.words = new ArrayList<>();     //массив со всеми словами текста
        this.wordsCount = new LinkedHashMap<>();
    }
//---------------------------------------Считываем файл и разбиваем на слова-------------------------------------------
    protected void SetListOfWords (String path) throws FileNotFoundException {

        Scanner file = new Scanner(new File(path)); //считываем файл по пути
        while (file.hasNext()){
               this.list.add(file.nextLine().replaceAll("[^A-Za-z ]", "").toLowerCase());
               //убираем в строках все, кроме букв и пробелов
        }
        file.close();

        for (String str : this.list){
            for (String str2 : str.split(" ")){ //разбиваем строки на слова
                this.words.add(str2);
            }
        }
    }
//---------------------------------------Вывод массива со всеми словами текста-----------------------------------------
    protected void GetListOfWords(){
        System.out.println(this.words);
    }
//---------------------------------------Заполняем коллекцию <ключ-слово,значение-количество в тексте>-----------------
    protected void SetWordsCollection(){      //считаем количество слов в тексте
        for (String str : this.words) {
            if (this.wordsCount.containsKey(str)){  //если слово есть делаем key +1
                int i = wordsCount.get(str);
                this.wordsCount.put(str, i+1);
            } else  {
                this.wordsCount.put(str, 1);   //если слова нет добавляем новое с key 1
            }

        }
    }
//---------------------------------------Вывод коллекции <ключ-слово,значение-количество в тексте>---------------------
    protected void GetWordsCollection() {
        for (Map.Entry entry : this.wordsCount.entrySet()) {  //вывод посчитанных слов в тексте
            System.out.println(entry.getKey() +
                    " встречается " + entry.getValue() + " раз(а)");
        }
    }
//---------------------------------------Задаем размер массива для значений наиболее часто встречаемых слов------------
    protected void SetCountOfTopWords(int number){
        //задаем размер топа выводимых слов (по частоте использования в тексте)
        this.number = number;
        this.maxWords = new Integer[number];
    }
//---------------------------------------Заполняем maxWords значениями топовых ключей-слов-----------------------------
    protected void SetWordsTop(){
        this.copywordsCount = new LinkedHashMap<>(wordsCount);    //работаем с копией коллекции
        for(int i = 0; i < this.number; i++ ) {
            this.count = 0;
            for (Map.Entry entry : this.copywordsCount.entrySet()) {
                //находим в коллекции масимальное значение сравнением
                if ((int) entry.getValue() > this.count) {
                    this.count = (int) entry.getValue();
                } else;
            }
            this.maxWords[i] = this.count;       //массив в котором хранятся количства повторов в тексте слов из топа
            //удаляем самое часто встречающееся, запомнив его значение
            this.copywordsCount.remove(GetKeyByValue.DELBYVAL.GetKeyByValue(this.copywordsCount, this.count),this.count);
        }
    }
//---------------------------------------Вывод топа слов---------------------------------------------------------------
    protected void GetWordsTop(){
        System.out.println("Чаще всего встречаются слова: ");
        for (Integer i : this.maxWords){
            System.out.println(i + " " + (String)GetKeyByValue.DELBYVAL.GetKeyByValue(this.wordsCount, i));
        }
    }
//---------------------------------------Распределение слов по длиннам в массиве---------------------------------------
    protected void SetWordsByLeingth(){
        this.wordLength = 0;
        for (String str : this.words){              //выясняем длинну самого длинного слова
            if (str.length() > this.wordLength){
                this.wordLength = str.length();
            }
        }
        this.groupWords = new ArrayList[this.wordLength + 1];  //создаем массив под слова по длиннам
        for (String str : this.words) {                         //добавляем слова
            if (this.groupWords[str.length()] == null) {
                this.groupWords[str.length()] = new ArrayList();
                this.groupWords[str.length()].add(str);
            } else {
                this.groupWords[str.length()].add(str);
            }
        }
    }
//-----------------------------------------Вывод массива со словами распределенными по длиннам-------------------------
    protected void GetWordsByLeingth(){
        System.out.println(Arrays.deepToString(this.groupWords));
    }
//---------------------------------------------------------------------------------------------------------------------
    protected void SetExiter(String str){
        this.exiter = str;
    }
//---------------------------------------------------------------------------------------------------------------------
    protected String GetExiter(){
        return this.exiter;
    }
//-----------------------------------------Помещаем все слова в виде симоволов в массив--------------------------------
    protected void SetWordstoChars(){
        this.chars = new ArrayList<>();
        for (String str : this.words){
            char[] CharArray = str.toCharArray();
            for (char symbol : CharArray) {
                this.chars.add(symbol);
            }
        }
       // System.out.println(this.chars);
    }
//-----------------------------------------Узнаем процент использования букв-------------------------------------------
    protected void GetCharsProcent(){
        this.charscount = new LinkedHashMap<>();
        for (char symbol : this.chars){
            if (this.charscount.containsKey(symbol)){  //если символ есть делаем key +1
                int i = this.charscount.get(symbol);
                this.charscount.put(symbol, i+1);
            } else  {
                this.charscount.put(symbol, 1);   //если символа нет добавляем новый с key 1
            }
        }
        for (Map.Entry entry : this.charscount.entrySet()){         //считаем проценты по каждой букве
            float res = (int)entry.getValue()/((float)(this.chars.size())/(float) 100);
            System.out.println(entry.getKey() + " процент использования " + res + "%");
        }
    }
//------------------------------------------Распределяем слова по размеру с условием не брать определенные--------------
    protected void SetWordsByLeingthENUM(){
        this.wordLength = 0;
        for (String str : this.words){              //выясняем длинну самого длинного слова
            if (str.length() > this.wordLength){
            this.wordLength = str.length();
        }
    }
            this.groupWordsENUM = new ArrayList[this.wordLength + 1];  //создаем массив под слова по длиннам
        for (String str : this.words) {
            if (!str.equals(NOTNEED.values().toString())) {                        //исключаем enum, НО НЕ РАБОТАЕТ! ПОЧЕМУ?
            if (this.groupWordsENUM[str.length()] == null) {
                this.groupWordsENUM[str.length()] = new ArrayList();
                this.groupWordsENUM[str.length()].add(str);
            } else {
                this.groupWordsENUM[str.length()].add(str);
        }} else { return; }
    }
}
//-----------------------------------------Вывод массива со словами распределенными по длиннам без слов из enum---------
    protected void GetWordsByLeingthENUM(){
        System.out.println(Arrays.deepToString(this.groupWordsENUM));
    }
//----------------------------------------------------------------------------------------------------------------------
}
