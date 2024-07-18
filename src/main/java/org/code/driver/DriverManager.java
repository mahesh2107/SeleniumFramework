package org.code.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;




public class DriverManager {
    static WebDriver driver;


    @BeforeMethod
    static void init() {
        if (driver == null) {
            driver = new EdgeDriver();
        }
    }


}
