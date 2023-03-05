import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    String separator=File.separator;
    String path=separator+"E:"+separator+"Сабак Peaksoft"+separator+"Lessons"+separator+"HomeWork22"+separator+"src"+separator+"song.txt";

    File file=new File(path);

    Scanner sc=new Scanner(file);
    while (sc.hasNextLine()){
        System.out.println(sc.nextLine());
    }
    sc.close();

    }
}