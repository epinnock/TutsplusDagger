package com.aetherfoundry.tutsplusdagger;

import android.support.test.runner.AndroidJUnit4;

import com.aetherfoundry.tutsplusdagger.model.Motor;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

/**
 * Created by EJ on 6/10/2015.
 */

@RunWith(AndroidJUnit4.class)
public class ObjectUnitTest {
public  Motor m=new Motor();

    public void setUp(){
        m=new Motor();
    }

    @Test
    public void firstTest()
    {

        String str="Hello World";
        assertEquals("Hello World",str);
    }

    @Test
    public void motorIntializationTest(){
        assertTrue(m!=null);
    }

    @Test
    public void assertBaseSpeedTest(){
        assertEquals(0,m.getRpm());
    }

    public void assertAccelerationTest(){
        m.accelerate(5);
        assertEquals(5,m.getRpm());
    }
}
