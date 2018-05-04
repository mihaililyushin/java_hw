package Homework_stream;

import java.io.*;
import java.nio.charset.Charset;

public class FileReadWrite {

    protected static byte [] FileRead(File file) throws IOException {        //Считываем файл
        try (InputStream input = new FileInputStream(file);
             ByteArrayOutputStream bout = new ByteArrayOutputStream()) {
            byte [] buffer = new byte [512];
            int length;
            while ((length = input.read(buffer)) > 0) {
                bout.write(buffer, 0, length);
            }
            return bout.toByteArray();
        }

    }

    protected static void WriteFile(String str, File file, boolean append) throws IOException {     //записываем файл
        try(OutputStream output = new FileOutputStream(file, append)) {
            byte [] bytes = str.getBytes(Charset.forName("UTF-8"));
            output.write(bytes);
        }
    }
}
