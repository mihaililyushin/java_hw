package Homework_stream;

import java.io.File;
import java.io.IOException;

import static Homework_stream.FileCyptor.Decrypt;
import static Homework_stream.FileCyptor.Encrypt;
import static Homework_stream.FileCyptor.FILE_CYPTOR;

public class ExecuteFileStream {

    public static void main(String[] args) throws IOException {

        FileCyptor.FILE_CYPTOR.setKeyword("Password");

        File file = new File("C:\\Users\\Ирочка\\IdeaProjects\\java_hw\\text.txt");
        //создаем объект со ссылкой на сущесвующий файл
        File filecopy = new File("C:\\Users\\Ирочка\\IdeaProjects\\java_hw\\textcopy.txt");
        //создаем объект со ссылкой на создаваемый файл-копию
        FileReadWrite.WriteFile(FileReadWrite.FileRead(file).toString(),filecopy,true);     //копировали файл

        byte [] sometext = Encrypt(FileReadWrite.FileRead(file), FileCyptor.FILE_CYPTOR.getKeyword());
        System.out.println("до расшифровки: " + sometext.toString());
        System.out.println("после расшифровки: " + Decrypt(sometext,FILE_CYPTOR.checkKeyword("Password")));
    }
}
