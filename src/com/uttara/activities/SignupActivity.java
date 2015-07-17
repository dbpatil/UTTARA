package com.uttara.activities;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

import com.uttara.rohit.Utility;

@EActivity(R.layout.activity_signup)
public class SignupActivity extends Activity {
	
	@ViewById
	EditText etDob;
	@ViewById
	EditText etUttaraId;
	
	@AfterViews
	void afterInitialization(){
		
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				SignupActivity.this);
 
			// set title
			alertDialogBuilder.setTitle("Welcome!");
 
			// set dialog message
			alertDialogBuilder
				.setMessage("Are you uttara Student ?")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						
						Utility.getAlertDialog(
								"Welcome to Uttara",
								"-We need the below mentioned info about you. Please take 2 minutes to fill the info correctly.\n"
										+ "\n-Note that the information given below will be used in the generation of the Course Completion Certificate. Hence provide correct details of the name, email id, DOB, etc\n"
										+ "\n- To complete the registration, you will have to click on the confirmation link that will be sent to your given email id. Also this is the email id that will be used to send all the e-material, job openings, news to. Hence make sure that the provided email id is functional.",
								"Ok", SignupActivity.this).show();
						etUttaraId.setVisibility(View.VISIBLE);
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						Utility.getAlertDialog(
								"Welcome to Uttara",
								"-We need the below mentioned info about you. Please take 2 minutes to fill the info correctly.\n"
										+ "\n-Note that the information given below will be used in the generation of the Course Completion Certificate. Hence provide correct details of the name, email id, DOB, etc\n"
										+ "\n- To complete the registration, you will have to click on the confirmation link that will be sent to your given email id. Also this is the email id that will be used to send all the e-material, job openings, news to. Hence make sure that the provided email id is functional.",
								"Ok", SignupActivity.this).show();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
		
		
		etDob.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(hasFocus){
					Utility.getToast(getApplicationContext(), "focused");
				}
				
			}
		});
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		

	}

}
