package com.aetherfoundry.tutsplusdagger.model;

import javax.inject.Inject;

/**
 * Created by EJ on 6/10/2015.
 */
public class Vehicle {

    private Motor motor;


    /*
    use the @Inject annotation to request dependencies in the constructor, fields, or methods.
     */
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}