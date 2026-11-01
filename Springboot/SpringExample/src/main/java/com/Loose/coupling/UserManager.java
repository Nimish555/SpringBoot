package com.Loose.coupling;

public class UserManager {

//refrence variable is created
private Userdata userdata;


//constructor
public UserManager(Userdata userdata){
    this.userdata = userdata;
}

public String getUserInfo(){
    return userdata.getUserData();
}


}
