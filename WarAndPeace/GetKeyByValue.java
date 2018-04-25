package WarAndPeace;

import java.util.Map;

public class GetKeyByValue {
    private Object obj;

    public static final GetKeyByValue DELBYVAL = new GetKeyByValue();

    public Object GetKeyByValue(Map<String, Integer> map, Integer number){
        for (Map.Entry entry : map.entrySet()){
        if ((int) entry.getValue() == number){
            this.obj = entry.getKey();
        }
        }
        return this.obj;
    }

}
