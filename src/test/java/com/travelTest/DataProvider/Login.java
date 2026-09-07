package com.travelTest.DataProvider;

import org.testng.annotations.DataProvider;

import com.travelTest.ExcelUtil.Excel;

public class Login {

	@DataProvider(name = "LoginTestData")
	public String[][] login() throws Exception{
	         return new Excel().excel("./src/test/resources/Login.xlsx","Sheet1");
	}
}
