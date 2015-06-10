package com.aetherfoundry.tutsplusdagger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.aetherfoundry.tutsplusdagger.component.VehicleComponent;
import com.aetherfoundry.tutsplusdagger.component.DaggerVehicleComponent;
import com.aetherfoundry.tutsplusdagger.model.Vehicle;
import com.aetherfoundry.tutsplusdagger.module.VehicleModule;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    Vehicle vehicle;
    VehicleComponent component;
    @InjectView(R.id.getCar) Button getCar;
    @InjectView(R.id.accelerate) Button accelerate;
    @InjectView(R.id.brake) Button brake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    Handles button clicks for the main layout buttons
     */
    @OnClick({R.id.getCar,R.id.accelerate,R.id.brake})
    public void buttonClick(Button b){
        switch(b.getId()) {
            case(R.id.getCar):
                vehicle = component.provideVehicle();
                Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
                break;
            case(R.id.accelerate):
                vehicle.increaseSpeed(5);
                Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
                break;
            case(R.id.brake):
                vehicle.stop();
                Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
