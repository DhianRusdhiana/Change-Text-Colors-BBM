package com.bbm.dhian.textColor;

import android.app.*;
import android.os.*;
import android.os.Process;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View.OnClickListener;

import android.net.*;


import java.net.*;

import android.app.ActivityManager.*;


import android.content.pm.*;
import android.content.pm.PackageManager.*;

import java.io.*;
import java.util.*;

public class MainActivity extends Activity
{
	Button button;
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		addListenerOnButton();
	}
	public void Restart(){
		Process.killProcess(Process.myPid());
	}

	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(context, Saffa.class);
					startActivity(intent);   

				}

			});

	}
	public int getID(String name, String Type) {
		return getBaseContext().getResources().getIdentifier(name, Type, getBaseContext().getPackageName());
	}
	
	
}
