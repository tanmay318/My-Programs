import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) throws IOException {
	FileReader r = new FileReader("D:\\tanmayjbk\\abc.txt");
	int i;
	while ((i=r.read())!=-1)
	{
		System.out.print((char)i);
	}
	r.close();
}
}
