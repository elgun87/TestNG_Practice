package day_1;

import base_case.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day_1 extends Base {
    @Test(groups = {"Smoke"})
    public void Demo() {
        System.out.println("Hello in day_1 package");
    }

    @Test
    public void SecondTest() {
        //Assert.fail();
        System.out.println("bye in day_1 package");
    }

    @Test(groups = {"Smoke"})
    public void test_1() {
        System.out.println("test in day_1 package");
    }
}
