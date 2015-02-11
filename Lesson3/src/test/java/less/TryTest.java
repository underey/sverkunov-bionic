package less;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class TryTest {
    private String str = "Hel world!";

    @Test
    public void someTest() {
       String s = readFile("file.txt");
        if (s.equals(str)){
            System.out.print("ok");
        } else {
            System.out.print("fail");
        }

        Assert.assertEquals(s, str);
    }

    public String readFile(String filename)
    {
        String content = null;
        File file = new File(filename); //for ex foo.txt
        try {
            FileReader reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
