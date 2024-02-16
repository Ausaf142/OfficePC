package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NotePad_Utility {
public String DataFromNotePad(String input) throws IOException {
	FileInputStream fis =new FileInputStream("./login.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String data=pro.getProperty(input);
	return data;
}
}
