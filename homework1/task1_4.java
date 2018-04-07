package homework1;

import java.util.Arrays;

public class task1_4 extends getNumbers{
    int a,b,c;
    int i = 3;

    protected task1_4(){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected void resultat(){
        int arr[] = {this.a , this.b , this.c};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        }

    }





