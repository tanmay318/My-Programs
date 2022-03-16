import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String[] args) throws IOException {
	String str= "Hello World";
	FileWriter w = new FileWriter ("D:\\tanmayjbk\\abc.txt");
	  w.write(str);
	  System.out.println(str);
	  w.close();
	System.out.println("File written Succesfully");
		
}
}
