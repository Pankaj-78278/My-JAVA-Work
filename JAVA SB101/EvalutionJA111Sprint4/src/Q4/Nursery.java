package Q4;

import java.util.HashMap;
import java.util.Set;

public class Nursery {
    public static void main(String[] args){
        HashMap m = new HashMap();
        m.put("Cactus", 300);
        m.put("MoneyPlant",200);
        m.put("Snakeplant", 400);
        m.put("peepal", 800);
        m.put("mango", 1000);

        Set s1= m.entrySet();
        System.out.println(s1);//[Snakeplant=400, MoneyPlant=200, peepal=800, Cactus=300, mango=1000]
    }



}
