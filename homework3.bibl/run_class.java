package homework3.biblioteka;

public class run_class {

    public static void main(String[] args) {
//=====================================================================================================================
//      Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
//      Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
//      Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
//      при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.
//      Поля класса Book: author, title, pagesNum.
//      Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.
//=====================================================================================================================
        Library bibl1 = new Library("Central", 50);
        Book roman = new Book("Tolstoy", "War and Peace", 1000, 30);
        bibl1.putBook(roman);
        Book roman2 = new Book("Pushkin", "Besy", 200, 21);
        bibl1.putBook(roman2);
        bibl1.getBook(roman2, 25);


    }
}
