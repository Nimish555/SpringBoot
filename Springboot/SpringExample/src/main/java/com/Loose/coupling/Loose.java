package com.Loose.coupling;

public class Loose  {
    public static void main(String[] args) {
        //object of App bnaenge
        Userdata data1 = new AppData();
        //object of web bnaenge
        Userdata data2 = new WebData();

        //obj of UserManager
        UserManager userManager = new UserManager(data1);
        System.out.println(userManager.getUserInfo());

        userManager = new UserManager(data2);
        System.out.println(userManager.getUserInfo());



    }

}
