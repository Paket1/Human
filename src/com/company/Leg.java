package com.company;

public class Leg {
    private int sizeofleg;
    private int sizeoffoot;

    public Leg(int sizeofleg, int sizeoffoot){
        //System.out.println("Введите размер ноги и стопы");
        this.sizeofleg=sizeofleg;
        this.sizeoffoot=sizeoffoot;
    }

    public int getSizeofleg(){
        return sizeofleg;
    }

    public int getSizeoffoot(){
        return sizeoffoot;
    }
}
