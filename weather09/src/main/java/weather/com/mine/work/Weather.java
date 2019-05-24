package com.mine.work;
import java.util.*;

public class Weather {
    String time;
    CityInfo cityInfo; 
    String date;
    String message;
    int status;
    Data data;

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");
        sj.add("time:" + this.time).add("message:"+this.message).add("city:"+this.cityInfo.city).
                      add("yesterday"+this.data.yesterday.date).add("tomorrow:"+this.data.forecast.get(1).sunrise);
        return sj.toString();
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