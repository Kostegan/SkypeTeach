package ru.downloader.skype.engine;

import java.net.URL;

/**
 * Downloads a file from a specified link. Adds the file to a specified path on a disk.
 */
public interface IDownloaderEngine {
    public void downloads(URL url);
    public void addFile(String path);
}
