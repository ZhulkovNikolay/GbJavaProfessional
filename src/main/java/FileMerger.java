import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class FileMerger {
    private File file1;
    private File file2;
    private File file3;
    private File file4;
    private File file5;


    ArrayList<InputStream> al = new ArrayList<>();
    Enumeration<InputStream> e;

    public FileMerger(String file1, String file2, String file3, String file4, String file5) throws FileNotFoundException {
        this.file1 = new File(file1);
        this.file2 = new File(file2);
        this.file3 = new File(file3);
        this.file4 = new File(file4);
        this.file5 = new File(file5);

        al.add(new FileInputStream(this.file1));
        al.add(new FileInputStream(this.file2));
        al.add(new FileInputStream(this.file3));
        al.add(new FileInputStream(this.file4));
        al.add(new FileInputStream(this.file5));

        e = Collections.enumeration(al);
    }
}
