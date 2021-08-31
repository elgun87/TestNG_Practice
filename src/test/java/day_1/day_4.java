package day_1;

import base_case.Base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
In xml file i will exclude all this method located inside this class
in XML file when you do foo.* it will exclude all method which starts foo will be eliminated
 */
public class day_4 extends Base {
    @Test(groups = {"Smoke"})
    public void foo_1() {
        System.out.println("foo 1");
    }


    @Test
    public void foo_2( ) {
        System.out.println("foo 2");

    }


    @Test
    public void foo_3() {
        System.out.println("foo 3");
    }

    @Test
    public void foo_4() {
        System.out.println("foo 4");
    }


    @Test
    public void test_5() {
        System.out.println("test 5");
    }


}
