package com.bbm.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import android.content.*;
import android.preference.*;
import com.bbm.dhian.textColor.*;
import com.bbm.ui.GeneralTextColor;

/*
 * Failed to analyse overrides
 */
public class CustomFontTextView
extends GeneralTextColor {
	
	public static SharedPreferences sp;
	public static String font;
    public CustomFontTextView(Context context) {
        super(context);
		if(!Navisha.getBooleanFromkey("backfontstyle",context)){
		sp = PreferenceManager.getDefaultSharedPreferences(getContext());
		font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));
		
    }else{
		this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), "fonts/DroidSans.ttf"));
	}}

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if(!Navisha.getBooleanFromkey("backfontstyle",context)){
			sp = PreferenceManager.getDefaultSharedPreferences(getContext());
			font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
			this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));

		}else{
			this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), "fonts/DroidSans.ttf"));
		}}

    public CustomFontTextView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        if(!Navisha.getBooleanFromkey("backfontstyle",context)){
			sp = PreferenceManager.getDefaultSharedPreferences(getContext());
			font = sp.getString("preference_font_face", "fonts/DroidSans.ttf");
			this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), font));

		}else{
			this.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), "fonts/DroidSans.ttf"));
		}}

}

