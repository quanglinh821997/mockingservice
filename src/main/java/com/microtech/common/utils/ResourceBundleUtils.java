//package com.microtech.common.utils;
//
//import com.google.common.io.Resources;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLClassLoader;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//import java.util.Locale;
//import java.util.ResourceBundle;
//
//public class ResourceBundleUtils {
//    private static final Logger log = LoggerFactory.getLogger(ResourceBundleUtils.class);
//
//	private static String getString(String key, ResourceBundle rb) {
//		String val = rb.getString(key);
//		String ret = "";
//		try {
//			ret = new String(val.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
//		} catch (Exception e) {
//			ret = "";
//			log.error(e.getMessage(), e);
//		}
//		return ret;
//	}
//
//	public static String getResource(String fileName, Charset charsets)  {
//		String fileContent = "";
//		try {
//			fileContent = Resources.toString(Resources.getResource(fileName), charsets);
//		} catch (IOException e) {
//			log.error(e.getMessage(), e);
//		}
//		return fileContent;
//	}
//
//	public static URL getResourceURL(String fileName) {
//		return Resources.getResource(fileName);
//	}
//
//	public static String getResource(String name, String key) throws MalformedURLException {
//		name = name.replace('/', '.');
//		File file = new File(name);
//		URL[] urls = {file.toURI().toURL()};
//		ClassLoader loader = new URLClassLoader(urls);
//		ResourceBundle rb = ResourceBundle.getBundle(file.getName(), Locale.getDefault(), loader);
//		return getString(key, rb);
//	}
//
//}
