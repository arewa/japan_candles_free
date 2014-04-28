package com.jcandles.free.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.jcandles.free.R;
import com.jcandles.free.adapter.ListArrayAdapter;
import com.jcandles.free.ads.AdsSettings;
import com.jcandles.free.eula.Eula;
import com.smaato.soma.BannerView;

public class MainActivity extends ListActivity {
	
	private BannerView mBanner;
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		
		String[] values = new String[] { 
				getString(R.string.list_hammer),
				getString(R.string.list_hanging_man),
				getString(R.string.list_bullish_engulfing),
				getString(R.string.list_bearish_engulfing),
				getString(R.string.list_dark_cloud_cover),
				getString(R.string.list_piercing_pattern),
				getString(R.string.list_morning_star),
				getString(R.string.list_evening_star),
				getString(R.string.list_abandoned_baby),
				getString(R.string.list_belt_hold_line),
				getString(R.string.list_advance_block),
				getString(R.string.list_harami),
				getString(R.string.list_harami_cross),
				getString(R.string.list_inverted_hammer),
				getString(R.string.list_mat_hold_pattern),
				getString(R.string.list_one_neck_line),
				getString(R.string.list_shooting_star),
				getString(R.string.list_stalled_pattern),
				getString(R.string.list_tasuki_gaps),
				getString(R.string.list_three_crows),
				getString(R.string.list_three_methods),
				getString(R.string.list_window),
		};
		ListArrayAdapter adapter = new ListArrayAdapter(this, values);
		setListAdapter(adapter);
		
		Eula.show(this);
		
		mBanner = (BannerView)findViewById(R.id.banner1);
		mBanner.getAdSettings().setPublisherId(AdsSettings.publisherId);
		mBanner.getAdSettings().setAdspaceId(AdsSettings.adspaceId);
		mBanner.setAutoReloadEnabled(true);
		mBanner.asyncLoadNewBanner();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(this, ViewDetailsActivity.class);
		intent.putExtra("CHAPTER", new Integer(position));
		startActivity(intent);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mBanner.setAutoReloadEnabled(true);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mBanner.setAutoReloadEnabled(false);
	}
}