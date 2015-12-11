package ru.downloader.skype.engine;
import org.junit.Test;

import static  org.junit.Assert.*;
/**
 *
 */
public class DownloaderEngineTest {
    @Test
    public void downloadsFile() throws Exception{
        String link = "https://www.youtube.com/watch?v=RhKHPq7NsIg&list=RDRhKHPq7NsIg";
        String path = "C:\\GitHub\\SkypeTeach\\tasks\\downloader\\src\\main\\resources\\downloader2";
        IDownloaderEngine engine = new DownloaderEngine(link,path);
         engine.downloads();
    }
}
