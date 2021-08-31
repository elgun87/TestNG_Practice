package GlobalValuesDrive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GloablValues {

    public static String getProperty(String key) {
        String path = "C:\\Users\\elgun\\IdeaProjects\\Selenium_Rahul_TestNg\\src\\test\\java\\GlobalValuesDrive\\configuration.properties";

        Properties properties = null;
        FileInputStream fileInput = null;
        FileOutputStream fileOut = null;

        try {
             properties = new Properties();
            fileInput = new FileInputStream(path);
            properties.load(fileInput);
        }catch (IOException e){
            e.printStackTrace();
        }

//        properties.setProperty("browser","firefox");
//        FileOutputStream fileOut = new FileOutputStream(path);
//        //Change driver type in properties file
//        properties.store(fileOut,"chrome changed to firefox");


        return properties.getProperty(key);
    }
}
