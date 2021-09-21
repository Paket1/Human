package com.company;
import java.lang.*;
public class Hand {
    private int sizeofhand;
    private int sizeofpalm;

    public Hand(int sizeofhand, int sizeofpalm){
        //System.out.println("Введите размер руки и ладони");
        this.sizeofhand=sizeofhand;
        this.sizeofpalm=sizeofpalm;
    }

    public int getSizeofhand(){
        return sizeofhand;
    }

    public int getSizeofpaln(){
        return sizeofpalm;
    }
}
