package com.example.testingapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
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
	ll.setOrientation(LinearLayout.VERTICAL);
	TextView tv=new TextView(context);
	tv.setTextColor(Color.RED);
	tv.setText("Welcome to Hudson CI");
	tv.setTextSize(30);
	tv.setGravity(Gravity.CENTER);
	ll.addView(tv);	
        TextView tv1=new TextView(context);
	tv1.setText("Welcome to Jenkins CI");
	tv1.setTextSize(30);
	tv1.setTextColor(Color.GREEN);
	tv1.setGravity(Gravity.LEFT);
	ll.addView(tv1);
	TextView tv3=new TextView(context);
	tv3.setTextColor(Color.RED);
	tv3.setText("Welcome ");
	tv3.setTextSize(30);
	tv3.setGravity(Gravity.CENTER);
	ll.addView(tv3);	
	setContentView(ll);
}
}
