package Practice.package_1;

import org.testng.annotations.Test;

public class PhoneLoan {
    @Test
    public void storeCredit() {
        System.out.println("This is phone store credit");
    }

    @Test
    public void onlineCredit() {
        System.out.println("This is phone online credit");
    }

    @Test(dependsOnMethods = "onlineCredit")
    public void inPersonCredit() {
        System.out.println("This is phone inperson loan");
    }
}
