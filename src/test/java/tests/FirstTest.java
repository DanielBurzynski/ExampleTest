package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {

    @Parameters({"Browser","testngpath"})
    @Test
    public void firstTestJenkins(String browser, String testngpath){
        System.out.println("This is first test");
        System.out.println(browser);
        System.out.println(testngpath);
    }
}
