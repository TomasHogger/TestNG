package main;

import org.testng.annotations.Test;
import test.Priority;
import test.TestMethodInfo;

import static junit.framework.Assert.assertEquals;

public class TestNG {

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }

}
