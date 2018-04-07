package homework3.biblioteka;

import com.sun.jdi.Method;

public class Library {
    String libruaryName;
    int maxQuantity;
    Book book;
    int quantity;


    protected Library(String libruaryName, int maxQuantity){
        this.libruaryName = libruaryName;
        this.maxQuantity = maxQuantity;
        this.book = book;
    }

    protected void putBook(Book book) {
        if (this.maxQuantity >= book.quantity)
        {
        this.book = book;
        this.maxQuantity -= book.quantity;
            System.out.println("Книги добавлены");
            return;
        } else {
            System.out.println("В библиотеке нет места");
        }
    }

    protected void getBook(Book book, int quantity) {
        if (quantity < book.quantity){
            book.quantity -= quantity;
            System.out.println("Выдано " + quantity + " книг " + book.autor + " " + book.title + " осталось " + book.quantity);
            return;
        }  if (quantity == book.quantity){
            System.out.println("Выдано " + quantity + " книг " + book.autor + " " + book.title + " больше не осталось");
            this.book = null;
            return;
        }   if (quantity > book.quantity){
            System.out.println("Так много книг " + book.autor + " " + book.title + " в библиотеке нет!");
            return;
        }
    }
    protected int getMaxQuantity(){
        return this.maxQuantity;
    }
}
