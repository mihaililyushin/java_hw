package homework1;

public class task1_7 extends getNumbers{

    protected task1_7(){
    }

    protected void resultat(){
        int k = 2;
        int i = 20;
        do {
            System.out.println(k);
            k = k * 2;
            i--;
        } while (i > 0);
    }
}
