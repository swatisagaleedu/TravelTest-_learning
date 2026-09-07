package com.travelTest.Register;

import org.openqa.selenium.WebDriver;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.ExcelUtil.Excel;
import com.travelTest.Repo.RegRepo;

public class KDF_Register {

	public static void main(String[] args) throws Exception {
		Excel excel = new Excel();
		String[][] testdatas = excel.excel("./src/test/resources/Travel test.xlsx", "Sheet1");
		for(int i = 0; i < testdatas.length;i++) {
//			System.out.println(testdatas[i][3]);
//			System.out.println("    ");
			String teststep = testdatas[i][3];
			String[] splitTestStep = teststep.split("[0-9]");
			BrowserOption bo = null;
			RegRepo r = null;
			WebDriver browser = null;
			for (String ts : splitTestStep) {
				if (ts.contains("chrome")) {
					bo = new BrowserOption();
					browser = bo.launchBrowser("chrome");
				}
				else if (ts.contains("firefox")) {
					bo = new BrowserOption();
					browser = bo.launchBrowser("firefox");
				}else if (ts.contains("travel test")) {
					bo.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
					Thread.sleep(2000);
				}else if (ts.contains("register link")) {
					r = new RegRepo(browser);
					Thread.sleep(2000);
					r.regLink();			
				}else if (ts.contains("term")&&ts.contains("condition")) {
					r.checkTermAndCondition();
					Thread.sleep(2000);						
				}else if (ts.contains("register")&&ts.contains("button")) {
					r.Register();
					Thread.sleep(2000);
				}
			}
		}
			
       }

}
