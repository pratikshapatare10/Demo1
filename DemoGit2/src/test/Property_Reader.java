package test;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_Reader {

	String configPath="C:\\Users\\pratiksha.patare\\git\\JuneEve\\DemoGit2\\Configuration\\config.properties";
	Properties pro;
	
	public Property_Reader()
	{
		 pro=new Properties();
		 try {
			FileInputStream file=new FileInputStream(configPath);
			pro.load(file);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public String getChromeKey()
	{
		String key=pro.getProperty("chromeKey");
		return key;
	}
	
	public String getChromePath()
	{
		String path=pro.getProperty("ChromeDriverPath");
		return path;
	}
}
