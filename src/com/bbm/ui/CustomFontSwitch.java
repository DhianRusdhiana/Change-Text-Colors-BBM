package com.bbm.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Switch;
import android.content.*;
import android.preference.*;
import com.bbm.ui.GeneralSwitch;
/*
 * Failed to analyse overrides
 */
public class CustomFontSwitch
extends GeneralSwitch {
	
	public static SharedPreferences sp;
	public static String font;
    public CustomFontSwitch(Context context) {
        super(context);
		sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontSwitch(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

}

