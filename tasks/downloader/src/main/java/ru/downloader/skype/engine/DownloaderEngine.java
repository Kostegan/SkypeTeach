package ru.downloader.skype.engine;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 */
public class DownloaderEngine implements IDownloaderEngine {
    private String path;
    private URL url;


    public DownloaderEngine(String url, String path) throws Exception{
        this.url = new URL(url);
        this. path = path;
    }

    @Override
    public void downloads() {

        InputStream in = null;
        FileOutputStream fOut = null;
        int temp;
        BufferedOutputStream bufferOs =null;
        BufferedInputStream buffer = null;
        try{
            URLConnection fileStream = url.openConnection();
            in = fileStream.getInputStream();
            buffer = new BufferedInputStream(in);
            fOut = new FileOutputStream(path);
            bufferOs = new BufferedOutputStream(fOut);
            while((temp = buffer.read())!=-1){
                bufferOs.write(temp);
            }
        } catch (IOException e){
            System.out.println("Error "+e.toString());
        } finally {
            if(in != null){
                try {
                    in.close();
//                    fOut.close();
//                    buffer.close();
//                    bufferOs.close();
                } catch (IOException e){
                    e.fillInStackTrace();
                }
            }
        }

    }

    @Override
    public void addFile(String path) {

    }
}
