package com.atmecs.constants;

import java.io.File;

public class ProjectPathConstants {
	public static String currentdir = System.getProperty("user.dir") + File.separator;
	public static String resources = currentdir +  File.separator + "resources" + File.separator;
	public static String log = currentdir +  File.separator + "log" + File.separator;
	//config
	public static String config = resources + "config.properties";

	
	
	//menu
	public static String menu= resources+"Menu.properties";
	
	
	//log
	public static String logpropertyfile=log+"log.properties";

}
