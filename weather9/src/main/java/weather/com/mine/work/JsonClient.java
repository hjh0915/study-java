package com.mine.work;

import java.util.*;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JsonClient {
    OkHttpClient client = new OkHttpClient();;
    Queue<String> queue = new LinkedList<String>();

    class MyThread extends Thread {
        String url;
        String cityname;
        public MyThread(String cityname, String url) {
            this.cityname = cityname;
            this.url = url;
        }

        public String getCityName() {
            return this.cityname;
        }

        @Override
        public void run() {
            try {
                //System.out.println(this.cityname);
                String x = visit(this.url);
                queue.offer(x);
            } catch (IOException e) {
            }
        }
    }


    public String visit(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = this.client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public HashMap<String, String> initData() {
        HashMap<String, String> map = new HashMap<String, String>();    
        map.put("天津", "101030100");
        map.put("南昌", "101240101");
        map.put("北京", "101010100");
        map.put("上海", "101020100");
        map.put("香港", "101320101");
        map.put("澳门", "101330101");
        map.put("杭州", "101210101");
        map.put("苏州", "101190401");
        map.put("南京", "101190101");

        return map;
    }

    public List<String> getResults(HashMap<String, String> hmap) throws IOException, InterruptedException {
        List<String> al = new ArrayList<String>(); 
        List<MyThread> results = new ArrayList<MyThread>();

        for (Map.Entry<String, String> me : hmap.entrySet()) {
            MyThread t = new MyThread(me.getKey(), this.getUrl(me.getValue()));
            t.start();
            results.add(t);
        }

        for (MyThread x : results) {
            x.join();
        }

        while (queue.peek() != null) {
            al.add(queue.poll());
        }
        return al;
    }

    public String getUrl(String citycode) {
        String s = "http://t.weather.sojson.com/api/weather/city/%s";
        String url = String.format(s, citycode);
        return url;
    }
}