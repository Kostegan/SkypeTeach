package ru.test.skype.test.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class has a method
 */
public class HttpConnection {
    private static HttpURLConnection conn;
    private static BufferedReader rd;
    private static String line;


    public static void connectToHtml(URL urlToRead) {
        try {
            conn = (HttpURLConnection) urlToRead.openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            conn.setRequestMethod("GET");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeBufferReader() {
        try {
            rd.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static StringBuilder getHtmlByURL(URL url) {
        connectToHtml(url);
        StringBuilder result = new StringBuilder();
        try {

            while ((line = rd.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            closeBufferReader();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static URL getURLFromString(String url) throws MalformedURLException {
            return new URL(url);
    }

}


class Main {

    public static void main(String[] args)throws MalformedURLException {
        System.out.println(HttpConnection.getHtmlByURL(HttpConnection.getURLFromString("https://e.mail.ru/cgi-bin/readmsg?from_mra_mail=1&id=14648670310000000956&lang=ru")));
    }
}
