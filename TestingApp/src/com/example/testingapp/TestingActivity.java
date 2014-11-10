package com.example.testingapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestingActivity extends Activity {
	Context context=TestingActivity.this;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	LinearLayout ll=new LinearLayout(context);
	TextView tv=new TextView(context);
	tv.setText("Welcome to Hudson CI");
	tv.setTextSize(20);
	tv.setGravity(Gravity.CENTER);
	ll.addView(tv);	
	setContentView(ll);
}
}
