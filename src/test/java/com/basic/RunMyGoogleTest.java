package com.basic;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features ={"src/resources/com/basic/MyGoogleFF.feature"},
	glue={"com/basic"})
	
	public class RunMyGoogleTest {
		
		
	}


	// C:\Radical\B17CuCuRestAssured\src\test\java\com\basic\MyGoogleFF.feature