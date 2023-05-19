package tests.Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01 {
    @Test(priority = 10)
    public void didem(){
        System.out.println("Didem");
    }
    @Test(enabled = false)  // @Ignore
    public void zeynep(){
        System.out.println("Zeynep");
    }
    @Test(priority = -5)
    public void kadir(){
        System.out.println("H.Kadir");
    }
    @Test(dependsOnMethods = "Kerem")
    public void erdal(){
        System.out.println("Erdal");
    }
    @Test
    public void kerem(){
        System.out.println("Kerem");
    }
    @Test
    public void nur(){
        System.out.println("Nur");
    }
    @Test
    public void Bulent(){
        System.out.println("Bulent");
    }
}
