package com.example.myfirstadtapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	private TextView textView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setVisibility(View.INVISIBLE);
	}

    public void pushedButton(View view) {
        if (textView1.getVisibility() == View.INVISIBLE) {

            textView1.setVisibility(View.VISIBLE);

        } else {

            textView1.setVisibility(View.INVISIBLE);

        }

    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
