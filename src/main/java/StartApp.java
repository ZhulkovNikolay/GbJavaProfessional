import java.io.IOException;

public class StartApp {
    public static void main(String[] args) throws IOException {
        String file1 = "C:\\installTuner.log";
        String file2 = "C:\\c\\ссылка на сброс пароля.txt";
        String file3 = "C:\\c\\New Text Document.txt";
        String file4 = "C:\\c\\zip java source.txt";
        String file5 = "C:\\c\\T.bat";
        String resultFile = "C:\\c\\resultSeq.txt";
        String bigDataFile = "C:\\c\\resultSeq.txt";

        //1. Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль;
        FileReadTask fileReadTask = new FileReadTask(file1);
        byte[] filecontent = fileReadTask.readFromFileToByteArray();
        for (byte b : filecontent) {
                System.out.print((char) b);
        }

        //2. Последовательно сшить 5 файлов в один (файлы также ~100 байт).
        FileMerger fileMerger = new FileMerger(file1, file2, file3, file4, file5);
        fileMerger.mergeInOneFile(resultFile);

        // 3. Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb).
        // Вводим страницу, программа выводит ее в консоль (за страницу можно принять 1800 символов).
        ReaderByPage readerByPage  = new ReaderByPage();
        readerByPage.showOnePage(bigDataFile);
    }
}

