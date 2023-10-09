package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDatafomPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url = pobj.getProperty("url");
		System.out.println(Url);
		String username = pobj.getProperty("username");
		System.out.println(username);
		String pwd = pobj.getProperty("password");
		System.out.println(pwd);
	}

}
