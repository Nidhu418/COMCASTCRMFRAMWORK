package comcastCRM.genericUtulity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./conFigAppData/commondata1.property");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);
		System.out.println("hiHHGHGHJ");
		return data;
	}

}
