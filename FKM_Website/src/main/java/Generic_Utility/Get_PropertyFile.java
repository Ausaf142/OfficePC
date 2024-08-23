package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Get_PropertyFile {
	String path="./Credential.property";
	
	public String Username(String path) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String USER = prop.getProperty("username");
		return USER;
	}
	public String Password(String path) throws IOException {
	
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String pwd = prop.getProperty("password");
		return pwd;
	}

}
