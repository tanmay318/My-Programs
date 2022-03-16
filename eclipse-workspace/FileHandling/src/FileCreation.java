import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) throws IOException {
	File a = new File("D:\\tanmayjbk\\abc.txt");
	boolean b =a.createNewFile();
	if (b)
		System.out.println("File Created Successfully");
	else
		System.out.println("File not Created");
}
}
