package ru.downloader.skype.engine;

import java.net.URL;

/**
 * Downloads a file from a specified link. Adds the file to a specified path on a disk.
 */
public interface IDownloaderEngine {
    /**
     * whence will be download a file.
     */
    public void downloads();

    /**
     * @param path - where the file will be added.
     */
    public void addFile(String path);
}
