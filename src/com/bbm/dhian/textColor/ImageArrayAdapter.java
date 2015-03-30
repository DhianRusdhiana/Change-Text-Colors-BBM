package com.bbm.dhian.textColor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;

public class ImageArrayAdapter extends ArrayAdapter<CharSequence> {
	private int index = 0;
	private int[] resourceIds = null;

	public ImageArrayAdapter(Context context, int textViewResourceId,CharSequence[] objects, int[] ids, int i) {
		super(context, textViewResourceId, objects);
		index = i;
		resourceIds = ids;
	}
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = ((Activity)getContext()).getLayoutInflater();
		View row = inflater.inflate(getID("list_item_notification","layout"), parent, false);
		ImageView imageView = (ImageView)row.findViewById(getID("image","id"));
		imageView.setImageResource(resourceIds[position]);
		imageView.setSelected(true);
		CheckedTextView checkedTextView = (CheckedTextView)row.findViewById(getID("check","id"));
		checkedTextView.setText(getItem(position));
		if (position == index) {
			checkedTextView.setChecked(true);
		}
	return row;
	}
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}
	}
