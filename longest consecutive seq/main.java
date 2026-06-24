// package longest consecutive seq;
import java.util.*;

public class main {
    public static void main(String[] args) {

        int arr[]={100,4,200,1,3,2};

        HashSet<Integer> hs=new HashSet<>();

        for(int a:arr){
            hs.add(a);
        }

        int largest=0;

        for (int num : hs) {

            if (!hs.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                while (hs.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                largest = Math.max(largest, currentLength);
            }
        }

        System.out.println(largest);
    }
}
