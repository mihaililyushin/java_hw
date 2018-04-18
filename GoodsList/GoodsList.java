package GoodsList;

import java.util.HashMap;
import java.util.Map;

class GoodsList {
    private Map<String, Map> card;
    private Map<String, Integer> good;
    private String tovar,name;
    private Integer count;

    protected GoodsList (){
        this.card = new HashMap<>();
        this.good = new HashMap<>();
    }

    protected void setName(String str){
        this.name = str;
    }
    protected String getName(){
        return this.name;
    }

    protected void setTovar(String str){
        this.tovar = str;
    }

    protected String getTovar(){
        return this.tovar;
    }

    protected void setCount(Integer number){
        this.count = number;
    }

    protected void addCard(){
        String [] arr = this.name.split(" ");
        this.card.put(arr[0], this.good);
    }

    protected void addGood(){
        String [] arr1 = this.tovar.split(" ");
            this.good.put(arr1[0], this.count);
    }

    protected void PrintCard(){
        System.out.println(this.card);
    }
}
