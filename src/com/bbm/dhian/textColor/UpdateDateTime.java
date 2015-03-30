package com.bbm.dhian.textColor;

import android.widget.*;
import android.content.*;
import android.util.*;
import com.bbm.ui.CustomFontTextView;

public class UpdateDateTime extends CustomFontTextView
{

	public UpdateDateTime(Context context,AttributeSet c) {
		super(context,c);
		TextView rl = (TextView) findViewById(getID("update_date","id"));
		Navisha.SetupdatetimeColor(getContext(),rl);
		
	}
	public UpdateDateTime(Context context) {
		super(context);
		TextView rl = (TextView) findViewById(getID("update_date","id"));
		Navisha.SetupdatetimeColor(getContext(),rl);
	}
	public UpdateDateTime(Context context,AttributeSet c,int i) {
		super(context,c,i);
		TextView rl = (TextView) findViewById(getID("update_date","id"));
		Navisha.SetupdatetimeColor(getContext(),rl);
	}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
	}
