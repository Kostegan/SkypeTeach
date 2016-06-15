package ru.assistant.items.translations.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 */
public class Connection {

    public static String getHtml(String urlToRead) {
        URL url;
        HttpURLConnection conn;
        BufferedReader rd;
        String line;
        StringBuilder resultBuilder = new StringBuilder();
        String result = "";
        try {
            url = new URL(urlToRead);
            conn = (HttpURLConnection) url.openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            conn.setRequestMethod("GET");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = rd.readLine()) != null) {
                resultBuilder.append(line);
                resultBuilder.append("\n");
//                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultBuilder.toString();
//        return result;
    }
}

