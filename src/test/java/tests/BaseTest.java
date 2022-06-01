package tests;

import org.testng.annotations.*;
import utilities.Driver;
import utilities.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}