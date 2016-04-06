package ross.goncharuk;

import java.io.BufferedReader;
import java.io.FileReader;

public class Cat {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Lab3.1.2.txt"));
            int read1 = reader.read();
            while (read1 != -1) {
                if (read1 != ' ') {
                    System.out.print((char) read1);
                } else {
                    System.out.println();
                }
                read1 = reader.read();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
