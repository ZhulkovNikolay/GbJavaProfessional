import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadTask {

    private File file;

    public FileReadTask(String fileLocation) {
        file = new File(fileLocation);
    }

    public byte[] readFromFileToByteArray() {
        byte[] bytefileContent = new byte[(int) file.length()]; // массив куда запишем файл
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read(bytefileContent);
        } catch (IOException e) {
            System.out.println("smth wrong IO exeption");
        }
        return bytefileContent;
    }

}
