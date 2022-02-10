package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Parameters("Environment")
public class FirstTest {

    @Parameters({"Environment","baseUri"})
    @BeforeTest
    public void beforeMethod(String environment, String baseUri){
        System.out.println(environment);
        String path = "src/main/resources/"+ environment +".properties";
        System.out.println(path);

    }

    @Parameters({"Browser","testngpath"})
    @Test
    public void firstTestJenkins(String browser, String testngpath){
        System.out.println("This is first test");
        System.out.println(browser);
        System.out.println(testngpath);


    }
}
