package com.mine.work;

import java.util.*;
import com.google.gson.Gson;

public class Result {

    public static Weather deal(String jsonStr) {
        Gson gson = new Gson();
        Weather w = gson.fromJson(jsonStr, Weather.class);
        return w;
    }

    public static List<Weather> dealList(List<String> jsonList) {
        List<Weather> wlist = new ArrayList<Weather>();
        Weather w;
        for(String s: jsonList) {
            w = deal(s);
            wlist.add(w);
        }
        return wlist;
    }
}