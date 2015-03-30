package com.bbm.dhian.textColor;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.ListAdapter;

public class NotificationListPreference extends ListPreference {
	private int[] resourceIds = null;

	public NotificationListPreference(Context context, AttributeSet attrs) {
		super(context, attrs);
		int[] r4_int_A = new int[1];
		r4_int_A[0] = getID("entryImages", "attr");
		TypedArray typedArray = context.obtainStyledAttributes(attrs,r4_int_A);
		String[] imageNames = context.getResources().getStringArray(typedArray.getResourceId(typedArray.getIndexCount()-1, -1));
		resourceIds = new int[imageNames.length];
		for (int i=0;i<imageNames.length;i++) {
			String imageName = imageNames[i].substring(imageNames[i].indexOf('/') + 1,imageNames[i].lastIndexOf('.'));
			resourceIds[i] = context.getResources().getIdentifier(imageName,null, context.getPackageName());
		}
		typedArray.recycle();
	}
	protected void onPrepareDialogBuilder(Builder builder) {
		int index = findIndexOfValue(getSharedPreferences().getString(getKey(), "1"));
		ListAdapter listAdapter = new ImageArrayAdapter(getContext(),getID("list_item_notification","layout"), getEntries(), resourceIds, index);
		builder.setAdapter(listAdapter, this);
		super.onPrepareDialogBuilder(builder);
	}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
	}
