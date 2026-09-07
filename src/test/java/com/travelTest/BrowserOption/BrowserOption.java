package com.travelTest.BrowserOption;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserOption {
	private WebDriver w;
	public WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			w = new ChromeDriver();
	}else if (browserName.equals("firefox")) {
		w = new FirefoxDriver();
	}else if (browserName.equals("edge")) {
		w = new EdgeDriver();
	}else if (browserName.equals("safari")) {
		w = new SafariDriver();
	}else {
		System.out.println("Browser not available"+browserName);
	}
	return w;
}
	public void NavigateToProvideURL(String URL) {
		w.get(URL);
	}
	public String currentURL() {
		return w.getCurrentUrl();
	}
		public void quit() {
			w.quit();
		}
		
	}

