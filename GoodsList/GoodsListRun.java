package GoodsList;

public class GoodsListRun {

    public static void main(String[] args) {
    GoodsList man1 = new GoodsList();
        System.out.println("Укажите количество покупателей: ");
        int k = VvodZnacheniy.VVOD.INT();
        for ( int i = 0 ; i < k; i++ ) {
            System.out.println("Введите имя покупателя");
            man1.setName(VvodZnacheniy.VVOD.RUSSTRING());
            man1.addCard();
            System.out.println("Сколько товаров купит покупатель: ");
            int j = VvodZnacheniy.VVOD.INT();
            for ( int m = 0 ; m < j; m++){
                System.out.println("Введите название товара: ");
                man1.setTovar(VvodZnacheniy.VVOD.RUSSTRING());
                System.out.println("Введите количество товара " + man1.getTovar() + " :");
                 man1.setCount(VvodZnacheniy.VVOD.INT());
                 man1.addGood();
            }
        }
        man1.PrintCard();



    }
}
