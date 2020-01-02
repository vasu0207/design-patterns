package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class TestPrototype {


    public static void main(String[] args) throws CloneNotSupportedException {
    System.out.println("Entered Main");
        AccessControl ac = AccessControlProvider.getAccessControlObject("USER");
        User us = new User("FNAME","USER",ac);
        AccessControl ac1 = AccessControlProvider.getAccessControlObject("MANAGER");
        User us1 = new User("LNAME","MANAGER",ac1);

        System.out.println(us.toString());
        System.out.println(us1.toString());
    System.out.println("Exist Main");
    }
}
