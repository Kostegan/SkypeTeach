package ru.mysql.teach.internet.shop.dao.schema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class ReaderSchema implements IReaderSchema {
    private  String schema;

    public ReaderSchema() {
    }

    private void readSchema(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            schema = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String getSchema(String path) {
        readSchema(path);
        return schema;
    }

}
