import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
public class abc2
{
public static void main(String[] args) throws IOException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a valid path:");
 String FILE_NAME = sc.nextLine;
boolean flag = false;
FILE_NAME=FILE_NAME+"/new.html";
// create File object
File stockFile = new File(FILE_NAME);

try {
    flag = stockFile.createNewFile();
} catch (IOException ioe) {
     System.out.println("Error while Creating File in Java" + ioe);
}
System.out.println("Enter URL:");
String FILE_URL=sc.nextLine();
try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
  FileOutputStream fileOutputStream new FileOutputStream(FILE_NAME)) {
    byte dataBuffer[] = new byte[1024];
    int bytesRead;
    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
        fileOutputStream.write(dataBuffer, 0, bytesRead);
    }
} catch (IOException e) {
   System.out.println("OOPS!!SOMETHING WENT WRONG!!!!");
}}}