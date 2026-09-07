package com.travelTest.Register;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.RegRepo;

public class ValidateRegisterLink {

	public static void main(String[] args) {
     BrowserOption b = new BrowserOption();
     RegRepo r = new RegRepo(b.launchBrowser("chrome"));
     b.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
     r.regLink();

	}

}
