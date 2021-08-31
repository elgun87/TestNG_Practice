package Practice.package_1;

import org.testng.annotations.Test;

public class CarLoan {
    @Test(groups = {"smoke"})
    public void mercedesCredit() {
        System.out.println("This is car loan mercedes credit");
    }

    @Test(groups = {"smoke"})
    public void bmwCredit() {
        System.out.println("This is car loan bmw credit");
    }

    @Test(groups = {"smoke"})
    public void chevyLoan() {
        System.out.println("This is car loan chevy credit");
    }
}
