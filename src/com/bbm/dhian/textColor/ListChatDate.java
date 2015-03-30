package com.bbm.dhian.textColor;

import android.widget.*;
import android.content.*;
import android.util.*;
import com.bbm.ui.CustomFontTextView;

public class ListChatDate extends CustomFontTextView
{

	public ListChatDate(Context context,AttributeSet c) {
		super(context,c);
		TextView rl = (TextView) findViewById(getID("chat_date","id"));
		Navisha.SetlistchattimeColor(getContext(),rl);
		
	}
	public ListChatDate(Context context) {
		super(context);
		TextView rl = (TextView) findViewById(getID("chat_date","id"));
		Navisha.SetlistchattimeColor(getContext(),rl);
	}
	public ListChatDate(Context context,AttributeSet c,int i) {
		super(context,c,i);
		TextView rl = (TextView) findViewById(getID("chat_date","id"));
		Navisha.SetlistchattimeColor(getContext(),rl);
	}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
	}
