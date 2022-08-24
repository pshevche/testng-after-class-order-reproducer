package dev.pshevche;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LoggingListener.class)
public class AfterClassTest {

    @BeforeClass
    public void setupClass() {
    }

    @AfterClass
    public void cleanupClass() {
    }

    @Test
    public void test1() {
    }

}
