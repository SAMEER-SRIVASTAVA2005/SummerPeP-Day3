// package HashMap;

import java.util.HashMap;

public class main {
    public static void main(String...args){

        ////------------------------------- HashMap
        HashMap<String, Integer> hm = new HashMap<>(); 

        //------------------------------- insertion 
        hm.put("India",100);
        hm.put("Nepal",150);
        hm.put("China",200);

        // System.out.println(hm);

        hm.put("India",500);

        // System.out.println(hm);

        // contains function
        // if(hm.containsKey("India")){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }

        ////------------------------------- get function
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Sri Lanka"));
    }

}
