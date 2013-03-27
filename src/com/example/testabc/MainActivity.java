package com.example.testabc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView;
	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView =(TextView)findViewById(R.id.text);
		//textView.setText("Hello I am Atin");
		
		button = (Button)findViewById(R.id.next);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(getApplicationContext(), ScreenTwo.class);
				startActivity(intent);
				
			}
		});
		
	}


}
