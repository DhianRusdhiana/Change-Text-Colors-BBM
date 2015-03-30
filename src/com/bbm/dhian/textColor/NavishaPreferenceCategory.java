package com.bbm.dhian.textColor;

import android.content.Context;
import android.graphics.Color;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NavishaPreferenceCategory extends PreferenceCategory {

	public NavishaPreferenceCategory(Context context) {
		super(context);
	}

	public NavishaPreferenceCategory(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public NavishaPreferenceCategory(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


    /**
     * We catch the view after its creation, and before the activity will use it, in order to make our changes
     * @param parent
     * @return
     */
	@Override
	protected View onCreateView(ViewGroup parent) {
        // And it's just a TextView!
		TextView categoryTitle =  (TextView)super.onCreateView(parent);
		categoryTitle.setBackgroundColor(0x40000000);
		categoryTitle.setTextColor(Color.RED);
		

        return categoryTitle;
	}
}
