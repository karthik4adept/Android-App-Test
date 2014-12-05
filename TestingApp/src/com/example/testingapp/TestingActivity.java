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

TextView text = new TextView(context);
	text .setTextColor(Color.RED);
	text .setText("Welcome to Hudson CI");
	text .setTextSize(30);
	text.setGravity(Gravity.CENTER);
	ll.addView(text );	
	setContentView(ll);
}
}
