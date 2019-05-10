/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Weather;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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


    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        try {
            App app = new App();
            String response = app.run("http://t.weather.sojson.com/api/weather/city/101240101");
            System.out.println(response);
        } catch(IOException e) {
            System.out.println("io error");
        }
    }
}
