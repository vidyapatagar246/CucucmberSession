package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo1_TestNG {
  @Test
  public void f() {
	  System.out.println("count validation");
  }
  @BeforeMethod
  public void duplicate() {
	  System.out.println("this is duplicate validation");
  }

  @Test(priority=1)
  public void afterMethod() {
	  System.out.println("this is afterMethod Annotation");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is afterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is beforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is afterSuite Annotation");
  }

}
