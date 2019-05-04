package basic1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features ={"src/test/resources/com/basic/First Rest Assured.feature"},
glue={"com/basic1/MyF1Race.java"})
public class MyF1RaceStepDef {
	
	

}

//C:\Radical\B17CuCuRestAssured\src\test\java\com\basic\MyGoogleFF.feature