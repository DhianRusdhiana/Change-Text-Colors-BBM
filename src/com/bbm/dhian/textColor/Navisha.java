package com.bbm.dhian.textColor;

import android.content.*;
import android.preference.*;
import android.app.*;
import android.os.Process;
import com.bbm.dhian.textColor.*;
import android.net.*;
import android.widget.*;
import android.graphics.*;
import com.bbm.ui.*;
import java.util.*;
import com.bbm.ui.activities.*;
import java.security.*;

public class Navisha
{
	static Context vv;
	
	SharedPreferences sp;
	String font;
	
	public Navisha(Context cc){
		vv = cc;
	}
	public static boolean getBooleanFromkey(String key,Context v) {
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(v);
		return preferences.getBoolean(key, true);
	}
	public static boolean getBooleanFromkeyy(String key) {
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(vv);
		return preferences.getBoolean(key, true);
	}
	public static int getIntFromkey(Context c,String key) {
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(c);
		return preferences.getInt(key , 0);
	}
	public static int getIntegerFromkey(Context c,String key){
		return Integer.valueOf(Navisha.getStringFromkey(c,key));
	}
	public static String getStringFromkey(Context c,String key) {
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(c);
		return preferences.getString(key , "defalut");
	}
	public static float getFloatFromkey(Context v,String key) {
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(v);
		return preferences.getFloat(key , 0);
	}
	public static void Restart(){
		Process.killProcess(Process.myPid());
	}
	public static void ActionView(String p1,Activity b){
		Intent c = new Intent(Intent.ACTION_VIEW,Uri.parse(p1));
		b.startActivity(c);
	}
    
	/*	changelog localChangeLog = new changelog(c);
		if (localChangeLog.firstRun()) {
			localChangeLog.getLogDialog().show();
		}*/
	

	public static void SetchatmessageColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorchat",c)){
			tv.setTextColor(getIntFromkey(c,"massege_normal_color_chat"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetchatbrodcsatColor(Context c,InlineImageTextView tv){
		if(!getBooleanFromkey("backcolorchat",c)){
			tv.setTextColor(getIntFromkey(c,"massege_brodcsat_color_chat"));
			
		}else{
			tv.setTextColor(Color.BLUE);
		}
	}
	public static void SetchatpingColor(Context c,InlineImageTextView tv){
		if(!getBooleanFromkey("backcolorchat",c)){
			tv.setTextColor(getIntFromkey(c,"massege_ping_color_chat"));
			
		}else{
			tv.setTextColor(Color.RED);
		}}
	public static void SetchatnameColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorchat",c)){
			tv.setTextColor(getIntFromkey(c,"name_sender_color_chat"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetchattimeColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorchat",c)){
			tv.setTextColor(getIntFromkey(c,"massege_time_color_chat"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	
	public static void SetchatbarnameColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcoloractionbar",c)){
			tv.setTextColor(getIntFromkey(c,"name_bar_color_chat"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetchatbarstatusColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcoloractionbar",c)){
			tv.setTextColor(getIntFromkey(c,"status_bar_color_chat"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}}
		/* ^^ inchat*/
	public static void SetlistchatmessageColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorlistchat",c)){
			tv.setTextColor(getIntFromkey(c,"msg_nor_color_list"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}}
	public static void SetlistchatnameColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorlistchat",c)){
			tv.setTextColor(getIntFromkey(c,"name_color_list"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetlistchattimeColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorlistchat",c)){
			tv.setTextColor(getIntFromkey(c,"time_color_list"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	
	public static void SetlistchatbarnameColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorlistchat",c)){
			tv.setTextColor(getIntFromkey(c,"name_bar_color_list"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetlistchatbarstatusColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorlistchat",c)){
			tv.setTextColor(getIntFromkey(c,"status_bar_color_list"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}}
		/* ^^ listchat*/
	public static void SetupdatebarstatusColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorupdate",c)){
			tv.setTextColor(getIntFromkey(c,"status_color_update"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}}
	public static void SetupdatebarnameColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorupdate",c)){
			tv.setTextColor(getIntFromkey(c,"name_color_update"));
			
		}else{
			tv.setTextColor(Color.WHITE);
		}}
	public static void SetupdatetimeColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorupdate",c)){
			tv.setTextColor(getIntFromkey(c,"time_color_update"));
		
		}else{
			tv.setTextColor(Color.WHITE);
		}
	/* ^^ updates*/
	}
	public static void SetUpdateSubtitleColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorupdate",c)){
			tv.setTextColor(getIntFromkey(c,"subtitle_update_color"));
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	
	/* listitemConacts */
	public static void SetListContactsTitleColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorcontact",c)){
			tv.setTextColor(getIntFromkey(c,"list_contact_name"));
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetListContactsSubtitleColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorcontact",c)){
			tv.setTextColor(getIntFromkey(c,"list_contact_message"));
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	/* slide menu */
	public static void SetListSlideMenuTitleColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorslide",c)){
			tv.setTextColor(getIntFromkey(c,"slide_menu_title"));
		}else{
			tv.setTextColor(Color.WHITE);
		}
	}
	public static void SetSlideMenuSubtitleColor(Context c,TextView tv){
		if(!getBooleanFromkey("backcolorslide",c)){
			tv.setTextColor(getIntFromkey(c,"slide_menu_subtitle"));
		}else{
			tv.setTextColor(Color.WHITE);
		}
	
	}
	public static void SetGeneralColor(Context c,TextView tv){
		if(!getBooleanFromkey("backgeneral",c)){
			tv.setTextColor(getIntFromkey(c,"general_text_color"));
		}else{
			tv.setTextColor(Color.WHITE);
		}

	}
	
	

	

}
