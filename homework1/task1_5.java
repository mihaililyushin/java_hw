package homework1;

public class task1_5 extends getNumbers {

    protected task1_5(){
    }

    protected void resultat() {
        int j = 1000;
        do {
            System.out.println(j);
            j = j + 3;
        } while (j <= 9999);
    }
}
