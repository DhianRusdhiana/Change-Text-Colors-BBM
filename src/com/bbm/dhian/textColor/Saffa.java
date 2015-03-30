package com.bbm.dhian.textColor;

import android.preference.*;
import android.preference.Preference.*;
import android.os.*;
import android.content.*;
import android.net.*;
import android.widget.*;
import android.app.*;
import android.os.Process;
import java.net.*;
import android.app.*;
import android.app.ActivityManager.*;
import android.content.*;
import android.content.SharedPreferences.*;
import android.content.pm.*;
import android.content.pm.PackageManager.*;
import android.net.*;
import android.os.*;
import android.preference.*;
import android.preference.Preference.*;
import android.widget.*;
import java.io.*;
import java.util.*;
import android.app.TimePickerDialog.*;

public class Saffa extends PreferenceActivity implements OnSharedPreferenceChangeListener
{
	private List<ApplicationInfo> userApps = new ArrayList<ApplicationInfo>();
	private final String backupMainPath = "/sdcard/GB Battery-Backup/";
	private PackageManager manager;
	
	
	public static SharedPreferences settings;
	
	// coloractionbar
	private android.preference.Preference ff;
	private android.preference.Preference gg;
	
// colochat
	
	private android.preference.Preference aa;
	private android.preference.Preference bb;
	private android.preference.Preference cc;
	private android.preference.Preference dd;
	private android.preference.Preference ee;
	
	
	//
//cololistchat
	private android.preference.Preference aaa;
	private android.preference.Preference bbb;
	private android.preference.Preference ccc;
	
    //
//colorupdte
	private android.preference.Preference aaaa;
	private android.preference.Preference bbbb;
	private android.preference.Preference cccc;
	private android.preference.Preference dddd;
	//
	// listcontactcolor
	private android.preference.Preference lcca;
	private android.preference.Preference lccb;
	
	// slide menu
	private android.preference.Preference smt;
	private android.preference.Preference sms;
	
	private android.preference.Preference gtc;
	// font style
	private android.preference.Preference fs;

		
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(getID("navisha","xml"));
		

		settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    	

		aa = findPreference("massege_normal_color_chat");
	    bb = findPreference("massege_brodcsat_color_chat");
	    cc = findPreference("massege_ping_color_chat");
	    dd = findPreference("massege_time_color_chat");
		ee = findPreference("name_sender_color_chat");
		
		
	    ff = findPreference("name_bar_color_chat");
	    gg = findPreference("status_bar_color_chat");
	    
		
		aaa = findPreference("msg_nor_color_list");
	    bbb = findPreference("time_color_list");
	    ccc = findPreference("name_color_list");
	    
	    
		
		aaaa = findPreference("status_color_update");
	    bbbb = findPreference("time_color_update");
		cccc = findPreference("name_color_update");
		dddd = findPreference("subtitle_update_color");
	

		lcca = findPreference("list_contact_name");
		lccb = findPreference("list_contact_message");
		
		smt = findPreference("slide_menu_title");
		sms = findPreference("slide_menu_subtitle");
		
		gtc = findPreference("general_text_color");
		
		fs = findPreference("preference_font_face");
				}

	public int getID(String name, String Type) {
		return getBaseContext().getResources().getIdentifier(name, Type, getBaseContext().getPackageName());
	}
	
	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharePreferences, String key){
		
		setEnableActionbarColor();
		setEnableChatcolor();
		setEnableListChatcolor();
		setEnableUpdatcolor();
		setEnableListContact();
		setEnableSlideMenu();
		setEnableFontStyle();
		setEnableGeneral();
		
		}	
			

		@Override
		protected void onResume()
		{
			// TODO: Implement this method
			super.onResume();
			 getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
			
			setEnableActionbarColor();
			setEnableChatcolor();
			setEnableListChatcolor();
			setEnableUpdatcolor();
			setEnableListContact();
			setEnableSlideMenu();
			setEnableFontStyle();
			setEnableGeneral();
		}

		@Override
		protected void onDestroy()
		{
			// TODO: Implement this method
			super.onDestroy();
			 getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
			
			setEnableActionbarColor();
			setEnableChatcolor();
			setEnableListChatcolor();
			setEnableUpdatcolor();
			setEnableListContact();
			setEnableSlideMenu();
			setEnableFontStyle();
			setEnableGeneral();
		}
	public void setEnableActionbarColor(){
		if(!Navisha.getBooleanFromkey("backcoloractionbar",getBaseContext())){
			ff.setEnabled(true);
			gg.setEnabled(true);
		}else{
			ff.setEnabled(false);
			gg.setEnabled(false);
		}
	}	
		
	public void setEnableChatcolor(){
		if(!Navisha.getBooleanFromkey("backcolorchat",getBaseContext())) {
			aa.setEnabled(true);
			bb.setEnabled(true);
			cc.setEnabled(true);
			dd.setEnabled(true);
			ee.setEnabled(true);
			
		}else{
			aa.setEnabled(false);
			bb.setEnabled(false);
			cc.setEnabled(false);
			dd.setEnabled(false);
			ee.setEnabled(false);
			
			
		}}
	public void setEnableListChatcolor(){
		if(!Navisha.getBooleanFromkey("backcolorlistchat",getBaseContext())) {
			aaa.setEnabled(true);
			bbb.setEnabled(true);
			ccc.setEnabled(true);
		
			
		}else{
			aaa.setEnabled(false);
			bbb.setEnabled(false);
			ccc.setEnabled(false);
			
			
		}}
	public void setEnableUpdatcolor(){
		if(!Navisha.getBooleanFromkey("backcolorupdate",getBaseContext())) {
			aaaa.setEnabled(true);
			bbbb.setEnabled(true);
			cccc.setEnabled(true);
			dddd.setEnabled(true);
		}else{
			aaaa.setEnabled(false);
			bbbb.setEnabled(false);
			cccc.setEnabled(false);
			dddd.setEnabled(false);
		}}
		
	public void setEnableListContact(){
		if(!Navisha.getBooleanFromkey("backcolorcontact",getBaseContext())) {
			lcca.setEnabled(true);
			lccb.setEnabled(true);
		}else{
			lcca.setEnabled(false);
			lccb.setEnabled(false);
		}
	}
	public void setEnableSlideMenu(){
		if(!Navisha.getBooleanFromkey("backcolorslide",getBaseContext())) {
			smt.setEnabled(true);
			sms.setEnabled(true);
		}else{
			smt.setEnabled(false);
			sms.setEnabled(false);
		}
	}
	public void setEnableFontStyle(){
		if(!Navisha.getBooleanFromkey("backfontstyle",getBaseContext())){
			fs.setEnabled(true);
		}else{
			fs.setEnabled(false);
		}
	}
	public void setEnableGeneral(){
		if(!Navisha.getBooleanFromkey("backgeneral",getBaseContext())){
			gtc.setEnabled(true);
		}else{
			gtc.setEnabled(false);
		}
	}	
	
		}
