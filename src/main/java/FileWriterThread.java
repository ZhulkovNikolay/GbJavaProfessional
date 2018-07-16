//2. Написать совсем небольшой метод, в котором 3 потока построчно пишут данные в файл
// (по 10 записей с периодом в 20 мс)

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterThread implements Runnable {
    private FileWriter fileWriter;
    private String userInput;

    FileWriterThread(String path, String data) throws IOException {
        fileWriter = new FileWriter(path);
        this.userInput = data;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(20);
                 fileWriter.write(userInput);
                 fileWriter.flush();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
