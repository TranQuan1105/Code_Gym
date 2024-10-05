package ss16_io_text_file;

import java.io.File;

public class MyFile {
    private static final String PATH = "src/ss16_io_text_file/student.csv";

    public static void main(String[] args) {
        File file = new File(PATH);
        System.out.println(file.isFile());
    }
}