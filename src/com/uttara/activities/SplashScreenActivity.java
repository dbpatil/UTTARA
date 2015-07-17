package com.uttara.activities;

import java.util.Timer;
import java.util.TimerTask;

import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.os.Bundle;

@EActivity(R.layout.activity_splash_screen)
public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TimerTask task = new TimerTask() {
			 
            @Override
            public void run() {
 
                // go to the main activity
                MainActivity_.intent(SplashScreenActivity.this).start();
                overridePendingTransition(R.animator.slide_in_left, R.animator.slide_out_right);
                // make sure splash screen activity is gone
               // SplashScreenActivity.this.finish();
 
            }
 
        };
 
        // Schedule a task for single execution after a specified delay.
        // Show splash screen for 4 seconds
        new Timer().schedule(task, 4000);
	
	}
}
