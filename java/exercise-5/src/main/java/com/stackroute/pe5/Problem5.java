package com.stackroute.pe5;

import java.util.HashMap;

public class Problem5 {
    public static void main(String[] args){
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("USA", "Washington");
        hm.put("UK", "London");

        String result = rotateValue(hm);
        System.out.print(result);
    }

    public static String rotateValue(HashMap<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 =(String) map.get("USA");
        map.replace("UK", val1);
        map.replace("USA", " ");
        return map.toString();
    }
}