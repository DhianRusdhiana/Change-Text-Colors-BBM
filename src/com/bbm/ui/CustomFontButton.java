package com.bbm.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.content.*;
import android.preference.*;
import com.bbm.ui.GeneralButton;

/*
 * Failed to analyse overrides
 */
public class CustomFontButton
extends GeneralButton {
	
	public static SharedPreferences sp;
	public static String font;
    public CustomFontButton(Context context) {
        super(context);
		sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

    public CustomFontButton(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }

}

