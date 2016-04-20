package com.example.omnit_000.addition.Tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.omnit_000.addition.MainActivity;

/**
 * Created by Omnit_000 on 4/19/2016.
 */
public class JUnit_Tests extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public JUnit_Tests(){
        super(MainActivity.class);
    }

    public void test_negatives(){
        mainActivity = getActivity();

        assertEquals(-20, mainActivity.add(-10, -10));
    }
    
    public void test_zero(){
        mainActivity = getActivity();
        
        assertEquals(0, mainActivity.add(-10, 10));
    }
    
    public void test_positives(){
        mainActivity = getActivity();
        
        assertEquals(20, mainActivity.add(10, 10));
    }
}
