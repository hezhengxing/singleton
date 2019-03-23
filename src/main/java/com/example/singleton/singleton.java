package com.example.singleton;

public class singleton {
    private singleton(){

    }
    private static singleton instance = new singleton();

    public singleton getInstance()
    {
        return instance;
    }
}
