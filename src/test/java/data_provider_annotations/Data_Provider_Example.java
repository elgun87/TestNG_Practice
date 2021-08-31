package data_provider_annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Example {
    @Test(dataProvider = "Valid Credentials")
    public void example_1(String userName,String password){
        System.out.println(userName);
        System.out.println(password);
    }

    @DataProvider(name = "Valid Credentials")
    public Object[] data(){
        Object [][] data = new Object[2][2];
        data [0][0] = "user1";
        data [0][1] = "password1";
        data [1][0] = "user2";
        data [1][1] = "password2";
        return data;
    }
}
