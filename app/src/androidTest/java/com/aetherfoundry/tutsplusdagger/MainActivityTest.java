package com.aetherfoundry.tutsplusdagger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by EJ on 6/10/2015.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

   // @LargeTest

        @Rule
        public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);



        @Test
        public void getAccelerateButtonShown(){
            onView(withText("Accelerate")).check(matches(isDisplayed()));
        }

        @Test
        public void getBrakeButtonShown(){
            onView(withText("Brake")).check(matches(isDisplayed()));
        }

       @Test
        public void getCarButtonShown() {
        onView(withText("Get Car")).check(matches(isDisplayed()));
        }

}
