package data_provider_annotations;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
    public class Test {
        @org.testng.annotations.Test(dataProvider = "Valid_Test_Credentials")
        public void test_1(String name,String password){
            System.out.println(name);
            System.out.println(password);
        }


        @DataProvider(name = "Valid_Test_Credentials")
        public Object[][] getData(){
            Object[][] data = new Object[3][2];
            data[0][0] = "Suleyman";
            data [0][1] = "Suleyman123";
            data [1][0] = "Behruz";
            data [1][1] = "Behruz123";
            data [2][0] = "Mehdi";
            data [2][1] = "Mehdi123";
            return data;
        }
    }
}
