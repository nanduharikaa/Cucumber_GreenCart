package utilities;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class Utils {
		public static String fileName="./TestData/Config.properties";
		public static Properties properties;
		static {
			File f=new File(fileName);					
			properties=new Properties();
			FileInputStream in;
			try {
				in=new FileInputStream(f);
				properties.load(in);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static String getFileProperty(String key) {  
			String value=null;
			try {
				File f=new File(fileName);
				if(f.exists()) {
					value=properties.getProperty(key);
				}
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return value;
		}																	
	}

