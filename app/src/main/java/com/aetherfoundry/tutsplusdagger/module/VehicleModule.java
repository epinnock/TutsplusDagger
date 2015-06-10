package com.aetherfoundry.tutsplusdagger.module;

/**
 * Created by EJ on 6/10/2015.
 */

import com.aetherfoundry.tutsplusdagger.model.Motor;
import com.aetherfoundry.tutsplusdagger.model.Vehicle;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;


/*
This class is going to provide the objects you will need with its dependencies satisfied.
 */
@Module
public class VehicleModule {


    /*
    every provider (or method) must have the @Provides annotation and the class must have the @Module annotation.
    The @Singleton annotation indicates that there will be only one instance of the object.
     */
    @Provides @Singleton
    Motor providesMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle providesVehicle(){
        return new Vehicle(new Motor());
    }
}
