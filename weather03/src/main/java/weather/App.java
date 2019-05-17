/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package weather;

import java.util.*;
import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import com.google.gson.Gson;

class Weather {
    String time;
    CityInfo cityInfo; 
    String date;
    String message;
    int status;
    Data data;

    public String toString() {
        return "city:" + this.cityInfo.city;
    }
} 

class CityInfo {
    String city;
    String cityId;
    String parent;
    String updateTime;
}

class Data {
    String shidu;
    double pm25;
    double pm10;
    String quality;
    String wendu;
    String ganmao;

    Everyday yesterday;
    List<Everyday> forecast;
}

class Everyday {
    String date;
    String sunrise;
    String high;
    String low;
    String sunset;
    double aqi;
    String ymd;
    String week;
    String fx;
    String fl;
    String type;
    String notice;
}

public class App {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public HashMap<String, String> cityCode() {
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

    public List<String> getResults(HashMap<String, String> hmap) throws IOException {
        String result;
        List<String> a = new ArrayList<String>(); 
        for (Map.Entry<String, String> me : hmap.entrySet()) {
            System.out.println(me.getKey());
            result = this.run(this.getUrl(me.getValue()));
            a.add(result);
        }
        return a;
    }

    public String getUrl(String citycode) {
        String url = String.format("http://t.weather.sojson.com/api/weather/city/%s", citycode);
        return url;
    }

    public static void main(String[] args) {
            App app = new App();
            HashMap<String, String> hmap = app.cityCode();
        try {
            //System.out.println(app.getResults(hmap));
            app.getResults(hmap);
        } catch (IOException e) {
        }
    }
}
