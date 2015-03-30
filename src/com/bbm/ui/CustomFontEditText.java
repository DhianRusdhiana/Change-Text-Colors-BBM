package com.bbm.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.content.*;
import android.preference.*;

/*
 * Failed to analyse overrides
 */
public class CustomFontEditText
extends EditText {
	
	public static SharedPreferences sp;
	public static String font;
    public CustomFontEditText(Context context) {
        super(context);
		sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

}

