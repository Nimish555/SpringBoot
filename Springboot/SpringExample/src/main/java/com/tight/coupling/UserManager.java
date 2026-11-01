package com.tight.coupling;

public class UserManager {

    //Instance
    private final UserDatabse userDatabse = new UserDatabse();

    public String getUserInfo() {
        return userDatabse.getUserDetails();
    }
}
