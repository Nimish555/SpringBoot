package com.car.example.bean;

public class Mybean {
    private String Message;

    public void setMessage(String message) {
        Message = message;
    }

    public void print(){
        System.out.println("Message: " + Message);
    }

    @Override
    public String toString() {
        return "Mybean{" +
                "Message='" + Message + '\'' +
                '}';
    }
}
