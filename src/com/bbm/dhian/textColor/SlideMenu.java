package com.bbm.dhian.textColor;

import android.widget.*;
import android.content.*;
import android.util.*;
import android.preference.*;
import com.bbm.ui.CustomFontTextView;

public class SlideMenu extends CustomFontTextView
{
	public static SharedPreferences settings;
	TextView rl;

	public SlideMenu(Context context,AttributeSet c) {
		super(context,c);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());
		if(getId() == getID("slide_menu_item_title","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_title","id"));
			Navisha.SetListSlideMenuTitleColor(context,rl);	
		}
		if(getId() == getID("slide_menu_item_subTitle","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_subTitle","id"));
			Navisha.SetSlideMenuSubtitleColor(context,rl);
		}
		}
	public SlideMenu(Context context) {
		super(context);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());
		if(getId() == getID("slide_menu_item_title","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_title","id"));
			Navisha.SetListSlideMenuTitleColor(context,rl);	
		}
		if(getId() == getID("slide_menu_item_subTitle","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_subTitle","id"));
			Navisha.SetSlideMenuSubtitleColor(context,rl);
		}
	}
	public SlideMenu(Context context,AttributeSet c,int i) {
		super(context,c,i);
		settings = PreferenceManager.getDefaultSharedPreferences(getContext());
		if(getId() == getID("slide_menu_item_title","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_title","id"));
			Navisha.SetListSlideMenuTitleColor(context,rl);	
		}
		if(getId() == getID("slide_menu_item_subTitle","id")){
			rl = (TextView) findViewById(getID("slide_menu_item_subTitle","id"));
			Navisha.SetSlideMenuSubtitleColor(context,rl);
		}
	}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
}
