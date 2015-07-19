package com.uttara.activities;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.uttara.adapters.ViewPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;
@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {
	
	private static final int NUM_PAGES = 5;
	
	@ViewById
	ViewPager mViewPager;
	@ViewById
	CirclePageIndicator mCirIndicator;
	PagerAdapter mAdapter;
	int[] screens ;
	
	
	
	/*@Click
	void btnSignUp(){
		SignupActivity_.intent(this).start();
		overridePendingTransition(R.animator.slide_in_right, R.animator.slide_out_left);
	}
	@Click
	void btnSignIn(){
		
	}*/
	
	@AfterViews
	void afterViews(){
		screens = new int[]{R.drawable.light_sky_stars_background,R.drawable.android,R.drawable.backgroun1,
				R.drawable.javaframework};
	mAdapter = new ViewPagerAdapter(screens, getApplicationContext());
	mViewPager.setAdapter(mAdapter);
	mCirIndicator.setViewPager(mViewPager);
	
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

}
