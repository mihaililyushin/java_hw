package homework1;

public class task1_8 extends getNumbers{
    int num;

    protected task1_8(){
        this.num = num;
    }

    protected void resultat(){
        int j = 0;
        for (int i = 1; i <= this.num; i++) {
            if (this.num%i == 0) { j++;
            }
            }
        if (j>2) {
            System.out.println("Число " + this.num + " не простое");
        } else {
            System.out.println("Число " + this.num + " простое");
        }
        }

    }

