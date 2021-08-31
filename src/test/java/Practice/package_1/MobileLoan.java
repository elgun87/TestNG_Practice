package Practice.package_1;

import org.testng.annotations.Test;

public class MobileLoan {
    @Test(groups = {"smoke"})
    public void samsungCredit() {
        System.out.println("This is mobile loan samsung credit");
    }

    @Test(groups = {"smoke"})
    public void iphoneCredit() {
        System.out.println("This is mobile loan iphone credit");
    }

    @Test(groups = {"smoke"})
    public void sonyCredit() {
        System.out.println("This is mobile loan sony credit");
    }
}
