import java.io.*;

public class ReaderByPage {


    public ReaderByPage() {

    }

    public void showOnePage(String fileName) throws IOException {
        File file = new File(fileName);
        char[] page = new char[1800];
        FileReader fileReader = new FileReader(file);
        fileReader.read(page);
        
        for (char c : page) {
            System.out.print(c);
        }


//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String line;
//        while ((line = bufferedReader.readLine()) !=null){
//            System.out.println(line);
//        }
    }
}
