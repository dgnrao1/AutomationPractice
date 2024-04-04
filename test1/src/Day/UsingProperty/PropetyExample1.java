package Day.UsingProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;

public class PropetyExample1 {

	public static void main(String[] args) throws IOException {
		String fileLocation="D:\\Automation_ratna\\workspace\\BasicJava\\src\\FirstExample1.property";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileLocation);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}

}
