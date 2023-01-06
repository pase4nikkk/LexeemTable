import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, StringBuffer> hashMap = new HashMap<>();
        new StringBuffer();
        hashMap.put(1, new StringBuffer("public"));
        hashMap.put(2, new StringBuffer("static"));
        hashMap.put(3, new StringBuffer("int"));
        hashMap.put(4, new StringBuffer("name"));
        hashMap.put(5, new StringBuffer("("));
        hashMap.put(6, new StringBuffer(")"));
        hashMap.put(7, new StringBuffer("{"));
        hashMap.put(8, new StringBuffer("}"));
        hashMap.put(9, new StringBuffer("."));
        hashMap.put(10, new StringBuffer("="));
        hashMap.put(11, new StringBuffer("Scanner"));
        hashMap.put(12, new StringBuffer("System"));
        hashMap.put(13, new StringBuffer("in"));
        hashMap.put(14, new StringBuffer("out"));
        hashMap.put(15, new StringBuffer("print"));
        hashMap.put(16, new StringBuffer("\""));
        hashMap.put(17, new StringBuffer("nextInt"));
        hashMap.put(18, new StringBuffer("return"));
        hashMap.put(19, new StringBuffer("new"));
        hashMap.put(20, new StringBuffer("String"));
        hashMap.put(21, new StringBuffer(";"));

        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "getItem");
        names.put(2, "scanner");
        names.put(3, "item");
        names.put(4, "scanner2");
        names.put(5, "x");

        HashMap<Integer, String> strings = new HashMap<>();
        strings.put(1, "Input");
        strings.put(2, "variable");
        strings.put(3, "-->");
        String bigStroke = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Education/Constr/lexema/untitled/src/main/java/text.txt")))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                bigStroke += line + " tabulation ";
            }
            System.out.println(bigStroke);

            String[] splitter = bigStroke.split(" ");
            String answer = "1\n";
            int k = 1;
            for (String str : splitter) {
                str = str.trim();

                for (Integer keyStr: strings.keySet()) {
                    if (str.contains(strings.get(keyStr)))
                    {
                        answer += "\t\t20\t" + str + "\n";
                    }
                }

                for (Integer keyName : names.keySet()) {
                    if (str.contentEquals(names.get(keyName)))
                    {
                        answer += "\t\t4\t" + str + "\n";;
                    }
                }

                for (Integer key : hashMap.keySet()) {
                    if (str.contentEquals(hashMap.get(key)))
                    {
                        answer += "\t\t"+key + "\n";
                    }
                }
                if (str.contentEquals("tabulation")) {
                    if (k != 6)
                        answer += ++k + "\n";
                }
            }

            System.out.println(answer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
