package day_1;

import org.testng.annotations.*;
/*
To pull data from XML file you can define data inside
<parameter> in XML file tag and if you declare this tag under suite folder it will be applicable for everyone.
Then in which method you need use this data you go there above that method use @Parameters.Then run xml file.
See below code:
Only this method can pull data from XML.
if you want other method to use this data you need to declare @Parameters for evey method you want.
 */

public class Pull_Data_From_XML_File {
    @Parameters({"Message","Message2"})
    @Test
    public void get_data_from_xml(String message,String message2){
        System.out.println(message);
        System.out.println(message2);
    }

}
