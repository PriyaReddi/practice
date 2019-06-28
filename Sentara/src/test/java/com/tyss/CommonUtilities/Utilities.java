
package com.tyss.CommonUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utilities {

	 Properties pobj = new Properties();
	
	public Properties getProperty() throws Throwable
	{
		String path = "E://practice//Sentara//Config//application.properties";
		FileInputStream fis = new FileInputStream(path);
		pobj.load(fis);
		return pobj;
	}
}
