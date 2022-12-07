package Q2;
import java.util.*;
public class MinNumber {
        public static void main(String[] args) {
            List<Integer> number = Arrays.asList(8,1,2,4,3,3);
            int k=5;
            Collections.sort(number);
            int count=0;
            for(int i=0;i<number.toArray().length;i++){
                if(number.get(i) <k && number.get(i)!=number.get(i+1) ){
                    count++;
                }
            }
            System.out.println(count);
        }

}



