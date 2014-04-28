package com.jcandles.free.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcandles.free.R;

public class ListArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public ListArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_row, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_row, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
		
		if (position == 0) {
			imageView.setImageResource(R.drawable.ic_hammer);
		} else if (position == 1) {
			imageView.setImageResource(R.drawable.ic_hanging_man);
		} else if (position == 2) {
			imageView.setImageResource(R.drawable.ic_bullish_engulfing);
		} else if (position == 3) {
			imageView.setImageResource(R.drawable.ic_bearish_engulfing);
		} else if (position == 4) {
			imageView.setImageResource(R.drawable.ic_dark_cloud_cover);
		} else if (position == 5) {
			imageView.setImageResource(R.drawable.ic_piercing_pattern);
		} else if (position == 6) {
			imageView.setImageResource(R.drawable.ic_morning_star);
		} else if (position == 7) {
			imageView.setImageResource(R.drawable.ic_evening_star);
		} else if (position == 8) {
			imageView.setImageResource(R.drawable.ic_abandoned_baby);
		} else if (position == 9) {
			imageView.setImageResource(R.drawable.ic_belt_hold_line);
		} else if (position == 10) {
			imageView.setImageResource(R.drawable.ic_advance_block);
		} else if (position == 11) {
			imageView.setImageResource(R.drawable.ic_harami);
		} else if (position == 12) {
			imageView.setImageResource(R.drawable.ic_harami_cross);
		} else if (position == 13) {
			imageView.setImageResource(R.drawable.ic_inverted_hammer);
		} else if (position == 14) {
			imageView.setImageResource(R.drawable.ic_mat_hold_pattern);
		} else if (position == 15) {
			imageView.setImageResource(R.drawable.ic_one_neck_line);
		} else if (position == 16) {
			imageView.setImageResource(R.drawable.ic_shooting_star);
		} else if (position == 17) {
			imageView.setImageResource(R.drawable.ic_stalled_pattern);
		} else if (position == 18) {
			imageView.setImageResource(R.drawable.ic_tasuki_gaps);
		} else if (position == 19) {
			imageView.setImageResource(R.drawable.ic_three_crows);
		} else if (position == 20) {
			imageView.setImageResource(R.drawable.ic_three_methods);
		} else if (position == 21) {
			imageView.setImageResource(R.drawable.ic_window);
		}

		return rowView;
	}
}
