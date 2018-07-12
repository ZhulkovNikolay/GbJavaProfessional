import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class FileMerger {

    ArrayList<InputStream> al = new ArrayList<>();

    public FileMerger(String file1, String file2, String file3, String file4, String file5) throws FileNotFoundException {

        al.add(new FileInputStream(new File(file1)));
        al.add(new FileInputStream(new File(file2)));
        al.add(new FileInputStream(new File(file3)));
        al.add(new FileInputStream(new File(file4)));
        al.add(new FileInputStream(new File(file5)));
        // e = Collections.enumeration(al);
    }

    public void mergeInOneFile(String outputFile) throws IOException {
        //Enumeration<InputStream> e;
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(new Vector<>(al).elements());
        byte[] buffer = new byte[1024];
        int remain;
        while ((remain = sequenceInputStream.read(buffer)) > 0) {
            fileOutputStream.write(buffer, 0, remain);
        }

        fileOutputStream.close();
        sequenceInputStream.close();
    }
}
