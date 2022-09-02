package com.properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Properties properties = new Properties();
		Set username;
		String str;
		properties.put("ram", "12345");
		properties.put("tom", "sa654");
		properties.put("jerry", "123hg345");
		properties.put("harry", "1235");
		username = properties.keySet();
		Iterator iterator = username.iterator();
		while (iterator.hasNext()) {
			str = (String) iterator.next();
			System.out.println("the user name is " + str + " password is" + properties.getProperty(str));

		}

		str = properties.getProperty("tom", "not found");
		System.out.println("user name is tom and password " + str);
	}
}
