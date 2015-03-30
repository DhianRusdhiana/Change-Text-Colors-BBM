package com.bbm.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bbm.dhian.textColor.*;
import android.graphics.*;
import android.content.*;
import android.preference.*;

import android.view.*;
import android.widget.*;
import android.view.View.*;
import java.util.*;


public class GeneralButton extends Button
{

	public static SharedPreferences settings;
	public GeneralButton(Context context,AttributeSet c) {
		super(context,c);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());

		Navisha.SetGeneralColor(context,this);	
	}
	public GeneralButton(Context context) {
		super(context);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());

		Navisha.SetGeneralColor(context,this);	
	}
	public GeneralButton(Context context,AttributeSet c,int i) {
		super(context,c,i);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());

		Navisha.SetGeneralColor(context,this);	
	}
}
