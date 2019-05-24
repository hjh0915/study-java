/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package weather;

import java.util.*;
import java.io.IOException;
import com.mine.work.*;

public class App {
    public static void main(String[] args) {
    List<Weather> wlist;
    JsonClient app = new JsonClient();
    HashMap<String, String> hmap = app.initData();
    List<String> jsonList;
    
    try {
        //System.out.println(app.getResults(hmap));
        jsonList = app.getResults(hmap);
        wlist = Result.dealList(jsonList);
        for (Weather w: wlist) {
            //Weather中toString()是覆盖重载了
            System.out.println(w);
        }
    } catch (IOException e) {
    } catch (InterruptedException e) {
    }
}
}
