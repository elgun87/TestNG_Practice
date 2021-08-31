package Annotations_Helper_Tags;

import org.testng.annotations.Test;
/*
There tree Annotations Helper Tag:
1 - dependsOnMethods
2 - enabled
3 - timeOut
 */
public class Helper_Tags_Example {
    //todo this tag will make sure that test_1 method will execute after test_4 method
    @Test(dependsOnMethods = {"test_4"})
    public void test_1(){
        System.out.println("I am test 1");
    }



    //this tag will make sure that method will wait for certain time to execute
    @Test(timeOut = 3000)
    public void test_2(){
        System.out.println("I am test 2");
    }



    //this tag will skip of execution of this method
    @Test(enabled = false)
    public void test_3(){
        System.out.println("I am test 3");
    }


    /*
    If you want to run test_4 method before test_1
    You can use dependsOnMethods tags with test_1 methods.
     */
    @Test
    public void test_4(){
        System.out.println("I am test 4");
    }
}
