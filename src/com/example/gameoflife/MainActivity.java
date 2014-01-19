package com.example.gameoflife;

import com.example.gameoflife.R.id;
import com.example.gameoflife.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public 	class MainActivity 
		extends Activity 
		implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.activity_main);
		// Click-handlers for buttons
		View aboutButton = findViewById(id.about_button);
		aboutButton.setOnClickListener(this);
	}
	
	public void onClick(View v){
		switch (v.getId()){
		case id.about_button:
			Intent i=new Intent(this, AboutActivity.class);
			startActivity(i);
			break;
		}
	}
}
