package com.company;

public class Human {
    public Head head;
    public Hand hand;
    public Leg leg;

    public Human(String eyes, String hair, int sizeofhand, int sizeofpalm, int sizeofleg, int sizeoffoot){
        this.head = new Head(eyes, hair);
        this.hand = new Hand(sizeofhand, sizeofpalm);
        this.leg = new Leg(sizeofleg, sizeoffoot);
    }

}
