package com.aetherfoundry.tutsplusdagger.component;

import com.aetherfoundry.tutsplusdagger.model.Vehicle;
import com.aetherfoundry.tutsplusdagger.module.VehicleModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by EJ on 6/10/2015.
 */



/*
Next to the @Component annotation, you have to specify which modules are going to be used—
in this case I use VehicleModule, which we created earlier. If you need to use more modules,
then just add them using a comma as a separator.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}