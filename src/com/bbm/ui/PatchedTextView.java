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
import android.text.ClipboardManager;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import java.util.*;

public class PatchedTextView extends TextView
{
	TextView rl;
	public static SharedPreferences settings;
		public PatchedTextView(Context context,AttributeSet c) {
		super(context,c);
			settings = PreferenceManager.getDefaultSharedPreferences(getContext());
			if(getId() == getID("message_body","id")){
				rl = (TextView) findViewById(getID("message_body","id"));
				Navisha.SetchatmessageColor(context,rl);	
			}
			if(getId() == getID("update_title","id")){
				rl = (TextView) findViewById(getID("update_title","id"));
				Navisha.SetupdatebarnameColor(context,rl);
			}
			if(getId() == getID("update_message","id")){
				rl = (TextView) findViewById(getID("update_message","id"));
				Navisha.SetupdatebarstatusColor(context,rl);
			}
			if(getId() == getID("actionbar_name","id")){
			    rl = (TextView) findViewById(getID("actionbar_name","id"));
				Navisha.SetchatbarnameColor(context,rl);
				}
			if(getId() == getID("actionbar_status_message","id")){
				rl = (TextView) findViewById(getID("actionbar_status_message","id"));
				Navisha.SetchatbarstatusColor(context,rl);
			}
			if(getId() == getID("chat_message","id")){
				rl = (TextView) findViewById(getID("chat_message","id"));
				Navisha.SetlistchatmessageColor(context,rl);
			}
			if(getId() == getID("chat_date","id")){
				rl = (TextView) findViewById(getID("chat_date","id"));
				Navisha.SetlistchattimeColor(context,rl);
			}
			if(getId() == getID("chat_title","id")){
				rl = (TextView) findViewById(getID("chat_title","id"));
				Navisha.SetlistchatnameColor(context,rl);
			}
		if(getId() == getID("message_sender","id")){
			    rl = (TextView) findViewById(getID("message_sender","id"));
				Navisha.SetchatnameColor(context,rl);
			}
			if(getId() == getID("contact_name","id")){
			    rl = (TextView) findViewById(getID("message_sender","id"));
				Navisha.SetListContactsTitleColor(context,rl);
			}
			if(getId() == getID("contact_message","id")){
			    rl = (TextView) findViewById(getID("message_sender","id"));
				Navisha.SetListContactsSubtitleColor(context,rl);
			}
			if(getId() == getID("profile_mood","id")){
				initGB();
			}				
			}
			public PatchedTextView(Context context) {
	        	super(context);
				settings = PreferenceManager.getDefaultSharedPreferences(getContext());
				if(getId() == getID("update_title","id")){
					rl = (TextView) findViewById(getID("update_title","id"));
					Navisha.SetupdatebarnameColor(context,rl);
				}
				if(getId() == getID("update_message","id")){
					rl = (TextView) findViewById(getID("update_message","id"));
					Navisha.SetupdatebarstatusColor(context,rl);
				}
				if(getId() == getID("actionbar_name","id")){
					rl = (TextView) findViewById(getID("actionbar_name","id"));
					Navisha.SetchatbarnameColor(context,rl);
				}
				if(getId() == getID("actionbar_status_message","id")){
					rl = (TextView) findViewById(getID("actionbar_status_message","id"));
					Navisha.SetchatbarstatusColor(context,rl);
				}
				if(getId() == getID("chat_message","id")){
					rl = (TextView) findViewById(getID("chat_message","id"));
					Navisha.SetlistchatmessageColor(context,rl);
				}
				if(getId() == getID("chat_date","id")){
					rl = (TextView) findViewById(getID("chat_date","id"));
					Navisha.SetlistchattimeColor(context,rl);
				}
				if(getId() == getID("chat_title","id")){
					rl = (TextView) findViewById(getID("chat_title","id"));
					Navisha.SetlistchatnameColor(context,rl);
				}
				if(getId() == getID("message_body","id")){
					rl = (TextView) findViewById(getID("message_body","id"));
					Navisha.SetchatmessageColor(context,rl);	
				}
				if(getId() == getID("message_sender","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetchatnameColor(context,rl);
				}
				if(getId() == getID("contact_name","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetListContactsTitleColor(context,rl);
				}
				if(getId() == getID("contact_message","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetListContactsSubtitleColor(context,rl);
				}
				if(getId() == getID("profile_mood","id")){
					initGB();
				}				
			}
			public PatchedTextView(Context context,AttributeSet c,int i) {
	        	super(context,c,i);
				settings = PreferenceManager.getDefaultSharedPreferences(getContext());
				if(getId() == getID("message_body","id")){
					rl = (TextView) findViewById(getID("message_body","id"));
					Navisha.SetchatmessageColor(context,rl);	
				}
				if(getId() == getID("update_title","id")){
					rl = (TextView) findViewById(getID("update_title","id"));
					Navisha.SetupdatebarnameColor(context,rl);
				}
				if(getId() == getID("update_message","id")){
					rl = (TextView) findViewById(getID("update_message","id"));
					Navisha.SetupdatebarstatusColor(context,rl);
				}
				if(getId() == getID("actionbar_name","id")){
					rl = (TextView) findViewById(getID("actionbar_name","id"));
					Navisha.SetchatbarnameColor(context,rl);
				}
				if(getId() == getID("actionbar_status_message","id")){
					rl = (TextView) findViewById(getID("actionbar_status_message","id"));
					Navisha.SetchatbarstatusColor(context,rl);
				}
				if(getId() == getID("chat_message","id")){
					rl = (TextView) findViewById(getID("chat_message","id"));
					Navisha.SetlistchatmessageColor(context,rl);
				}
				if(getId() == getID("chat_date","id")){
					rl = (TextView) findViewById(getID("chat_date","id"));
					Navisha.SetlistchattimeColor(context,rl);
				}
				if(getId() == getID("chat_title","id")){
					rl = (TextView) findViewById(getID("chat_title","id"));
					Navisha.SetlistchatnameColor(context,rl);
				}
				if(getId() == getID("message_sender","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetchatnameColor(context,rl);
				}
				if(getId() == getID("contact_name","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetListContactsTitleColor(context,rl);
				}
				if(getId() == getID("contact_message","id")){
					rl = (TextView) findViewById(getID("message_sender","id"));
					Navisha.SetListContactsSubtitleColor(context,rl);
				}
				if(getId() == getID("profile_mood","id")){
					initGB();
				}				
			}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
	
	
	public void initGB()
{}
		
	}
