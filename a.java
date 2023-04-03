import java.io.FileWriter;
import java.io.IOException;
public class a {
 public static void main(String[] args) {
 try (FileWriter fw = new FileWriter("file.txt", false)) {
   
    String str = "";
    for (int i = 0; i < 100; i++) {
        str += "TEXT";
}

 fw.append(str);
 fw.append('\n');

 fw.flush();
 } catch (IOException ex) {
 System.out.println(ex.getMessage());
 }
 } }

