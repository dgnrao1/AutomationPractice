package Day.UsingProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample2 {

	public static void main(String[] args) throws IOException {
		//String fileLocation="D:\\Automation_ratna\\workspace\\BasicJava\\src\\FirstExample1.property";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\Automation_ratna\\workspace\\BasicJava\\src\\FirstExample1.property");
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
