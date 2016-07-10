import java.io.InputStream;
import java.util.Properties;


public class AutomationreadProperties {
	private static Properties configProp= new Properties();
	public AutomationreadProperties()
	{
		InputStream in=this.getClass().getClassLoader().getResourceAsStream("Locators.Properties");
		try{
			configProp.load(in);
		
		}catch(Exception e){
			System.out.println("error");
		}
	}
	public String getProperties(String key){
		return configProp.getProperty(key);
	}

}
