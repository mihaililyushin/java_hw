package homework1;

public class task1_10 extends getNumbers{

    protected task1_10(){
    }

    protected void resultat(){
        int bilet = 0;
        int b1,b2,b3,b4,b5,b6;
        for (int i = 1; i <= 999999; i++) {
            b1 = i % 10;
            b2 = (i % 100) / 10;
            b3 = (i % 1000) / 100;
            b4 = (i % 10000) / 1000;
            b5 = (i % 100000) / 10000;
            b6 = (i % 1000000) / 100000;
            if (b1+b2+b3 == b4+b5+b6) {
                bilet++;
            }
        }
        System.out.println("Счастливых билетов в рулоне: " + bilet);
    }
}
