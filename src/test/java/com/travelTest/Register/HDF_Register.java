package com.travelTest.Register;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.ExcelUtil.Excel;
import com.travelTest.Repo.RegRepo;

public class HDF_Register {
	
		public static void main(String[] args) throws Exception {
			Excel excel = new Excel();
			String[][] testdatas = excel.excel("./src/test/resources/Travel test.xlsx", "Sheet1");
			for (int i = 0; i < testdatas.length;i++) {
				String[] testdata = testdatas[i][4].split(",");
				String[] teststep = testdatas[i][3].split("[0-9]");
				BrowserOption bo = null;
				RegRepo r = null;
				WebDriver browser = null;
				for (String ts : teststep) {
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
				}else if (ts.contains("full name")) {
					System.out.println(testdata.length);
					r.fullName(testdata[0]);
					Thread.sleep(2000);
				}else if (ts.contains("Email")) {
					r.email(testdata [1]);
					Thread.sleep(2000);
				}else if (ts.contains("Phone number")) {
					r.phone(testdata[2]);
				   System.out.println(testdata.length);
					Thread.sleep(2000);
					}else if(ts.contains("male"))
					{
					//System.out.println(testdata.length);
					r.gender("male");
					Thread.sleep(2000);
					}else if(ts.contains("Password"))
					{
					//System.out.println(testdata.length);
					r.password(testdata[3]);
					Thread.sleep(2000);
					}else if(ts.contains("Confirm password"))
					{
					r.confirmPassword(testdata[4]);
					Thread.sleep(2000);
					}else if(ts.contains("register")&&ts.contains("button"))
					{
						r.Register();
						Thread.sleep(2000);
					
				}
					
				}
					
			}
			
				
		}


	}


