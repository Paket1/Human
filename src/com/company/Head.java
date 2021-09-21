package com.company;
import java.lang.*;
public class Head {
    private String eyes;
    private String hair;

    public Head(String eyes, String hair){
        //System.out.println("Введите цвет глаз и волос");
        this.eyes = eyes;
        this.hair = hair;
    }

    public String getEyes(){
        return eyes;
    }

    public String getHair(){
        return hair;
    }
}
