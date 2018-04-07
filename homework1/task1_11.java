package homework1;

public class task1_11 extends getNumbers {

    protected task1_11(){
    }

    protected void resultat(){
        int count=0;
        for(int h=1;h<=24;h++){
            for(int m=0;m<=59;m++){
                if(h/10%10==m%10 && h%10==m/10%10){
                    count++;
                }
            }
        }
        System.out.println("За сутки совпадений" + count);
    }

}

